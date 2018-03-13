package in.co.equalshashcontract;

public class Marksheet {

	private String firstName;
	private String lastName;
	private String rollNo;
	private int marks;

	public Marksheet(String fN, String lN, String roll, int marks) {
		this.firstName = fN;
		this.lastName = lN;
		this.marks = marks;
		this.rollNo = roll;

	}

	public String toString() {

		return "ROLL NO: " + rollNo + " FIRST NAME: " + firstName
				+ " LAST NAME: " + lastName + " MARKS: " + marks;

	}

	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		if (obj instanceof Marksheet) {
			Marksheet m = (Marksheet) obj;

			return this.rollNo.equals(m.rollNo);
		}
		return false;

	}

	public int hashCode() {
		System.out.println(this.rollNo.hashCode());
		return this.rollNo.hashCode();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
