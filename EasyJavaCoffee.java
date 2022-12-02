import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class EasyJavaCoffee
{
    public static void main(String[]args)
    {
        // String pcode1 = "A001";
        // String pcode2 = "A002";
        // String pcode3 = "A003";
        // String pcode4 = "A004";
        // String pcode5 = "A005";

        String pcode;
        String prompt;
        Integer quantity;
        
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
            System.out.println("Purchase Items? (Y/N)");
            System.out.println("");
            prompt = JOptionPane.showInputDialog(null, "Would you like to add an item again? Y/N");

        }while(prompt.equalsIgnoreCase("Y"));

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
