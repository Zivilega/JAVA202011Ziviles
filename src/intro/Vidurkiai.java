package intro;

public class Vidurkiai {
    public static void main(String[] args) {
        int skaiciai[] = {8, 5, 3};
        double total = 0;

        for (int i = 0; i < skaiciai.length; i++) {
            total = total + skaiciai[i];
        }


        /* arr.length returns the number of elements
         * present in the array
         */
        double average = total / skaiciai.length;


        /* This is used for displaying the formatted output
         * if you give %.4f then the output would have 4 digits
         * after decimal point.
         */
        System.out.format("The average skaiciai is: %.5f", average);
    }

}
