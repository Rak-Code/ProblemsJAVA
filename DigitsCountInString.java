public class DigitsCountInString {
    public static void main(String[] args) {
        String str = "Hello World 123456";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') { 
                count++;
            }
        }
        System.out.println(count);
    }
    
}
