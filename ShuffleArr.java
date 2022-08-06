// Shuffle the Array
class ShuffleArr {
    public int[] shuffle(int[] nums, int n) {
        int ar[] = new int[2 * n];
        int c = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            ar[i] = nums[c];
            ar[i + 1] = nums[c + n];
            c++;
        }
        return (ar);
    }
}