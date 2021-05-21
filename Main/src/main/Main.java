package main;

import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author carletes
 */
public class Main {

        public static void main(String[] args){
            
            
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("uno");
		linkedList.add(0, "cero");

		linkedList.addFirst("cero");
		linkedList.addLast("dos");


		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());

		for(String string : linkedList)
		{
			System.out.println(string);
		}

		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			// iterator.remove();
		}

		// Elimina el primero.
		linkedList.remove();
		// Elimina el elemento de la posición 1
		linkedList.remove(1);
		System.out.println(linkedList.removeFirst());
		System.out.println(linkedList.removeLast());

		// linkedList.clear();
		linkedList.size();

		linkedList.isEmpty();

		linkedList.add("tres");

		System.out.println(linkedList.contains("tres"));

		System.out.println(linkedList.get(0));
	}
}
    