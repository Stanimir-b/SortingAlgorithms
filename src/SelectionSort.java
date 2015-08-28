import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr1={45,4,2,236,-7,1,88,13,34};
        int[] arr2=sortNumbers(arr1);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] sortNumbers(int[] array){
        for (int i=0;i<array.length-1;i++){
            int index=i;
            for (int j = i+1; j < array.length; j++) {
                index=i;
                if (array[j]<array[index]){
                    index=j;
                }
                if (index!=i){
                    int smallerNumber=array[index];
                    array[index]=array[i];
                    array[i]=smallerNumber;
                }
            }
        }
        return array;
    }
}