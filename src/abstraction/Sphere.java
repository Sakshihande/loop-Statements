package abstraction;

public  class Sphere  extends Shape{
	
	@Override
	void area( int x, int y) {
	
	}
	@Override
	void volume(int x, int y, int z) {
		// TODO Auto-generated method stub
		//double volume=4/3*(3.14*(x*x*x));
		System.out.println("Volume of shape is:"+(x*y*z));
	}

}
