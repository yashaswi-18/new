package day1;

public class Planet {

	 int moons;
	 String name;
	 
	 public void assignValues(String m , int n)
	 {
		 name = m;
		 moons = n;
     }
	 
	 public String retrieveValues()
	 {
		 String PlanetInfo = name +","+moons;
		 return PlanetInfo;
	 }
}
