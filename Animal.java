import java.util.Scanner;
public class Animal 
{	
	private String name;
	private int population;
	private double growthRate;


	public Animal(String l)//mutator method to set name 
	{
		this.name = l;
		population = 0;
		growthRate = 0.0;
	}

	public Animal(String a,int b)//mutator method to set name 
	{
		this.name = a;
		if (b>=0)
			this.population = b;
		else 
			this.population =0;	
		growthRate = 0.0;
	}

	public Animal(String a,int b, double c)//mutator method to set name 
	{
		this.name = a;
		if (b>=0)
			this.population = b;
		else 
			this.population =0;

		this.growthRate = c;
	}

	public void Get_name(String d)//accessor method for name 
	{
		name = d;
	}
	public void Get_population(int e)
	{
		if (e>=0)
			population=e;
		else
			population=0;
	}
	public void Get_growth(double r)
	{
		growthRate = r; 
	}
	public String Get_speciesName() 
	{
		return name;
	}

	public int Get_speciespopulation() 
	{
		return population;
	}

	public double Get_speciesgrowth() 
	{
		return growthRate;
	}
	public String toString()
	{
		return ("Species Name = " + name +"Population = "+ population + "Growth Rate = " + growthRate);
	}
	public boolean equals(Animal other) 
	{
		return name.equals(other.name);
	}

	public boolean endangered()
	{
		if(growthRate<=0)
			return true;
		else
			return false;
	}
	public static void main(String [] args)
	{
		Animal a1 = new Animal(" Dog ");
		Animal a2 = new Animal(" Cat ",100);
		Animal a3 = new Animal(" Bird ", 100,0.25);
		a1.Get_population(50);
		a1.Get_growth(-1.1);
		a2.Get_growth(1.5);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString()+"\n");
		System.out.println("Name: "+ a1.Get_speciesName());
		System.out.println("Population: " + a1.Get_speciespopulation());
		System.out.println("Growth Rate: " + a1.Get_speciesgrowth());
		System.out.println("Endangered situation");
		
		if (a1.endangered()==true)
			System.out.println(a1.Get_speciesName() + ": is an Endangered Species");
		else 
			System.out.println(a1.Get_speciesName() + ": is not an Endangered Species");
		if (a2.endangered()==true)
			System.out.println(a2.Get_speciesName() + ": is an Endangered Species");
		else 
			System.out.println(a2.Get_speciesName() + ": is not an Endangered Species");
		if (a3.endangered()==true)
			System.out.println(a3.Get_speciesName() + ": is an Endangered Species");
		else 
			System.out.println(a3.Get_speciesName() + ": is not an Endangered Species");
		
		Animal a4 = new Animal(" Dog ");
		System.out.println(a4.equals(a1));
		System.out.println(a4.equals(a2));
		System.out.println(a4.equals(a3));
	}
}