
import java.util.Locale;
import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        String palabra = "";
        System.out.print("Ingrese una palabra: ");
        palabra = leer.next();
        if (Palindromo(palabra)){
            System.out.println(palabra + " es palindromo");
        } else {
            System.out.println(palabra + " no es palindromo");
        }
    }
    public static boolean Palindromo(String palabra){
        palabra = palabra.toLowerCase();
        String alReves = new StringBuilder(palabra).reverse().toString();
        return alReves.equals(palabra);
    }
}
