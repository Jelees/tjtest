package test;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        File F1 = new File("d://program files//intro.dat");
        File F2 = new File("d://program files//intro.dat");
        File F3 = new File("d://program files//basic.dat");

        if(F1.compareTo(F2) == 0){
            System.out.println("F1과 F2의 경로는 동일합니다...");
        } else {
            System.out.println("F1과 F2의 경로는 같지 않습니다.");
        }
        if(F2.compareTo(F3) == 0){
            System.out.println("F2과 F3의 경로는 동일합니다...");
        } else {
            System.out.println("F2과 F3의 경로는 같지 않습니다.");
        }
        if(F3.compareTo(F1) == 0){
            System.out.println("F3과 F1의 경로는 동일합니다...");
        } else {
            System.out.println("F3과 F1의 경로는 같지 않습니다.");
        }
    }
}
