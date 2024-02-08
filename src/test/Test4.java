package test;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        final String fileName = "file1.txt";
        try{
            File objFile = new File(fileName);
            System.out.println("파일 경로 : " + objFile.getAbsolutePath());
            System.out.println("파일 크기 : " + objFile.length() + "bytes");
        } catch (Exception Ex){
            System.out.println("Exception : " + Ex.toString());
        }
    }

}
