package ArrayList;
import java.util.ArrayList;
public class DynamicArray<I extends Number> {
    public static void main(String[] args){
       ArrayList<Integer> number = new ArrayList<>();

       for(int i =0; i<10; i++){
           number.add(i);
       }
       for(int num : number){
           System.out.println(num);

       }



    }

    private void add(I i) {
    }
}
