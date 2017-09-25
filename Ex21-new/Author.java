package exercises;


public class Author{
	private String nameA;
	private String email;
	private char gender;
	
	public Author(String nameA, String email, char gender){
		this.nameA = nameA;
		this.email = email;
		this.gender = gender;
	}
	
	public String getNameA(){
		return nameA;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public char getGender(){
		return gender;
	}
	
	@Override
	public String toString(){
		return "Author [nameA=" + nameA + ", email=" + email +", gender=" + gender +"]";
	}
}
