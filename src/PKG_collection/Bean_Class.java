package PKG_collection;
public class Bean_Class implements Comparable {
	
	String color;
	public Bean_Class (String color,String brand,double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}

	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
		
	}
	String brand;
	double price;

	public int compareTo(Object o) {
		Bean_Class bn=(Bean_Class) o ; 
	
		if(price==bn.price) {
			return 0;
		}
		
		else if(price>bn.price)
		{
			return 1;
		}else {
			return -1;
		}
	}
			
			
			
}


