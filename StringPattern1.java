public class StringPattern1 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        // System.out.println(haystack.indexOf(pattern));
        int len1 = haystack.length();
        int len2 = needle.length();
        int flag = 0;
        for (int i = 0; i <= (len1 - len2); i++) {// i loop is representing sadbutsad
            int j = 0;
            for (j = 0; j < len2; j++) {// j loop is representing sad
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == len2) {
                System.out.println("String is matched at index: " + i);
                flag++;
                break;// is used to print only first index
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }
    }

}

/*
 * output:
 * String is matched at index 0
 */
