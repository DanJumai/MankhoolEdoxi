package assignment;

public class AbstracD extends Abstrac {

		public AbstracD() {}
		
		public String profile() {
			System.out.println("Thanks");
			return "ab";
		}
		

		public static void main(String[] args) {
			AbstracD ab = new AbstracD();
			System.out.println(ab.profile());
				
	}
}

