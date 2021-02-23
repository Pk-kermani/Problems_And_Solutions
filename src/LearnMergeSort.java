public class LearnMergeSort {

    public static void main(String[] args) {
        int[] A= {6,2,4,0,1};
        LearnMergeSort.printArray(LearnMergeSort.doMergeSort(A));

    }


    /**
     * Helper methods to print the array
     * @param array
     */
    private static void printArray(int [] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] doMergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

//      Splits array into two halves:
        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right = new int[array.length - midpoint];

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < array.length - midpoint; j++) {
            right[j] = array[midpoint + j];
        }
        int[] result = new int[array.length];

        left = doMergeSort(left);
        right = doMergeSort(right);

        result = doMerge(left, right);
        return result;
    }



    public static int[] doMerge(int[] left, int[] right){
        int[] result = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;

        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                result[k]=left[i];
                i++;
            }else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        return result;


    }




}
