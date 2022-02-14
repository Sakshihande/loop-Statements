package interfaces;

public interface I1 {
	int x = 100;  //public static final
	void show();  // public abstract
	// static method
	public static void staticdemo() {
		System.out.println("method from I1");
		
	}
	//default method 
	default void defmethod() {
		System.out.println(" my default method from I1");
	}

}
