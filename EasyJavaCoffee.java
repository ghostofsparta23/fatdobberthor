import java.io.*;
import javax.swing.JOptionPane;

public class EasyJavaCoffee
{
    public static void main(String[]args)
    {
        String pcode1 = "A001";
        String pcode2 = "A002";
        String pcode3 = "A003";
        String pcode4 = "A004";
        String pcode5 = "A005";
        String pcode;
        String prompt = "";
        double unitprice1 = 2050.00;
        double unitprice2 = 8498.56;
        double unitprice3 = 3234.77;
        double unitprice4 = 468.99;
        double unitprice5 = 10270.98;
        int i = 0;
        int quantity, quantity1 = 0, quantity2 = 0, quantity3 = 0, quantity4 = 0, quantity5 =0;
        //Initization first before the rest of the code has been encoded.
        
        do
        {
        System.out.println("***************EASY JAVA COFFEE SHOP************************");
        System.out.println("                 Mandaluyong City");
        System.out.println("\n               PRODUCT INFORMATION");
        System.out.println("\nCode    " + "           Description    " + "                 Unit Price  ");
        System.out.println("A001   " + "G502 Hero High Performance Gaming Mouse" + "      2,050.00");
        System.out.println("A002   " + "24 Bezel-less FHD Monitor" + "                    8,498.56");
        System.out.println("A003   " + "GH60 Gaming Keyboard 60% Base Case Wood" + "      3,234.77");
        System.out.println("A004   " + "SanDisk (32GB) Cruzer Blade USB" + "                468.99");
        System.out.println("A005   " + "Seagate Barracuda 6TB" + "                       10,270.98");
        System.out.println("************************************************************");
        System.out.println("Welcome to Easy Java Coffee Shop!");
        System.out.println("Purchase Items? (Y/N): ");
        System.out.println("");
        }
        while(i < 6);
        {
			prompt = JOptionPane.showInputDialog("Purchse Item? Y/N");
			if(prompt.equalsIgnoreCase("Y")){
				System.out.println(prompt+ "\n");
				break;
			}
			else if(prompt.equalsIgnoreCase("N"))
            {
					System.out.println(prompt + "\n");
					System.exit(0);
			}
			else if(!prompt.equalsIgnoreCase("Y") && !prompt.equalsIgnoreCase("N")){
						JOptionPane.showMessageDialog(null, "Invalid Key, Please Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
            
        
    		
			
			i++;
			if(i == 5){
			JOptionPane.showMessageDialog(null, "Too many Invalid Attempts", "ERROR", JOptionPane.ERROR_MESSAGE);
			System.out.println("\nSystem Terminated");
			System.exit(0);
            }

        }
    
        
        System.out.println("***************EASY JAVA COFFEE SHOP************************");
        System.out.println("                 Mandaluyong City");
        System.out.println("                  PURCHASE ORDER");
        do
        {
            pcode = JOptionPane.showInputDialog("Enter Product Code: ");
            if(pcode.equals(pcode1))
            {
                System.out.print("\nSelect Product Code:		");
				System.out.println(pcode);
				System.out.print("Enter Quantity:			");
				quantity1 = Integer.parseInt
				(JOptionPane.showInputDialog("Enter Quantity: "));
				System.out.println(quantity1);
            }
            else if (pcode.equals(pcode2))
            {
                System.out.print("\nSelect Product Code:		");
				System.out.println(pcode);
				System.out.print("Enter Quantity:			");
				quantity2 = Integer.parseInt
				(JOptionPane.showInputDialog("Enter Quantity: "));
				System.out.println(quantity2);
            }
            else if (pcode.equals(pcode3))
            {
                System.out.print("\nSelect Product Code:		");
				System.out.println(pcode);
				System.out.print("Enter Quantity:			");
				quantity3 = Integer.parseInt
				(JOptionPane.showInputDialog("Enter Quantity: "));
				System.out.println(quantity3);
            }
            else if (pcode.equals(pcode4))
            {
                System.out.print("\nSelect Product Code:		");
				System.out.println(pcode);
				System.out.print("Enter Quantity:			");
				quantity4 = Integer.parseInt
				(JOptionPane.showInputDialog("Enter Quantity: "));
				System.out.println(quantity4);
            }
            else if (pcode.equals(pcode5))
            {
                System.out.print("\nSelect Product Code:		");
				System.out.println(pcode);
				System.out.print("Enter Quantity:			");
				quantity5 = Integer.parseInt
				(JOptionPane.showInputDialog("Enter Quantity: "));
				System.out.println(quantity5);
            }
            else
            {
                if(!pcode.equals(pcode1))
                {
                    JOptionPane.showMessageDialog(null, "Code not in the list, Please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
				    continue;
				}
            }
        
        System.out.println("Add an Item? (Y/N)");
        while(i <= 5);
        {
            prompt = JOptionPane.showInputDialog("Add an Item? (Y/N)");
            if(prompt.equalsIgnoreCase("Y")){
				System.out.println(prompt+ "\n");
				break;
			}
			else if(prompt.equalsIgnoreCase("N"))
            {
					System.out.println(prompt + "\n");
					System.exit(0);
			}
			else if(!prompt.equalsIgnoreCase("Y") && !prompt.equalsIgnoreCase("N")){
						JOptionPane.showMessageDialog(null, "Invalid Key, Please Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
                    }    
        }while(prompt.equalsIgnoreCase("Y"));
    

}
}
    

		
        
        
        

       
        
