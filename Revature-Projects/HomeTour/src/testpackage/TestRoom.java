package testpackage;



public class TestRoom extends TestFixture{
	private TestRoom[] exits =  new TestRoom[4];


	public TestRoom(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public TestRoom[] getExits() {
		return this.exits;
	}
	
	public void setExits(TestRoom[] exits) {
		this.exits = exits;
	}
	
	public TestRoom getExit(String direction) {
		return null;
	}
	
	public void setExits(TestRoom exit, int index) {
		this.exits[index] = exit;
	}
}
