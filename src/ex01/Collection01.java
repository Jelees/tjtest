package ex01;

import java.util.*;


public class Collection01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(40);
        arrList.add(30);
        arrList.add(20);
        arrList.add(10);

        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i)+ " ");
        }
        arrList.remove(1);

        for (int e : arrList){
            System.out.print(e + " ");
        }

        System.out.println();

        Collections.sort(arrList);
        Iterator<Integer> iter = arrList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }

    }
}
