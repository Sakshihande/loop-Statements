package oops;
   
   public class DemoStaicNested {
	    void outerHello() {
	    	System.out.println("My Class1");
	    	
	    }
	    static class InnerDemo{
	    	int x=100;
	    	void innerHello() {
	    		DemoStaicNested obj = new DemoStaicNested();
	    		obj.outerHello();
	    		System.out.println(" My inner class1");
	    	}
	    }
	    void demoMethod() {
	    				
	    				
	    				
	    				
	    				
	    				
	    	}
	    }
	    


