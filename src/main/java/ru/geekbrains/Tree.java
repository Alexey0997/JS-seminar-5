package ru.geekbrains;

import java.io.File;

/**
 * Класс Tree реализует метод вывода на печать директорий и файлов корневой системы.
 */
public class Tree {

    /**
     * print - метод вывода на печать директорий и файлов.
     * @param file   - файл.
     * @param indent - отступ.
     * @param isLast - признак окончательной директории (флаг поднят/опущен).
     */
    public static void print(File file, String indent, boolean isLast) {

        System.out.print(indent);          // Печать отступа.
        if (isLast) {                      // Создаем окончательную директорию.
            System.out.print("└─");        // Отрисовка символов, обозначающих окончательную директорию.
            indent += "  ";                // Печать отступа.
        } else {                           // Отрисовка промежуточной директории.
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files == null) {
            return;
        }


        int subDirTotal = 0;                // Печать директорий.
        for (File value : files) {
            if (value.isDirectory()) {
                subDirTotal++;
            }
        }
        int subDirCounter = 0;
        for (File value : files) {
            if (value.isDirectory()) {
                subDirCounter++;
                print(value, indent, subDirCounter == subDirTotal);
            }
        }

        int subFileTotal = 0;                // Печать файлов.
        for (File value : files) {
            if (value.isFile()) {
                subFileTotal++;
            }
        }
        int subFileCounter = 0;
        for (File value : files) {
            if (value.isFile()) {
                subFileCounter++;
                print(value, indent, subFileCounter == subFileTotal);
            }
        }
    }
}


