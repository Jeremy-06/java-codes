public class triangle {
    public static void main(String[] args) {
        for (int i = 30; i > 0; i -= 2) {
            for (int j = 0; j < 30; j++) {
                if (j > i) {
                    System.out.print("**");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
// *
//