package intro;

public class PirminiaiSkaiciai {

    public static void main(String[] args) {

        int i = 0;
        int num = 0;
        int j= 0;
        String primeNumbers = "";
        int [] a = {5,6,10, 15, 8, 4};
        for (i = a [j]; i <= a.length; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers  are :");
        System.out.println(primeNumbers);
    }
}
