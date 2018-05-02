public class Cara {
	private Segmento s1;
	private Segmento s2;
	
	
	public double getArea(){
		double area;
    area=s1.getDistance()*s2.getDistance();
		return area;
	}
	
	
}
