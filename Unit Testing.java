
public class Main {
    public static String toUpper(String str){
    String s = "";
    for(int i=0 ; i<str.length();i++){
        if(Character.isLowerCase(str.charAt(i))){
            s += (char)(str.charAt(i)-32);
        }
        else{
            s += str.charAt(i)+"";
        }
    }
    return s;
}
    public static boolean test_case1(String str){
        String compare="HELLO WORLD";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case2(String str){
        String compare="HELLO WORLD";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case3(String str){
        String compare="HELLO3WORLD";
        return toUpper(str).equals(compare);
    }
     public static boolean test_case4(String str){
        String compare="HELLOW32ORLD";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case5(String str){
        String compare="@#$%";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case6(String str){
        String compare="5664136";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case7(String str){
        String compare="HAI@BYE";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case8(String str){
        String compare="HELLO$%#`	`";
        return toUpper(str).equals(compare);
    }
public static void main(String[] args) {
        System.out.println(test_case1("hello world"));
        System.out.println(test_case2("HELLO WORLD"));
        System.out.println(test_case3("hello3world"));
        System.out.println(test_case4("HELLOW32ORLD"));
        System.out.println(test_case5("@#$%"));
        System.out.println(test_case6("5664136"));
        System.out.println(test_case7("hai@bye"));
        System.out.println(test_case8("HELLO$%#"));
    }
}
