public class Main {
    public static void main(String[] args) {
        //char è un numero
        System.out.println(compareCharToNum('2'));
        //char è un carattere
        System.out.println(compareCharToNum('z'));
    }
    public static boolean compareCharToNum(char carattere) {
        if (Character.isDigit(carattere)) {
            return true;
        } else {
            throw new ArithmeticException("Carattere non è un numero");
        }
    }
}