package lambdas;

/*
 * Functional interfaces are simply interfaces with a single 
 * abstract method. if you define a second method with an 
 * interface it cease to be a functional interface
 * 
 * the @FunctionalInterface annotation can be used to help 
 * reinforce an interface as a functional one
 */
@FunctionalInterface
public interface HelloWorldInterface {
	public void sayHello();
}
