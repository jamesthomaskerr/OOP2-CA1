
public class Guest extends Attendee{
	
	private String company;
	private String contact;
	
	public void setCompany(String comp){
		this.company=comp;
	}
	public String geCompany(){
		return this.company;
	}
	public void setContact(String contact){
		this.contact=contact;
	}
	public String getContact(){
		return this.contact;
	}
}