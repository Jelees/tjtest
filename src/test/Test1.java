package test;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("FileClass.txt");
        if(file.mkdir()){
            System.out.println("파일이 새로운 디렉터리에 있습니다.");
        }
        else {
            System.out.println("파일이 동일한 디렉터리에 있습니다.");
        }
    }
}
