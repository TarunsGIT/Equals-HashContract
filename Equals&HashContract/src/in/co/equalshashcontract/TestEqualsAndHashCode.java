package in.co.equalshashcontract;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestEqualsAndHashCode {

	public static void main(String[] args) {

		Marksheet m = new Marksheet("Chris", "Gopicharan", "121", 90);
		Marksheet m1 = new Marksheet("Pravin", "Rao", "121", 84);
		List<Marksheet> L = new ArrayList<Marksheet>();
		L.add(m);
		L.add(m1);

		Iterator<Marksheet> it = L.iterator();
		while (it.hasNext()) {
			Marksheet mar = it.next();
			System.out.println(mar);
		}

		Set<Marksheet> s = new HashSet<Marksheet>();
		s.add(m);
		s.add(m1);

		Iterator<Marksheet> its = s.iterator();
		System.out.println("BY HASH COLLECTION");
		while (its.hasNext()) {
			System.out.println(its.next());
		}

	}

}
