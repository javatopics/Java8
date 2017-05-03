
public class MethodReferences {

	public static void main(String[] args) {
		MethodReferences mrf=new MethodReferences();
		Messageable sms = mrf::say;
		sms.message("hey! are OKay");
		
	}
	
	public void say(String sms){
		System.out.println(sms);
	}
}

interface Messageable{
	void message(String sms);
}
