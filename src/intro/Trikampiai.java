package intro;

public class Trikampiai {

    public static void main(String[] args){

        int a = 3;
        int b = 4;
        int c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("trikampis");
            if (a == b && b == c) {
                System.out.println("lygiakrastis");
            } else if (a == b || b == c || c == a) {
                System.out.println("lygiasonis");
            } else if (a * a == (b * b) + (c * c) || b * b == (c * c) + (a * a) || c * c == (a * a) + (b * b)) {
                System.out.println("status");
            }


        }


        int p = (a + b + c) / 2;

        double plotas = (Math.sqrt (p * (p - a) * (p - b) * (p - c)));

        System.out.println("Plotas=" + plotas);

    }
}
