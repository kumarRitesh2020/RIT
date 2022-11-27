package Arrays;

class Mobile {
	
	void call( VoiceCall v) {
		System.out.println("This is voice calling");
	}

	void call(ConferenceCall c ) {
		System.out.println("This is conference calling");
		
	}
	
   void call( VideoCall v) {
	   System.out.println("This is video calling");
	}
	
}
 
  class Myclass {
	 public static void main(String[] args) {
		 Mobile m=new Mobile();
		 m.call(new VoiceCall());
		 
		
	}
	 
 }