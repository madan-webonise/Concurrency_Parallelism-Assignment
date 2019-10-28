import java.io.*;

class Burnbook { 
	final int loadTime = 10;
	final int unloadTime = 10;
	final int carryTime =30;
	final int burnTime = 20;
	final int burningTime = 20;
	int NumberofBooks = 50;
	int BookinCart = 0;
	int BooksatIncinarator = 0;
	int TotalTime = 0;
	void doWork(){
		System.out.println("\nLoading Books");
		while(NumberofBooks != 0) {
			BookinCart = 5;
			System.out.println("\nNumberofBooks : " +NumberofBooks);
			TotalTime = TotalTime +loadTime;
			NumberofBooks -= 5;
			System.out.println("\nCarring books to the incinarator");
			TotalTime = TotalTime + carryTime;
			System.out.println("\nReached to incinarator nd burning book");
			BooksatIncinarator = BooksatIncinarator+2;
			TotalTime = TotalTime +loadTime;
			System.out.println("\nGoing Back to Cart");
			TotalTime = TotalTime + carryTime;
		} 

		while (BooksatIncinarator > 0) { 
			//System.out.println("\nBooksatIncinarator : "+BooksatIncinarator);
			BooksatIncinarator = BooksatIncinarator - 3;
			TotalTime = TotalTime + burningTime;
		}
		System.out.println("\nTotalTime : "+(TotalTime - carryTime) + "  seconds");
	}
}

class CallBurn { 
	public static void main(String args[]) {
		System.out.println("Hello world");
		Burnbook b = new Burnbook();
		b.doWork();
	}
}