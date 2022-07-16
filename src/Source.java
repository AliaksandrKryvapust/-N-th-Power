public class Source {
    public static void main(String[] args) {
      int[] arr =  new int[] {1,2};
      int index = 2;
        System.out.println(nthPower(arr,index)==-1);
    }
    public static int nthPower(int[] array, int n) {
        return (n>= array.length)? -1 : (int) Math.pow(array[n], n);
    }
}
