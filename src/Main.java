public class Main {
    public static void main(String[] args) {
        AtbashCipher atbashCipher=new AtbashCipher();
        System.out.println(atbashCipher.crypt("ABCMNXYZ"));
        System.out.println(atbashCipher.crypt("abcmnxyz"));
        System.out.println(atbashCipher.crypt("Hello world!"));
    }
}
