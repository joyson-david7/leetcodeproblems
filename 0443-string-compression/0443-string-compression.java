class Solution {
    public int compress(char[] chars) {

        int n = chars.length;

        if (n == 0)
            return 0;

        String res = "";
        int count = 1;
        char current = chars[0];

        for (int i = 1; i < n; i++) {

            if (chars[i] != current) {
                res += current;

                if (count != 1)
                    res += count;

                current = chars[i];
                count = 1;
            } else {
                count++;
            }
        }

        res += current;

        if (count != 1)
            res += count;
            for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }

        return res.length();
    }
}