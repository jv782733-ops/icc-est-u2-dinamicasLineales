import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio2 {
    public boolean esPalindromo (String texto){
    Deque<Character> pila = new ArrayDeque<>();

        for (char c : texto.toCharArray()) {
            pila.push(c);
        }

        StringBuilder invertido = new StringBuilder();

        while (!pila.isEmpty()) {
            invertido.append(pila.pop());
        }

        return texto.equals(invertido.toString());
   }
    }
