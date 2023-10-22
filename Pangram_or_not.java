public class Pangram_or_not {
    public static void main(String[] args) {
        String input = "Pack my box with five dozen liquor jugs";
        boolean isPangram = isPangram(input);
        System.out.println(isPangram);
    }

    public static boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
