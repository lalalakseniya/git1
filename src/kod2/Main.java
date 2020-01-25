package kod2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println(" Input year and month");
        int year = in.nextInt();
        int month = in.nextInt();
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if(year % 4==0){
                    days=29;
                }
                else days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        System.out.println("Количество дней "+days);
    }
}