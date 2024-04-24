public class NaiveStringMatching {
    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);
        System.out.println("Indices of pattern occurrence in text:");
        search(text, pattern);
    }

    // Naive string-matching algorithm
    public static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            int j;

            // Check for pattern match starting at position i in the text
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Characters mismatch, move to the next position in the text
                }
            }

            // If the inner loop completed without breaking (i.e., all characters matched)
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}

/*
output:-
Text: AABAACAADAABAABA
Pattern: AABA
Indices of pattern occurrence in text:
Pattern found at index 0
Pattern found at index 9
Pattern found at index 12
 */
