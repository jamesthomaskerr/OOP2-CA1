
public class Employee extends Attendee{
	
	
	private String dob;
	private Double salary;
	private String jobtitle;
	
	public void setDOB(String dob){
		this.dob=dob;
	}
	public String getDOB(){
		return this.dob;
	}
	public void setSalary(Double s){
		this.salary=s;
	}
	public Double getSalary(){
		return this.salary;
	}
	public void setJobTitle(String jt){
		this.jobtitle=jt;
	}
	public String getJobTitle(){
		return this.jobtitle;
	}
}
