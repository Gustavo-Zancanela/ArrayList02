import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
       
        
        ListIterator<Integer> lista = numeros.listIterator();

            while(lista.hasNext())//usa um iterador para ler a lista
            {
                System.out.println("Número: " + lista.next());
            }
        
            for (int i = numeros.size() - 1; i >= 0; i--) //retira os pares da lista fazendo uma conta
            {
                int number = numeros.get(i);
                if (number % 2 == 0) {
                    numeros.remove(i);
                   
                }
                
            }
            
            for(int num : numeros)// mostra a nova lista sem os pares
            {
                 System.out.print(num + ", ");
            }
    }
}
