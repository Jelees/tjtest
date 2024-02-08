package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:/out.txt"));
        while(true){
            String line = br.readLine();
            if(line == null ) break;
            System.out.println(line);
        }
        br.close();
    }
}
