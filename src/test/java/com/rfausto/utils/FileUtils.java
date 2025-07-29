package com.rfausto.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {

    public static String lerArquivoComoString(String caminhoRelativo) {
        try {
            return Files.readString(Paths.get(caminhoRelativo));
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo: " + caminhoRelativo, e);
        }
    }


}
