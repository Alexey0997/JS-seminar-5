package ru.geekbrains;

import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nРЕЗЕРВНОЕ КОПИРОВАНИЕ ФАЙЛОВ\n");
        BackUpper backUpper = new BackUpper();
        backUpper.filesBackUpper(Path.of("."));

        System.out.println("\nПЕЧАТЬ ДЕРЕВА ДИРЕКТОРИЙ И ФАЙЛОВ\n");
        Tree.print(new File("."), "", true); // Вызываем метод вывода на печать.
    }
}