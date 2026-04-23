package EX4;

public class MAIN {
	public static void main(String[] args) {
		Animal Chat1 = new Chat();
		Animal Chien1 = new Chien();
		Chat1.crier();
		Chien1.crier();
		System.out.println("Pour CHAT");
		Chat1.manger();
		Chat1.dormir();
		((Chat)Chat1).grimper();
		((Chat)Chat1).ronronner();
		System.out.println("Pour CHIEN");
		Chien1.dormir();
		Chien1.manger();
		((Chien)Chien1).garder();
		((Chien)Chien1).jouer();
	}
		
}

