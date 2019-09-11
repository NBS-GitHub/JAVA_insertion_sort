public class Main {
   public static void main(String[] args) {

      int[] arr = {34, 62, 12, -4, 95, 6, -54};

      int[] sortedArr = sort(arr);

      for(int i: sortedArr)
         System.out.print(i + " ");

   }

   private static int[] sort(int[] arr) {
      int key;
      int temp;

      for(int i=1; i<arr.length; i++) {
         key = arr[i];
         int j = i - 1;

         while(j >= 0 && key < arr[j]) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            j--;
         }
      }

      return arr;
   }

}
