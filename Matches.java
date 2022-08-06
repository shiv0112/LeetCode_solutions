// Count of Matches in Tournament

class Matches {
    public int numberOfMatches(int n) {
        int c = 0, m = 0, num = n;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                m = num;
            } else {
                m = (num - 1) / 2;
                num = (num - 1) / 2 + 1;
            }
            c += m;
        }
        return (c);
    }
}