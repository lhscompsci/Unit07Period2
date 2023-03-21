import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = new int[10];
        ArrayList<Integer> listOfNums = new ArrayList<>();
        System.out.println(listOfNums);
        System.out.println(listOfNums.size());
        listOfNums.add(45);
        listOfNums.add(37);
        listOfNums.add(842);
        System.out.println(listOfNums);
        System.out.println(listOfNums.size());
        listOfNums.remove(1); //must be a legal value
        System.out.println(listOfNums);
        System.out.println(listOfNums.get(0));
        for(int i = 0; i<27; i++){
            listOfNums.add((int)(Math.random()*12-5));
        }
        System.out.println(listOfNums);
        System.out.println(listOfNums.set(5,72));
        System.out.println(listOfNums);
        Collections.sort(listOfNums);
        System.out.println(listOfNums);
        for( Integer item: listOfNums){
            System.out.println(item);
        }
    }
}