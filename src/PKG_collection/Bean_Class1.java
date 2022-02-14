package PKG_collection;

public class Bean_Class1 {
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
	this.id=id;
	}
	public Bean_Class1(int id,String name,long contact) {
		super();
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public long getContact(long contact) {
		return contact;
	}
	public void setContact(long contact) {
		this.contact=contact;
	}
	private String name;
	private long contact;
		
		
	}


