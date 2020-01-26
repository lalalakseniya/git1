package kod3;

public class zadanie3 {
    public static void main(String [] args){
        int a=4;
        int square1=a*a;
        System.out.println("Площадь заданного квадрата "+square1);
        int r2=a/2;
        double a2=r2/(Math.sqrt(2));
        double square2=a2*a2;
        System.out.println("Площадь вписанного квадрата "+square2);
        int difference = (int) (square1/square2);
        System.out.println("Площадь вписанного квадрата меньше площади заданного в "+difference+" раз");

    }
}
