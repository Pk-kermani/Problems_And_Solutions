public class FindGreatestNumber {
    // Given Three Numbers are 35,78,87 . Find out Greatest Number.
    private transient int version=1;

    public static void main(String[] args) {
        FindGreatestNumber.checkGreatestNumber();
        System.out.println(FindGreatestNumber.largest(88,98,65));
        String name=null;

    }

    public static void checkGreatestNumber(){
        int maxVal = 0;
        int val1 = 35;
        int val2 = 78;
        int val3 = 87;
        if (val1 > val2 && val1 > val3) {
            maxVal = val1;
        } else if (val2 > val1 && val2 > val3) {
            maxVal = val2;
        } else if (val3 > val1 && val3 > val2) {
            maxVal = val3;
        }
        System.out.println("Greatest Number is :"+maxVal);

    }

    public static double largest(double x, double y, double z){
        return Math.max(Math.max(x,y),z);
    }

}
