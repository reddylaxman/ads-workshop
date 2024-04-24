public class StringPattern {
    public static void main(String[] args) {
        String actual = "saidasai";
        String required = "sai";
        // System.out.println(actual.indexOf(pattern));
        int len1 = actual.length();
        int len2 = required.length();
        int flag = 0;
        for (int i = 0; i <= (len1 - len2); i++) {
            int j = 0;
            for (j = 0; j < len2; j++) {
                if (actual.charAt(i + j) != required.charAt(j)) {
                    break;
                }
            }
            if (j == len2) {
                System.out.println("String is matched at index " + i);
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }
    }

}

/*
 * output:
 * String is matched at index0
 * String is matched at index5
 */