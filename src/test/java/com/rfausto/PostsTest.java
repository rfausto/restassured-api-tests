package com.rfausto;

import com.rfausto.utils.FileUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostsTest {

    @BeforeEach
    public void setup(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void deveRetornarPostPorId(){
        given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", notNullValue())
                .body("title", not(emptyString()));
        ;
    }

    @Test
    public void deveAtualizarPost() throws IOException {
        String payload = FileUtils.lerArquivoComoString("src/test/resources/payloads/posts/atualizar_post.json");

        given()
                .contentType("application/json")
                .body(payload)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("Título Atualizado"))
                .body("body", equalTo("Descrição Atualizada"))
                ;
    }

    @Test
    public void deveCriarNovoPost() throws Exception {
        String payload = FileUtils.lerArquivoComoString("src/test/resources/payloads/posts/criar_post.json");

        given()
                .contentType("application/json")
                .body(payload)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("Meu primeiro post"));
    }

    @Test
    public void deveRemoverPostPeloId() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/posts/1")
                .then()
                .log().all()
                .statusCode(anyOf(is(200), is(204)));
        ;
    }
}
