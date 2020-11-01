package interfaces;

public class MyBicycle implements Bicycle {
	
		int cadence = 22;
	    int speed = 21;
	    int gear = 23;
	   // The compiler will now require that methods
	   // changeCadence, changeGear, speedUp, and applyBrakes
	   // all be implemented. Compilation will fail if those
	   // methods are missing from this class.

	   public void changeCadence(int newValue) {
	         cadence = cadence+10+ newValue;
	         System.out.println("cadence"+cadence);
	    }

	    public void changeGear(int newValue) {
	         gear = gear+10+ newValue;
	    }

	    public void speedUp(int increment) {
	         speed = speed +10+ increment;   
	    }

	    public void applyBrakes(int decrement) {
	         speed = speed+10+ decrement;
	    }

	    void printStates() {
	         System.out.println("cadence:" +
	             cadence + " speed:" + 
	             speed + " gear:" + gear);
	    }
	    public static void main(String[] args) {
	         MyBicycle M = new MyBicycle();
	        	 M.printStates();
	        	 M.changeCadence(1);
	        	 M.changeGear(2);
	        	 M.speedUp(3);
	        	 
	         }
	
	  
	}


