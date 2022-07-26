public class ArrayDemo {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5},{7}};
        //int mat [][] = new int [2][3];
        for(int i = 0;i<mat.length;i++){
            for(int j=0; j<mat[i].length;j++){
                System.out.print(mat[i][j]);

            }
            System.out.println();
        }



      //  int [] xx={};
        //System.out.println(xx.length);
      /*  int arr[] = {1, 2, 3};
        System.out.println("Original Array before passing");
        printArray(arr);
        CheckChange(arr);
        System.out.println("\n Original Array after passing");
        printArray(arr);
    }

    public static void CheckChange(int arr1[]) {
        arr1 = new int[3];
        arr1[1] = 7;
        System.out.println("\n Modified Array");
        printArray(arr1);

    }

    public static void printArray(int arr2[]) {
        for (int i : arr2) {
            System.out.print(i + "");
        }*/
    }
}
