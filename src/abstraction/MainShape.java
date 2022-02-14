package abstraction;

public class MainShape {
	public static void main(String[]args) {
		Circle c1=new Circle();
		c1.show("Circle");
		c1.area(3, 2);
		Sphere s1=new Sphere();
		s1.show("Sphere");
		s1.volume(3, 4, 6);
	}

}
