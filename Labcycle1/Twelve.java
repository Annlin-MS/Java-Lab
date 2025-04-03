public class Twelve {
    public static void main(String args[]) {
        String str = "We are learning in Java";
        int count = 0;
        int vcount = 0;
        int ccount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); 
            
            if (ch != ' ') {
                count++; 
            }
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++; 
            } else if (ch >= 'a' && ch <= 'z') {
                ccount++; 
            }
        }

        System.out.println("Total number of characters in string: " + count);
        System.out.println("Total number of vowels in string: " + vcount);
        System.out.println("Total number of consonants in string: " + ccount);
    }
}
