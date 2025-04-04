public class VariableArrayTester {
    public static void main(String[] args) {
        int[] array1 = {5, 10, 2, 0, 3};
        int[] array2 = {12, 45, 98, 23, 56, 87, 34, 76, 5, -3};
        int[] array3 = {45, 12, 85, 32, 89, 39, 69, 44, -5, -1, 6, 10};

        System.out.println("Max in array 05 : " + VariableArray.maxInArray(array1));
        System.out.println("Max in array 10 : " + VariableArray.maxInArray(array2));
        System.out.println("Max in array 12 : " + VariableArray.maxInArray(array3));
        
        System.out.println("Min in array 05 : " + VariableArray.minInArray(array1));
        System.out.println("Min in array 10 : " + VariableArray.minInArray(array2));
        System.out.println("Min in array 12 : " + VariableArray.minInArray(array3));
    }
}
