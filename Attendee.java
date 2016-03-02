
public class Attendee {
	
	private String fname;
	private String lname;
	private String email;
	private String phone;
	
	public Attendee(){
		super();
	}
	public void setFirstname(String first){
		this.fname=first;
	}
	public String getFirstname(){
		return this.fname;
	}
	public void setLastname(String last){
		this.fname=last;
	}
	public String getLastname(){
		return this.lname;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return this.phone;
	}
	
}
