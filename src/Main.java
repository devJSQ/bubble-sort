public class Main {

  public static void main(String[] args) {
      int[] array = {4, 3, 78, 2, 0, 2};
      bubbleSort(array);
      
      for(int num : array) {
          System.out.print(num + " ");
      }
  }

  public static void bubbleSort(int[] array) {
      int n = array.length;
      boolean swapped;

      for (int i = 0; i < n - 1; i++) {
          swapped = false;

          for (int j = 0; j < n - i - 1; j++) {
              if (array[j] > array[j + 1]) {
                  int temp = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = temp;
                  swapped = true;
              }
          }

          if (!swapped) {
              break;
          }
      }
  }
}
