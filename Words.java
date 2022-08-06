// Maximum Number of Words Found in Sentences
class Words {
    public int mostWordsFound(String[] sentences) {
        int sum = 0, ans = 0;
        String str = "";
        for (int i = 0; i < sentences.length; i++) {
            sum = 0;
            str = sentences[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ')
                    sum++;
            }
            if (sum > ans)
                ans = sum;
        }
        return (ans + 1);
    }
}