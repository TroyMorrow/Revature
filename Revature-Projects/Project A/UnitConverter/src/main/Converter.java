package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// to select conversion category
		Scanner scanner3 = new Scanner(System.in);// to select conversion within category

		int menuSelection = 0;
		int menuSelection2 = 0;

				
		while (menuSelection != 4) {
			System.out.println("Please select a conversion type: " + "\n" + 
		"1) Weight " + "\n" + "2) Distance" + 
					"\n" + "3) Money " + "\n" + 
		"4) Quit"); 
			
			menuSelection = scanner.nextInt();
			switch(menuSelection) {
			case 1: {
				System.out.println("Weight");
				System.out.println("Select a weight conversion: " + "\n" + 
				"1) Pounds to Kilograms" + "\n" + "2) Kilograms to Pounds" + 
						"\n" + "3) Ounces to Pounds" + "\n" + "4) Pounds to Ounces");
				menuSelection2 = scanner3.nextInt();
				switch(menuSelection2) {
				case 1: {
					System.out.println("Convert Pounds to Kilograms");
					double unit = scanner.nextDouble();
					double kilo = unit * 0.453592;
					System.out.println(unit + " pounds is equal to " + kilo + " kilograms." + "\n");
					break;
			}
				case 2: {
					System.out.println("Convert Kilograms to Pounds");
					double unit = scanner.nextDouble();
					double lbs = unit * 2.20462;
					System.out.println(unit + " Kilograms are equal to " + lbs + " Pounds");
					break;
			}
				case 3:{
					System.out.println("Convert Ounces to Pounds");
					double unit = scanner.nextDouble();
					double lbs = unit * 0.0625;
					System.out.println(unit + " Ounces are equal to " + lbs + " Pounds");
					break;
			}
				case 4: {
					System.out.println("Convert Pounds to Ounces");
					double unit = scanner.nextDouble();
					double ounce = unit * 16;
					System.out.println(unit + " Pounds are equal to " + ounce + " Ounces");
					break;
			}
				}break;
		} //this ends the first case of the first switch
			case 2: {
				System.out.println("Distance");
				System.out.println("Select a distance conversion: " + "\n" + 
				"1) Miles to Kilometers" + "\n" + "2) Kilometers to Miles" + 
						"\n" + "3) Inches to Centimeters" + "\n" + "4) Centimeters to Inches");
				menuSelection2 = scanner3.nextInt();
				switch(menuSelection2) {
				case 1: {
					System.out.println("Convert Miles to Kilometers");
					double unit = scanner.nextDouble();
					double kilom = unit * 1.60934;
					System.out.println(unit + " Miles is equal to " + kilom + " Kilometers");
					break;
				}
				case 2: {
					System.out.println("Convert Kilometers to Miles");
					double unit = scanner.nextDouble();
					double mile = unit * 0.621371;
					System.out.println(unit + " Kilometers is equal to " + mile + " Miles");
					break;
				}
				case 3: {
					System.out.println("Convert Inches to Centimeters");
					double unit = scanner.nextDouble();
					double centimeter = unit * 2.54;
					System.out.println(unit + " Inches is equal to " + centimeter + " Centimeters");
					break;
				}
				case 4: {
					System.out.println("Convert Centimeters to Inches");
					double unit = scanner.nextDouble();
					double inches = unit * 0.393701;
					System.out.println(unit + " Centimeters is equal to " + inches + " Inches");
					break;
				}
				}break; 
			}// end of case 2 of switch 1
			case 3: {
				System.out.println("Money");
				System.out.println("Select a money conversion: " + "\n" + 
				"1) USD to Euro" + "\n" + "2) USD to Peso" + "\n" + 
						"3) USD to Canadian Dollar" + "\n" + "4) USD to Japanese Yen");
				menuSelection2 = scanner3.nextInt();
				switch(menuSelection2) {
				case 1: {
					System.out.println("Convert USD to Euro");
					double unit = scanner.nextDouble();
					double euro = unit * 0.85;
					System.out.println(unit + " USD is equal to " + euro + " Euros");
					break;
				}
				case 2: {
					System.out.println("Convert USD to Peso");
					double unit = scanner.nextDouble();
					double peso = unit * 19.94;
					System.out.println(unit + " USD is equal to " + peso + " Pesos");
					break;
				}
				case 3: {
					System.out.println("Convert USD to Canadian Dollar");
					double unit = scanner.nextDouble();
					double cd = unit * 1.26;
					System.out.println(unit + " USD is equal to " + cd + " Canadian Dollar");
					break;
				}
				case 4: { 
					System.out.println("Convert USD to Japanese Yen");
					double unit = scanner.nextDouble();
					double jy = unit * 109.95;
					System.out.println(unit + " USD is equal to " + jy + " Japanese Yen");
					break;
				}
				} break;
			}//end of case 3 switch statement 1
			case 4: {
				break;
			}
			
			
	}continue; // } on this line closes switch statement and continue returns to the original list
		
		}	
		scanner.close();
		scanner3.close();
		System.out.println("End of converision program.");
}
}
	
	


