import javax.swing.JOptionPane;

import java.text.DecimalFormat;



public class pennies

{

  public static void main(String [] args)

  {

   DecimalFormat money = new DecimalFormat("##.##");


   String totalCents;

   totalCents = JOptionPane.showInputDialog(null, "Please enter an amout of money");

   totalCents = totalCents.replace("$", "");

   double moneyInput;

   moneyInput = Double.valueOf(totalCents);

   

   final double quarter = .25;

   final double dime = .10;

   final double nickel = .05;

   final double penny = .01;

   

   double quarterTotal = moneyInput / quarter;

   String quarterRemainder = money.format( (moneyInput % quarter) );

   double remaining = Double.valueOf(quarterRemainder);
   

   double dimeTotal =  (int)(remaining / dime);

   String dimeRemainder = money.format( remaining % dime );

   double remaining2 = Double.valueOf(dimeRemainder);

   

   double nickelTotal =  (int)(remaining2 / nickel);

   String nickelRemainder = money.format( remaining2 % nickel );

   double remaining3 = Double.valueOf(nickelRemainder);

   

   double pennyTotal =  (int)(remaining3 / penny);

   String pennyRemainder = money.format( remaining3 % penny );

   double remaining4 = Double.valueOf(pennyRemainder);


   JOptionPane.showMessageDialog(null, "$" + moneyInput + " can be made using:\n" + (int)quarterTotal + " quarter(s),\n" +

                                 (int)dimeTotal + " dime(s),\n" + (int)nickelTotal + " nickel(s),\n" + "and " + (int)pennyTotal + " pennies.");

  
  }

}
