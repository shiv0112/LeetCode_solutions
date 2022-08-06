// Maximum Nesting Depth of the Parentheses

class DepthParanthesis {
    public int maxDepth(String s) {
        int c = 0, max = 0;
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(')
                c++;
            if (ch == ')')
                c--;
            if (max < c)
                max = c;
        }
        return (max);
    }
}