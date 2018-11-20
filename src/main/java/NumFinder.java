public class NumFinder {

    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        for (int n : nums) {
            if (n < smallest) smallest = n;
            if (n > largest) largest = n;
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }

}
