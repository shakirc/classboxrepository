
public interface Shape {
	int addInteger1();
	int addInteger2();
	void printArea();
	
	public static void main(String[] args) {
		Shape shape0 = new Rectangle();
		shape0.printArea();
		
	}
}

class Rectangle implements Shape {

	@Override
	public int addInteger1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addInteger2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		int i,j,row = 6;
		for(i=0; i<row; i++) {
			
		for(j=row; j>1; j--) {
			System.out.println(" ");
		}
		for(j=0; j<=i; j++) {
			System.out.println("*");
		}
		System.out.println();
	}
		System.out.println("This is a Rectangle");
	}
}

class Triangle implements Shape {

	@Override
	public int addInteger1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addInteger2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("this is a triangle");
		
	}
	
}

class Circle implements Shape {

	@Override
	public int addInteger1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addInteger2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("this is a circle");
		
	}
	
}