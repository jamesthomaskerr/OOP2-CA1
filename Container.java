
public class Container {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e1 = new Employee();
		e1.setFirstname("james");
		e1.setLastname("kerr");
		e1.setEmail("3@33");
		e1.setPhone("098");
		e1.setDOB("23/23/23");
		e1.setJobTitle("manager");
		e1.setSalary(23.00);
		
		Contractor c1 = new Contractor();
		c1.setFirstname("james");
		c1.setLastname("kerr");
		c1.setEmail("3@33");
		c1.setPhone("098");
		c1.setDOB("23/23/23");
		c1.setCompany("SAP");
		c1.setContact("jeff");
		
		Guest g1 = new Guest();
		g1.setFirstname("james");
		g1.setLastname("kerr");
		g1.setEmail("3@33");
		g1.setPhone("098");
		g1.setCompany("SAP");
		g1.setContact("jeff");
		


		IStorage container1 = new Storage();
		container1.add(e1);
		container1.add(c1);
		container1.add(g1);
		
		ISend sms = new SMSservice();
		ISend email = new Emailservice();
		
		Contact e = new Contact(email);
		
		
		// Loop through ArrayList of all Attendees and send a Confirmation Email of attendance.
		for(int i=0; i<container1.size(); i++){
			
			e.sendMessage("McCarthyWebsites Ltd", container1.retreive(i).getEmail(), "Confirmation of Attendance");
			
		}
		
		
		// Loop through ArrayList of all Attendees and send a Confirmation Email of attendance.
		for(int i=0; i<container1.size(); i++){
			
			e.sendMessage("McCarthyWebsites Ltd", container1.retreive(i).getEmail(), "Thank you for your attendance at today's event!");
			

		}
		
		

	}

}
