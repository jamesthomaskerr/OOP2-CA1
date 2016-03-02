
public class Emailservice implements ISend {
	public void sendMessage(String msg_from, String msg_to, String message){
		System.out.println("Send email: "+message);
	}
}