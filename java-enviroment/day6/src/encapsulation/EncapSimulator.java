package encapsulation;

public class EncapSimulator {
	private  String pri = "Private String";
	String def = "Default/Package-private String";
	protected  String pro = "Protected String";
	public String pub = "Public String";
	
	public static void main(String[] args) {
		EncapSimulator en = new EncapSimulator();
		System.out.println(en.pri);
		System.out.println(en.def);
		System.out.println(en.pro);
		System.out.println(en.pub);
	}
}
