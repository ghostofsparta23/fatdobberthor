import javax.swing.JOptionPane;

public class FinalCaseStudy{
	public static void main (String[] args){
		
		String code1 = "A001";
		String code2 = "A002";
		String code3 = "A003";
		String code4 = "A004";
		String code5 = "A005";
		String code;
		String prompt = "";
		double price1 = 100000.00;
		double price2 = 26700.00;
		double price3 = 48600.00;
		double price4 = 28999.00;
		double price5 = 3935.00;
		double amount = 0, amount1 = 0, amount2=0 ,amount3=0,amount4=0,amount5=0;
		int i = 0;
		int quantity1=0, quantity2=0, quantity3=0, quantity4=0, quantity5=0;
		
		do{
				
			System.out.println("*********THE 4 LOST SOULS COMPUTER SHOP**********");
			System.out.println("				Mandaluyong City");
			System.out.println("\n               PRODUCT INFORMATION\n");
			System.out.println("Code  |  Description  			|  Unit Price");
			System.out.println("A001     RTX 4090    	 			100,000.00\nA002     Intel Core i9    			 26,700.00");
			System.out.println("A003     MSI Z690 Motherboard        48,600.00\nA004     Kingston KC3000             28,999.00");
			System.out.println("A005     Corsair H55 CPU Cooler       3,935.00\n");
			System.out.println("**************************************************\n");
			System.out.print("Purchse Item? Y/N: ");
			
			
			while(i < 6){
				prompt = JOptionPane.showInputDialog("Purchse Item? Y/N");
				if(prompt.equalsIgnoreCase("Y")){
					System.out.println(prompt+ "\n");
					break;

				}else{
					if(prompt.equalsIgnoreCase("N")){
						System.out.println(prompt + "\n");
						System.exit(0);

					}else{
						if(!prompt.equalsIgnoreCase("Y") && !prompt.equalsIgnoreCase("N")){
							JOptionPane.showMessageDialog(null, "Invalid Key, Please Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				
				i++;
				
				if(i == 5){
					JOptionPane.showMessageDialog(null, "Too many Invalid Attempts", "ERROR", JOptionPane.ERROR_MESSAGE);
					System.out.println("\nSystem Terminated");
					System.exit(0);
				}
			}
			
			System.out.println("*********THE 4 LOST SOULS COMPUTER SHOP**********");
			System.out.println("				Mandaluyong City");
			System.out.println("\n               	PURCHASE ORDER\n");		
			
			do{
				
				code = JOptionPane.showInputDialog("Enter Product Code: ");
				
				
				if(code.equals(code1)){
					System.out.print("\nSelect Product Code:		");
					System.out.println(code);
					System.out.print("Enter Quantity:			");
					quantity1 = Integer.parseInt
					(JOptionPane.showInputDialog("Enter Quantity: "));
					System.out.println(quantity1);
					
					amount1 = quantity1 * price1;
					System.out.println("Amount:				"+amount1);	

				}else{
					if(code.equals(code2)){
					System.out.print("\nSelect Product Code:		");
					System.out.println(code);
					System.out.print("Enter Quantity:			");
					quantity2 = Integer.parseInt
					(JOptionPane.showInputDialog("Enter Quantity: "));
					System.out.println(quantity2);
					
					amount2 = quantity2 * price2;
					System.out.println("Amount:				"+amount2);
					
					}else{
						if(code.equals(code3)){
							System.out.print("\nSelect Product Code:		");
							System.out.println(code);
							System.out.print("Enter Quantity:			");
							quantity3 = Integer.parseInt
							(JOptionPane.showInputDialog("Enter Quantity: "));
							System.out.println(quantity3);
							
							amount3 = quantity3 * price3;
							System.out.println("Amount:				"+amount3);

						}else{
							if(code.equals(code4)){
								System.out.print("\nSelect Product Code:		");
								System.out.println(code);
								System.out.print("Enter Quantity:			");
								quantity4 = Integer.parseInt
								(JOptionPane.showInputDialog("Enter Quantity: "));
								System.out.println(quantity4);
								
								amount4 = quantity4 * price4;
								System.out.println("Amount:				"+amount4);

							}else{
								if(code.equals(code5)){
									System.out.print("\nSelect Product Code:		");
									System.out.println(code);
									System.out.print("Enter Quantity:			");
									quantity5 = Integer.parseInt
									(JOptionPane.showInputDialog("Enter Quantity: "));
									System.out.println(quantity5);
									
									amount5 = quantity5 * price5;
									System.out.println("Amount:				"+amount5);

								}else{
									if(!code.equals(code1)){
										JOptionPane.showMessageDialog(null, "Code not in the list, Please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
										continue;
									}
								}
							}
						}
					}
				}
				
				System.out.print("Add Item? [Y/N]: ");
					
				while(i < 6){
					prompt = JOptionPane.showInputDialog("Add Item?: ");
					if(prompt.equalsIgnoreCase("N")){
						System.out.println(prompt + "\n");
						break;

					}else{
						if(prompt.equalsIgnoreCase("Y")){
							System.out.println(prompt + "\n");
							break;

						}else{
							if(!prompt.equalsIgnoreCase("Y") && !prompt.equalsIgnoreCase("N")){
								JOptionPane.showMessageDialog(null, "Invalid Key, Please Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
							}
						}
						
						i++;
						
						if(i == 5){
							JOptionPane.showMessageDialog(null, "Too many Invalid Attempts", "ERROR", JOptionPane.ERROR_MESSAGE);
							System.out.println("\nSystem Terminated");
							System.exit(0);
						}
					}
				}
			}while(prompt.equalsIgnoreCase("Y"));
			
			System.out.println("\n*********THE 4 LOST SOULS COMPUTER SHOP**********");
			System.out.println("				Mandaluyong City");
			System.out.println("\n               ORDER INFORMATION\n");
			
			System.out.println("Code			Description				Unit Price			Quantity			Amount");
			if(quantity1>0){
				System.out.println(code1+"			"+"RTX 4090"+"				P "+price1+"				"+quantity1+"			    P "+amount1);

			}if(quantity2>0){
				System.out.println(code2+"			"+"Intel Core i9"+"			 P "+price2+"			    "+quantity2+"			     P "+amount2);

			}if(quantity3>0){
				System.out.println(code3+"			"+"MSI Z690 Motherboard"+"	 P "+price3+"			    "+quantity3+"			    P "+amount3);

			}if(quantity4>0){
				System.out.println(code4+"			"+"Kingston KC3000"+"			 P "+price4+"			    "+quantity4+"				P "+amount4);

			}if(quantity5>0){
				System.out.println(code5+"			"+"Corsair H55 CPU Cooler"+"    P "+price5+"              "+quantity5+"			     P "+amount5);
			}
		
			System.out.println("\n****************nothing follows*****************");
			amount = amount1 + amount2 + amount3 + amount4 + amount5;
			System.out.println("\n					GRAND TOTAL: P "+ amount+"\n");
			System.out.println("**************************************************");
			
			while(i < 6){
				System.out.print("\nNew Customer? [Y/N]: ");
				prompt = JOptionPane.showInputDialog("New Customer? [Y/N]");
				
				if(prompt.equalsIgnoreCase("N")){
					System.out.println(prompt);
					System.exit(0);

				}else{
					if(prompt.equalsIgnoreCase("Y")){
						System.out.println(prompt + "\n");
						break;

					}else{
						if(!prompt.equalsIgnoreCase("Y") && !prompt.equalsIgnoreCase("N")){
							JOptionPane.showMessageDialog(null, "Invalid Key, Please Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				
				i++;
				if(i == 5){
					JOptionPane.showMessageDialog(null, "Too many Invalid Attempts", "ERROR", JOptionPane.ERROR_MESSAGE);
					System.out.println("\nSystem Terminated");
					System.exit(0);
				}
			}
		}while(prompt.equalsIgnoreCase("Y"));		
	}
}