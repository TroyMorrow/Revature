package fixtures;

public abstract class Fixture {
	protected String name;
	protected String shortDescription;
	protected String longDescription;
	public Fixture(String name, String shortDescription, String longDescription) {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setShortDescription() {
		this.shortDescription = shortDescription;
	}
	
	public String getLongDescription() {
		return longDescription;
	}
	
	public void setLongDescription() {
		this.longDescription = longDescription;
	}
	@Override
	public String toString() {
		return "Fixture [name= " + name + ", shortDescription= " + shortDescription + ", longDescription= " + longDescription + "]"; 
	}
}
