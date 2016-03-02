
public class SMSservice implements ISend{
	
	
	public SMSservice(){
		
	}
	public void sendMessage(String msg_from, String msg_to, String message){
		
		System.out.println("Send SMS: " + message);
	}
	public void hello(){
		
	}
}
