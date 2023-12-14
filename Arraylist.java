package COLLECTION;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kowsi");
		list.add("Yuvi");
		list.add("Muthu");
		list.add("AMMA");
		list.remove(0);
		System.out.println(list.size());
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
