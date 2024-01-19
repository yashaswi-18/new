package day1;

public class PlanetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Planet ourPlanet = new Planet();
        ourPlanet.assignValues("Earth", 1);
        
        Planet bp=new Planet();
        bp.assignValues("Jupiter", 10);
        
        String ourPlanetInfo1 = ourPlanet.retrieveValues();
        System.out.println(ourPlanetInfo1);
        
        String ourPlanetInfo2 = bp.retrieveValues();
        System.out.println(ourPlanetInfo2);
	}

}
