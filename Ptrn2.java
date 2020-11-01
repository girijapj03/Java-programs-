public class Ptrn2 {
	public static void main(String[] args) {
		int lines = 13;
		for(int j=0; j<lines; j++) {
			for(int i=0; i<lines; i++) {
				if(i == lines-7|| j == lines-7){
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
