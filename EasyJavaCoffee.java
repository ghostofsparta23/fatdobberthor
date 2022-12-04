import javax.swing.JOptionPane;

public class EasyJavaCoffee
{
    public static void main(String[]args)
    {
        String Description1 = "G502 Hero High Performance Gaming Mouse";
        String Description2 = "24 Bezel-less FHD Monitor";
        String Description3 = "GH60 Gaming Keyboard 60% Base Case Wood";
        String Description4 = "SanDisk (32GB) Cruzer Blade USB";
        String Description5 = "Seagate Barracuda 6TB";
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
        double amount, amount1 = 0, amount2 = 0, amount3 = 0, amount4 = 0, amount5 = 0;
        int i = 0;
        int quantity1 = 0, quantity2 = 0, quantity3 = 0, quantity4 = 0, quantity5 =0;
        //Initization first before the rest of the code has been encoded.
        
        do{
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
            
            while(i < 6)
            {
                prompt = JOptionPane.showInputDialog("Purchse Items? Y/N");
                if(prompt.equalsIgnoreCase("Y")){
                    System.out.println(prompt+ "\n");
                    break;

                }else if(prompt.equalsIgnoreCase("N")){
                    System.out.println(prompt + "\nSystem Terminated");
                    System.exit(0);
                    break;

                }else if(!prompt.equalsIgnoreCase("Y") && !prompt.equalsIgnoreCase("N")){
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
                if(pcode.equals(pcode1)){
                    System.out.print("\nSelect Product Code:		");
                    System.out.println(pcode);
                    System.out.print("Enter Quantity:			");
                    quantity1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity: "));
                    System.out.println(quantity1);
                    amount1 = quantity1 * unitprice1;
                    System.out.println("Amount: " + amount1);

                }else if (pcode.equals(pcode2)){
                    System.out.print("\nSelect Product Code:		");
                    System.out.println(pcode);
                    System.out.print("Enter Quantity:			");
                    quantity2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity: "));
                    System.out.println(quantity2);
                    amount2 = quantity2 * unitprice2;
                    System.out.println("Amount: " + amount2);

                }else if(pcode.equals(pcode3)){
                    System.out.print("\nSelect Product Code:		");
                    System.out.println(pcode);
                    System.out.print("Enter Quantity:			");
                    quantity3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity: "));
                    System.out.println(quantity3);
                    amount3 = quantity3 * unitprice3;
                    System.out.println("Amount: " + amount3);

                }else if (pcode.equals(pcode4)){
                    System.out.print("\nSelect Product Code:		");
                    System.out.println(pcode);
                    System.out.print("Enter Quantity:			");
                    quantity4 = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity: "));
                    System.out.println(quantity4);
                    amount4 = quantity4 * unitprice4;
                    System.out.println("Amount: " + amount4);

                }else if (pcode.equals(pcode5)){
                    System.out.print("\nSelect Product Code:		");
                    System.out.println(pcode);
                    System.out.print("Enter Quantity:			");
                    quantity5 = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity: "));
                    System.out.println(quantity5);
                    amount5 = quantity5 * unitprice5;
                    System.out.println("Amount: " + amount5);

                }else{
                    if(!pcode.equals(pcode1)){
                        JOptionPane.showMessageDialog(null, "Code not in the list, Please try again", "ERROR", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                }
            
                System.out.println("Add an Item? (Y/N)");
                if (quantity1 > 0 && quantity2 > 0 && quantity3 > 0 && quantity4 > 0 && quantity5 > 0){
                    System.out.println("OUT OF ORDER" + "\nRedirecting to Order Information...");
                }

                while(i < 6){
                    prompt = JOptionPane.showInputDialog("Add an Item? (Y/N)");

                    if(prompt.equalsIgnoreCase("Y")){
                        System.out.println(prompt+ "\n");
                        break;

                    }else if(prompt.equalsIgnoreCase("N")){
                        System.out.println(prompt + "\n");
                        break;

                    }else if(!prompt.equalsIgnoreCase("Y") && !prompt.equalsIgnoreCase("N")){
                        JOptionPane.showMessageDialog(null, "Invalid Key, Please Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }while(prompt.equalsIgnoreCase("Y"));   
            
            System.out.println("***************EASY JAVA COFFEE SHOP************************");
            System.out.println("                 Mandaluyong City");
            System.out.println("                    ORDER INFORMATION \n");

            System.out.println("Code  " + " Description  " + " Unit Price  " + " Quantity  " + "Amount  ");
            if(quantity1>0){
                System.out.println(pcode1+"  "+ Description1 +"P "+unitprice1+" "+quantity1+"P "+amount1);

            }else if(quantity2>0){
                System.out.println(pcode2+" "+ Description2 +"P "+unitprice2+" "+quantity2+"P "+amount2);

            }else if(quantity3>0){
                System.out.println(pcode3+" "+ Description3 +"P "+unitprice3+" "+quantity3+"P "+amount3);

            }else if(quantity4>0){
                System.out.println(pcode4+" "+ Description4 +"P "+ unitprice4 +""+ quantity4 +"P "+amount4);

            }else if(quantity5>0){
                System.out.println(pcode5+" "+ Description5 +"P "+ unitprice5 +" "+ quantity5 +"P "+amount5);

            }

            System.out.println("\n****************nothing follows*****************");
            amount = amount1 + amount2 + amount3 + amount4 + amount5;
            System.out.println("\n			GRAND TOTAL: P "+ amount+"\n");
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



    

		
        
        
        

       
        
