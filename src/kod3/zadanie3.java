package kod3;

public class zadanie3 {
    public static void main(String [] args){
        int a = 4;
        int square1 = (int) Math.pow(a,2);
        System.out.println("Площадь заданного квадрата "+square1);
        int radius2 = a/2;
        double a2 = radius2/(Math.sqrt(2));
        double square2 = Math.pow(a2,2);
        System.out.println("Площадь вписанного квадрата "+square2);
        double difference = square1/square2;
        System.out.println("Площадь вписанного квадрата меньше площади заданного в "+difference+" раз");

    }
}
