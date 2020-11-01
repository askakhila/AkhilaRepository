package inheritance;

public class MobileMain {
	public static void main(String[] args) {
		
		MobileV3 v3=new MobileV3();
		v3.calling();
		v3.gaming();
		v3.socialNwApps();
		v3.sendMessage();
		v3.sendMMS();
		System.out.println("v3.getClass() : "+v3.getClass());
		System.out.println("v3.hashCode() : "+v3.hashCode());
		v3.videoCalls();
		MobileV1 v1 = new MobileV3();//child class is assigned to parent.
		v1.sendMessage();
		v3.sendMessage();
		//v1.gaming();
	
		((MobileV3) v1).camera();
		((MobileV2) v1).gaming();
		v1.calling();
		//MobileV1 m1=new MobileV1();
		//MobileV2 m2 =(MobileV2)m1;
		//m2.gaming();
		System.out.println("done");
				
	}
}
