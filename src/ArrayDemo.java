class ArrayDemo
{
    public static void main (String[] args)
    {
        int[] arr;
        // declares an Array of integers.
        arr = new int[10]; // allocating memory for 5 integers.
        arr[0] = 10; // initialize the first elements of the array
        arr[1] = 20; // initialize the second elements of the array
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
// accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element at index ");
            System.out.print(i);
            System.out.println(" : ");
            System.out.println(arr[i]);
        }
    }
}

//class ArrayDemo {
//    public static void main (String[] args) {
//        int[] arr;
//        // declares an Array of integers.
//        arr = new int[10]; // allocating memory for 10 integers.
//        arr[0] = 10; // initialize the first elements of the array
//        arr[1] = 20; // initialize the second elements of the array
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        // accessing the elements of the specified array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Element at index "); // Part 1
//            System.out.print(i);                   // Part 2 (index)
//            System.out.print(" : ");               // Part 3
//            System.out.println(arr[i]);            // Part 4 (element value)
//        }
//    }
//}
