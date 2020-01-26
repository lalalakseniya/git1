public class zadanie4 {

    static boolean press(int ABCD[]) {
        int c = 0;
        for (int i = 0; i < 4; i++) {
            if (ABCD[i] % 2 == 0 && ABCD[i] != 0)
                c++;
        }
        if (c >= 2) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        int ABCD[] = new int[4];
        for (int i = 0; i < 4; i++) {
            ABCD[0] = 12;
            ABCD[0] = 31;
            ABCD[0] = 55;
            ABCD[0] = 100;

        }
    }
}
