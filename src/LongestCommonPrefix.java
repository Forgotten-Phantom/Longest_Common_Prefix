public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String string1 = strs[i];
            int k = 0;

            while (k < prefix.length() && k < string1.length() && prefix.charAt(k) == string1.charAt(k))
                k++;

            prefix = prefix.substring(0, k);

            if (prefix == "")
                return "";
        }

        return prefix;
    }
}
