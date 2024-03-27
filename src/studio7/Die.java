package studio7;

public class Die {
	private int sides;
	
	public Die(int inisides) {
		sides=inisides;
	}
	
	public int random() {
		return (int)(Math.random()*sides+1);
		
	}
	
	public String toString() {
		return "There are "+ sides+" sides";
	}
	
	
	public static void main(String[] args) {
		Die d1=new Die(9);
		System.out.println(d1.random());
		System.out.println(d1);
		
	}

}
