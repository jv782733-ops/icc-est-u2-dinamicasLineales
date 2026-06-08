import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {
    /* METODO QUE DEVULEVA UNA CADENA DE TEXTO INVERTIDA 

    */
   
    public String  invertString(String texto) {
        Deque<Character> pila = new ArrayDeque<>();
        for(Character letra: texto.toCharArray()){
            pila.push(letra);
        }
        String invertido= "";
        while (!pila.isEmpty()) {
            invertido+= pila.peek();
        }
        return invertido;
    }
    
}
