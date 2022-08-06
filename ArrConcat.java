//Concatenation of Array
class ArrConcat {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ar[] = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                ar[i] = nums[i];
            } else {
                ar[i] = nums[i - n];
            }
        }
        return (ar);
    }
}