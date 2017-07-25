
package test;

public class Main {

	class Test {
		@Override
		protected void finalize() {
		System.out.println("finalize");
		}
		}

		public static void main(String[] args) {
		
			int n = 1000000;
		
			while (n-- > 0){
				new Test();
			}
		
			
		}
		
		
}
