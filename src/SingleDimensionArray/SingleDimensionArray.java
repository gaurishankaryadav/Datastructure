package SingleDimensionArray;


public class SingleDimensionArray {

    int[] arr;

    public SingleDimensionArray(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

   
    public void insertion(int index, int value) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("The value is inserted.");
            } else {
                System.out.println("The block is already filled.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index.");
        }
    }

    public void traversal() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void searching(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("The value is present at index: " + i);
                return;
            }
        }
        System.out.println("The value is not present.");
    }

    public void deletion(int location) {
        try {
            if (arr[location] != Integer.MIN_VALUE) {
                System.out.println("The value " + arr[location] + " is deleted.");
                arr[location] = Integer.MIN_VALUE;
            } else {
                System.out.println("The location is already empty.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid location.");
        }
    }

}
