package Arrays;

public class Exercise {
    public static void main(String[] args){
        int[] numbers = new int[10];

        for(int i=0; i<numbers.length; i++){
            numbers[i]= i + 1;

            System.out.println(i);

        }
        for(int num:numbers){
            System.out.println(num);
        }


    }


}
