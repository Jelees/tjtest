package ex01;

import java.util.HashMap;
import java.util.HashSet;

public class Collection01 {
        public static void main(String[] args) {
          HashMap<String, String> map = new HashMap<>();
          map.put("one","하나");
          map.put("two","둘");
          map.put("three","셋");

            System.out.println(map.get("one"));
            System.out.println(map.get("two"));
            System.out.println(map.get("three"));
        }
}
