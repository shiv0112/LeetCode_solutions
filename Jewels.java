// Jewels and Stones

class Jewels {
    public int numJewelsInStones(String jewels, String stones) {
        char ch = ' ';
        int sum = 0;
        for (int i = 0; i < jewels.length(); i++) {
            ch = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == ch)
                    sum++;
            }
        }
        return (sum);
    }
}