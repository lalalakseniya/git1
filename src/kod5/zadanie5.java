package kod5;

public class zadanie5 {
    static int cub(int a){
        return a*a*a;
    }
    static int square(int b){
        return b*b;
    }
    public static void main(String [] args){
        int numb= 699;
        int n1=numb/100;
        int n2=numb/10%10;
        int n3=numb%10;
        int sum=n1+n2+n3;
        if(square(numb)==cub(sum)){
            System.out.println("True");
        }
        else System.out.println("False");

    }
}
