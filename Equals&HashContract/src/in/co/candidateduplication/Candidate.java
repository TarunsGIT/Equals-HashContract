package in.co.candidateduplication;

public class Candidate {

	private String firstName;
	private String lastName;
	private String dob;
	private String contact;
	private double HSCScore;
	private String HSCPassingYear;
	private String HSCPassingInstitute;
	private double SSCScore;
	private String SSCPassingYear;
	private String SSCPassingInstitute;
	private double GraduationScore;
	private String GraduationPassingYear;
	private String GraduationPassingInstitute;
	private String email;

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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public double getHSCScore() {
		return HSCScore;
	}

	public void setHSCScore(double hSCScore) {
		HSCScore = hSCScore;
	}

	public String getHSCPassingYear() {
		return HSCPassingYear;
	}

	public void setHSCPassingYear(String hSCPassingYear) {
		HSCPassingYear = hSCPassingYear;
	}

	public String getHSCPassingInstitute() {
		return HSCPassingInstitute;
	}

	public void setHSCPassingInstitute(String hSCPassingInstitute) {
		HSCPassingInstitute = hSCPassingInstitute;
	}

	public double getSSCScore() {
		return SSCScore;
	}

	public void setSSCScore(double sSCScore) {
		SSCScore = sSCScore;
	}

	public String getSSCPassingYear() {
		return SSCPassingYear;
	}

	public void setSSCPassingYear(String sSCPassingYear) {
		SSCPassingYear = sSCPassingYear;
	}

	public String getSSCPassingInstitute() {
		return SSCPassingInstitute;
	}

	public void setSSCPassingInstitute(String sSCPassingInstitute) {
		SSCPassingInstitute = sSCPassingInstitute;
	}

	public double getGraduationScore() {
		return GraduationScore;
	}

	public void setGraduationScore(double graduationScore) {
		GraduationScore = graduationScore;
	}

	public String getGraduationPassingYear() {
		return GraduationPassingYear;
	}

	public void setGraduationPassingYear(String graduationPassingYear) {
		GraduationPassingYear = graduationPassingYear;
	}

	public String getGraduationPassingInstitute() {
		return GraduationPassingInstitute;
	}

	public void setGraduationPassingInstitute(String graduationPassingInstitute) {
		GraduationPassingInstitute = graduationPassingInstitute;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return false;
		}

		if (obj.getClass() != this.getClass()) {

			return false;

		}

		if (obj instanceof Candidate) {
			Candidate c = (Candidate) obj;

			return this.dob.equals(c.dob)
					&& this.SSCScore == c.SSCScore
					&& this.SSCPassingYear.equals(c.SSCPassingYear)
					&& this.SSCPassingInstitute
							.equalsIgnoreCase(c.SSCPassingInstitute)
					&& this.HSCScore == c.HSCScore
					&& this.HSCPassingYear.equals(c.HSCPassingYear)
					&& this.HSCPassingInstitute
							.equalsIgnoreCase(c.HSCPassingInstitute)
					&& this.GraduationScore == c.GraduationScore
					&& this.GraduationPassingYear
							.equals(c.GraduationPassingYear)
					&& this.GraduationPassingInstitute
							.equalsIgnoreCase(c.GraduationPassingInstitute)
					&& this.lastName.equalsIgnoreCase(c.lastName)

			;
		}

		return false;

	}

	@Override
	public int hashCode() {
		return (int) (this.dob.hashCode() + this.SSCScore
				+ this.SSCPassingYear.hashCode()
				+ this.SSCPassingInstitute.hashCode() + this.HSCScore
				+ this.HSCPassingYear.hashCode()
				+ this.HSCPassingInstitute.hashCode() + this.GraduationScore
				+ this.GraduationPassingYear.hashCode()
				+ this.GraduationPassingInstitute.hashCode() + this.lastName
					.hashCode());
	}

	@Override
	public String toString() {
		return "First Name:" + firstName + " Last Name:" + lastName + " DOB:"
				+ dob + " Contact:" + contact + " HSC Score:" + HSCScore
				+ " SSC Score:" + SSCScore + " Graduation Score:"
				+ GraduationScore + " Email:" + email;
	}
}
