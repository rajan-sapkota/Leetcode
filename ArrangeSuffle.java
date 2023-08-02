public class ArrangeSuffle {
    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online

    static String restoreString(String s, int[] indices) {
        String fin = "";
        char[] word = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            word[indices[i]] = s.charAt(i);

        }
        for (char c : word) {
            fin += c;
        }
        return fin;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 0, 1, 2 };
        String word = "leapp";
        System.out.print(restoreString(word, arr));
    }
}
