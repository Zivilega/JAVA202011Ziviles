package intro;

public class Rusiavimas {

    public static void main(String[] args){
        int [] intArray = {-10, 0, 2, 9, -5};


        int temp = 0;


        for (int i = 0; i <intArray.length; i++) {
//            System.out.println(intArray[i]+"");
            for (int j = i+1; j <intArray.length; j++) {
//                System.out.println(intArray[j]+"");
                if(intArray[i] <intArray[j]) {      //swap elements if not in order
                    temp = intArray[i];
//                    System.out.println(temp);
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        //print sorted array
        System.out.println("Array sorted in descending order: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }



    }
}


