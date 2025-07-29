# 🚀 Automação de API com Java e RestAssured

Este projeto tem como objetivo demonstrar a automação de testes para uma API pública utilizando Java e RestAssured. Foram implementados testes para as principais operações (`GET`, `POST`, `PUT` e `DELETE`) sobre a funcionalidade **Posts** da API [JSONPlaceholder](https://jsonplaceholder.typicode.com/).

---

## 🧪 Funcionalidades testadas

- Consultar post por ID (`GET`)
- Criar novo post (`POST`)
- Atualizar post existente (`PUT`)
- Remover post pelo ID (`DELETE`)

---

## 🔧 Tecnologias utilizadas

- **Java 17+**
- **RestAssured**
- **JUnit 5**
- **Maven**
- API: [JSONPlaceholder](https://jsonplaceholder.typicode.com/)

---

## ▶️ Como executar os testes

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
2. Acesse o diretório do projeto
   ```bash
   cd seu-repositorio
3. Execute os testes com o Maven
   ``` bash
   mvn test