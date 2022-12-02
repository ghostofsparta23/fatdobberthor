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
        int quantity1 = 0, quantity2 = 0, quantity3 = 0, quantity4 = 0, quantity5 =0;
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
        while (i < 6){
            prompt = JOptionPane.showInputDialog("Proceed to purchase items? (Y/N)");
            if (prompt.equalsIgnoreCase("Y))
                                    
                                        }
        System.out.println("***************EASY JAVA COFFEE SHOP************************");
        System.out.println("                 Mandaluyong City");
        System.out.println("\n              PURCHASE ORDER");
    
        System.out.println("\nSelect Product Code: ");
            pcode = JOptionPane.showInputDialog("Enter Product Code:");
        System.out.println(pcode);
        
        System.out.println("Enter Quantity: ");
            quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity:"));
        System.out.println(quantity);
        
        System.out.println("Add item?(y/n)");

        System.out.println("***************EASY JAVA COFFEE SHOP************************");
        System.out.println("                 Mandaluyong City");
        System.out.println("\n            ORDER INFORMATION");
        
}
}
