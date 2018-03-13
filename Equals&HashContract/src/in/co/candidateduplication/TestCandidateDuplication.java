package in.co.candidateduplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestCandidateDuplication {

	public static void main(String[] args) {
		Candidate c1 = new Candidate();
		c1.setFirstName("Tarun");
		c1.setLastName("Jadhav");
		c1.setDob("19/04/1992");
		c1.setContact("7440465220");
		c1.setEmail("tarunjadhav02@gmail.com");
		c1.setSSCScore(84);
		c1.setSSCPassingYear("2008");
		c1.setSSCPassingInstitute("ST Mary");
		c1.setHSCScore(70);
		c1.setHSCPassingYear("2010");
		c1.setHSCPassingInstitute("ST Mary");
		c1.setGraduationScore(66.40);
		c1.setGraduationPassingYear("2014");
		c1.setGraduationPassingInstitute("IIST");

		Candidate c2 = new Candidate();

		c2.setFirstName("Arun");
		c2.setLastName("Jadhav");
		c2.setDob("19/04/1992");
		c2.setContact("7440465220");
		c2.setEmail("tarunjadhav@gmail.com");
		c2.setSSCScore(84);
		c2.setSSCPassingYear("2008");
		c2.setSSCPassingInstitute("ST Mary");
		c2.setHSCScore(70);
		c2.setHSCPassingYear("2010");
		c2.setHSCPassingInstitute("ST Mary");
		c2.setGraduationScore(66.40);
		c2.setGraduationPassingYear("2014");
		c2.setGraduationPassingInstitute("IIST");

		List<Candidate> L = new ArrayList<Candidate>();
		L.add(c1);
		L.add(c2);

		Iterator<Candidate> it = L.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Set<Candidate> s = new HashSet<Candidate>();
		s.add(c1);
		s.add(c2);
        System.out.println("BY HASH COLLECTION");
		Iterator<Candidate> its = s.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}

	}

}
