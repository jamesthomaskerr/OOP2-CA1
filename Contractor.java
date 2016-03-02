
public class Contractor extends Attendee{

	
	private String dob;
	private String company;
	private String contact;

	
	public void setDOB(String dob){
		this.dob=dob;
		
	}
	public void setCompany(String company){
		this.company=company;
		
	}
	public void setContact(String contact){
		this.contact=contact;
	}
	public String getDOB(){
		return this.dob;
	}
	public String getCompany(){
		return this.company;
	}
	public String getContact(){
		return this.contact;
	}

}
