package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)  {
        try {
            //FileInputStream fs = new FileInputStream("C://Users/BS943/Desktop/JavaFile.txt");
//            String st = "Java how to program book\n decorator design pattern";
            Path path = Paths.get("C:\\Users\\BS943\\Desktop\\javaFileSession.txt");
//            boolean isExists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
//            System.out.println(isExists);
//            System.out.println(Files.isSameFile(path, path));
//            BufferedReader r = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);
//            String s;
//            do {
//                s = r.readLine();
//                System.out.println(s);
//            }while (s != null);
//            BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.ISO_8859_1);
//            writer.append("haha");
//            BufferedReader r = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);
//            String s;
//            do {
//                s = r.readLine();
//                System.out.println(s);
//            }while (s != null);
            Files.createFile(path);
            System.out.println(Files.exists(path, LinkOption.NOFOLLOW_LINKS));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
