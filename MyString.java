
public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                if(i < str.length() - 1) {
                    str = str.substring(0, i) + (char)(str.charAt(i) + 32) + str.substring(i + 1, str.length());
                }
                else {
                    str = str.substring(0, i) + (char)(str.charAt(i) + 32);
                }
            }
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str1.equals("")) {
            return false;
        }
        if(str2.equals("")) {
            return true;
        }
        if(str2.length() > str1.length()) {
            return false;
        }
        int stageCounter = 0;
        int i = 0;
        for(int j = 0; j < str1.length(); j++) {
            if(str2.charAt(i) == str1.charAt(j)) {
                i++;
                if(i == str2.length()) {
                    return true;
                }
            }
            else {
                stageCounter++;
                if(i > 0) {
                    j = stageCounter;
                    i = 0;
                }
            }
        }
        return false;
    }
}
