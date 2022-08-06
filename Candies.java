// Kids With the Greatest Number of Candies
class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                list.add(true);
            else
                list.add(false);
        }
        return (list);
    }
}