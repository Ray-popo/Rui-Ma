import java.util.Scanner;

public class Odometer { 

	private double miles; 
	private double fuelEfficiency; 

	public Odometer() { 
		miles = 0.0;
		fuelEfficiency = 0.0;  
	} 
	public Odometer(double miles,double fuelEfficiency) { 
		miles = miles; 
		fuelEfficiency = fuelEfficiency; 
	} 
	public void reset() { 
		miles=0; 
	} 
	public void setMiles(double miles) { 
		this.miles=miles; 
	} 
	public double getMiles() { 
		return miles; 
	}

	public void setFuelEfficiency(double fuelEfficiency) { 
		this.fuelEfficiency=fuelEfficiency; 
	} 

	public double getFuelEfficiency() { 
		return fuelEfficiency; 
	} 

	public void addMiles(double miles) { 
		this.miles=this.miles+miles; 
	} 
	public double getGasolineConsumption() { 	
		return miles*fuelEfficiency; 
	} 
	public static void main(String args[]) { 
		Odometer car =new Odometer(100,10); 
		car.addMiles(1000); 
		car.addMiles(100); 
		System.out.println("total miles = "+car.getMiles()+" fuel efficiency "+car.getFuelEfficiency()); 
		System.out.println("gasoline consumption= "+car.getGasolineConsumption()); 
		car.reset(); 
		car.setFuelEfficiency(50); 
		
	}
}