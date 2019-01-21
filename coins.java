public class coins
{
    static int penny = 1;
    static int nickel = 5;
    static int dime = 10;
    static int quarter = 25;

    static int maxCurrencyLevelForTest =55;

    public static void Main(String[] args)
    {         
        int minPenniesNeeded = 0;
        int minNickelsNeeded = 0; 
        int minDimesNeeded = 0; 
        int minQuartersNeeded = 0;


        if (maxCurrencyLevelForTest == penny)
        {
            minPenniesNeeded = 1;
        }
        else if (maxCurrencyLevelForTest < nickel)
        {
            minPenniesNeeded = MinCountNeeded(penny, maxCurrencyLevelForTest);                
        }
        else if (maxCurrencyLevelForTest < dime)
        {
            minPenniesNeeded = MinCountNeeded(penny, nickel - 1);
            minNickelsNeeded = MinCountNeeded(nickel, maxCurrencyLevelForTest);                
        }
        else if (maxCurrencyLevelForTest < quarter)
        {
            minPenniesNeeded = MinCountNeeded(penny, nickel - 1);
            minNickelsNeeded = MinCountNeeded(nickel, dime - 1);
            minDimesNeeded = MinCountNeeded(dime, maxCurrencyLevelForTest);
        }
        else
        {
            minPenniesNeeded = MinCountNeeded(penny, nickel - 1);
            minNickelsNeeded = MinCountNeeded(nickel, dime - 1);
            minDimesNeeded = MinCountNeeded(dime, quarter - 1);

            int maxPossilbleValueWithoutQuarters = (minPenniesNeeded * penny + minNickelsNeeded * nickel + minDimesNeeded * dime);
            if (maxCurrencyLevelForTest > maxPossilbleValueWithoutQuarters)
            {               
                minQuartersNeeded = (((maxCurrencyLevelForTest - maxPossilbleValueWithoutQuarters)-1) / quarter) + 1;
            }
        }


        int minCoinsNeeded = minPenniesNeeded + minNickelsNeeded+minDimesNeeded+minQuartersNeeded;

        System.out.println("Min Number of coins needed: {0}"+ minCoinsNeeded);
        System.out.println("Penny: {0} needed"+ minPenniesNeeded);
        System.out.println("Nickels: {0} needed"+ minNickelsNeeded);
        System.out.println("Dimes: {0} needed"+ minDimesNeeded);
        System.out.println("Quarters: {0} needed"+ minQuartersNeeded);
       
    }

    private static int MinCountNeeded(int denomination, int upperRange)
    {
        int remainder;
        return DivRem(upperRange, denomination);
    }

	private static int DivRem(int upperRange, int denomination) {
		// TODO Auto-generated method stub
		return 0;
	}
}
