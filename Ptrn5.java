public class Ptrn5 {
	public static void main(String[] args) {
		int lines = 13;
		for(int j=0; j<lines; j++) {
			for(int i=0; i<lines; i++) {
				if(i == 0|| i== lines-1|| i== j || i+j == lines-1){
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
}
}