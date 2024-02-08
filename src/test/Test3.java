package test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        final String fileName = "file1.txt";
        try{
            File objFile = new File(fileName);
            if(objFile.createNewFile()){
                System.out.println("파일 생성 성공!!!");
            } else {
                System.out.println("파일 생성 실패!!!");
            }
        } catch (Exception Ex){
            System.out.println("Exception : " + Ex.toString());
        }
    }
}
