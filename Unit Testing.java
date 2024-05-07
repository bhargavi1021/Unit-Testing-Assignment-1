public class Main {
    public static void toUppercase(char[] str) {
        for (int i = 0; i < str.length; ++i) {
            if (Character.isLetter(str[i]) && Character.isLowerCase(str[i])) {
                str[i] = Character.toUpperCase(str[i]);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        char[] str = "hello world".toCharArray();
        toUppercase(str);
    }
}
