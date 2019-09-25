import java.util.Scanner;

public class Temperature{
	private double temperature;
    private char scale;

    public Temperature(){
        temperature = 0;
        scale = 'C';
    }

    public Temperature(char scale){
        this.scale = scale;
        temperature = 0;
    }

    public Temperature(double temperature){
        this.temperature = temperature;
        scale = 'C';
    }

    public Temperature(double temperature, char scale){
        this.temperature = temperature;
        this.scale = scale;
    }
	public void setTemperature(double temperature){
    	this.temperature = temperature;
	}

	public void setScale(char scale){
        this.scale = scale;
    }

    public void setTemperatureScale(double temperature, char scale){
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getCelsius(){
        if (scale == 'C')
        {
            return temperature;
        }
        else
        {
            return ((double) (((5 * (temperature - 32.0) / 9.0) * 10.0)) / 10);
        }
    }

    public double getFahrenheit(){
        if (scale == 'F')
        {
            return temperature;
        }
        else
        {
            return (((9 * (temperature / 5) + 32) * 10) / 10);
        }
    }

    public boolean equals(Object obj){
        if (obj == Temperature)
        {
            Temperature t = (Temperature) obj;
            return getCelsius() == t.getCelsius();
        }
        return false;
    }

    public boolean less(Object obj) {
        if (obj == Temperature)
        {
            Temperature t = (Temperature) obj;
            return getCelsius() > t.getCelsius();
        }
        return false;
    }

    public boolean greater(Object obj){
        if (obj == Temperature)
        {
            Temperature t = (Temperature) obj;
            return getCelsius() < t.getCelsius();
        }
        return false;
    }

    public String toString(){
        if (scale == 'C')
        {
            return ( +temperature +" degrees C=" 
            	+getFahrenheit()+" degrees F"  );
        }
        else
        {
            return (+temperature+" degrees F=" 
            	+getCelsius()+" degrees C");
        }
    }
    public static void main(String[] args){

        System.out.println("celsius to Fahrenheit:");

        Temperature temp1 = new Temperature();
        temp1.setTemperature(0.00);
        temp1.setScale('C');
        System.out.println(temp1.toString());

        Temperature temp2 = new Temperature('C');
        temp2.setTemperature(-40);
        System.out.println(temp2.toString());

        Temperature temp3 = new Temperature(100.00, 'C');
        System.out.println(temp3.toString());

        System.out.println("\nfahrenheit to Celsius:");
        Temperature temp11 = new Temperature(0);
        temp11.setTemperatureScale(56.00, 'F');
        System.out.println(temp1.toString());

        System.out.println("\ntemp1 < temp2: " + temp1.less(temp2));
        System.out.println("temp2 = temp3: " + temp1.equals(temp3));
        System.out.println("temp3 > temp11: " + temp3.greater(temp1));
    }
}