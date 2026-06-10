import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
       runLinkedList();
       runQueue();
       runStack();
       System.out.println("\n===== EJERCICIO 2 =====");
        Ejercicio2 ejercicio2 = new Ejercicio2();

        String palabra1 = "radar";
        String palabra2 = "computacion";

        System.out.println(palabra1 + " -> "
                + ejercicio2.esPalindromo(palabra1));

        System.out.println(palabra2 + " -> "
                + ejercicio2.esPalindromo(palabra2));
    }


    


    private static void runStack() {
        //hay tres formas de instancias pilas 
        //primer forma de instanciar pilas
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        String elemeto = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemeto);
        // segunda forma de instanciar pilas -> recomendada
        Deque<String> pila2 = new ArrayDeque<>();
        //tercer forma de instanciar pilas
        Deque <String> pila3 = new LinkedList<>();
        pila2.push("a");
        pila3.push("A");
        pila.pop();
        pila.pop();


    }
    
    private static void runQueue() {
        Queue<String>cola= new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");
        System.out.println(cola.isEmpty());
        System.out.println(cola.size());

        System.out.println(cola.peek());
        System.out.println(cola.size());

        System.out.println(cola.poll());
        System.out.println(cola.size());

        while (!cola.isEmpty()) {
          String cliente = cola.poll(); 
          System.out.println("Atendi a"+ cliente); 
            
        }
    }

    //ofer -> agrega al final 
    //peek -> devuelve el primero sin eliminar 
    // poll -> devuleve el primero y lo elimina 
    

    private static void runLinkedList() {
         System.out.println("Lista enlazada");
         LinkedList<String> nombres= new LinkedList<>();
         System.out.println("Esta vacia"+  nombres.isEmpty());
         System.out.println("Tamanio"+  nombres.size());

         nombres.add("Juan");
         nombres.add("Pedro");
         nombres.add("Maria");
         nombres.add("Diego");

         System.out.println(nombres.getFirst());
         System.out.println(nombres.get(2));
         System.out.println(nombres.getLast());

         System.out.println(nombres.peek());
         System.err.println(nombres.size());
    }
}
