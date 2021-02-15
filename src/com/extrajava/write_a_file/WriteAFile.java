package com.extrajava.write_a_file;

/**
 * Запись строки в текстовый файл
 * @autor EvgeniiTiurin
 * @version 1.1
 */

import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("out/Foo.txt");
            writer.write("Привет, ФУ!!!");
            writer.close();
        } catch (IOException ex) { ex.printStackTrace(); }
    }
}
