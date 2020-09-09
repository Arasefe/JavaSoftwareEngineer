package javabasicconcepts;

public class PoundToKilogram {
    public static void main(String[] args) {
        double numberOfPounds=poundToKilogramConverter(234);
        System.out.println(numberOfPounds);


    }
    public static double poundToKilogramConverter(int numberOfPounds){
        float pound=0.45359237f;
        double kilogram=numberOfPounds*pound;
        return kilogram;
    }
}
