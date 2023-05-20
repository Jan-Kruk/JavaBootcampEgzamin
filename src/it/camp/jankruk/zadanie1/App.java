package it.camp.jankruk.zadanie1;

public class App {
    public static void main(String[] args) {
        System.out.println(Cook(1,3,1));
        System.out.println();
        System.out.println(Cook(5,3,3));
        System.out.println();
        System.out.println(Cook(1,10,20));
    }
    public static String Cook(int apple, int orange, int cash){
        if (cash==0){
            System.out.println("Ilość jabłek: "+apple);
            System.out.println("Ilość pomarańczy: "+orange);
            return "Minimalna różnica: " +Math.abs(apple-orange);
        }
        else if(orange>=apple){
            return Cook(apple+1,orange,cash-1);
        }else{
            return Cook(apple,orange+1,cash-1);
        }
    }
}


