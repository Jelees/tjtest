package ex01;

class MyArrayAlg{
    public static < T extends Comparable > T getMax(T[] a){
        if(a == null || a.length == 0){
            return null;
        }
        T lagest = a[0];
        for (int i = 1; i < a.length ; i++) {
            if(lagest.compareTo(a[i])<0){
                lagest = a[i];
            }
        }
        return lagest;
    }
}

public class MyArrayAlg2Test {
    public static void main(String[] args) {
        String[] list = {"abc","def","xyz"}; //문자열 값을 비교하면 xyz의 아스키값이 가장 크기때문에 xyz가 출력
        String max = MyArrayAlg.getMax(list);
        System.out.println(max);
    }
}
