// How Many Numbers Are Smaller Than the Current Number

class Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ar[] = new int[nums.length];
        int s = 0;
        for (int i = 0; i < ar.length; i++) {
            s = 0;
            for (int j = 0; j < ar.length; j++) {
                if (nums[i] > nums[j] && j != i)
                    s++;
            }
            ar[i] = s;
        }
        return (ar);
    }
}