package javabasicconcepts;

public class OverFlow {
    public static void main(String[] args) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("The max int value is "+max);
        System.out.println("The min int value is "+min);
        System.out.println("The busted max value is "+(max+1));
        System.out.println("The busted min value is "+(min-1));


    }
}
