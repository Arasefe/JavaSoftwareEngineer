package javabasicconcepts;

public class UnderFlow {
    public static void main(String[] args) {
        byte max=Byte.MAX_VALUE;
        byte min=Byte.MIN_VALUE;

        System.out.println("Min value is "+min);
        System.out.println("Max value is "+max);
        System.out.println("The busted max value is "+(min+1));
        System.out.println("The busted min value is "+(byte)(min-1));
    }
}
