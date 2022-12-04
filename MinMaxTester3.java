public class MinMaxTester3 {
    public static void main(String[] args)
    {
//define a object array accounts
        SavingsAccount[] accounts =
                {
//add values to array
                        new SavingsAccount(10),
                        new SavingsAccount(10),
                        new SavingsAccount(5),
                };
//call the method deposit to add elements to account
        accounts[0].deposit(1000);
        accounts[1].deposit(10000);
        accounts[2].deposit(10000);
//iterate a for loop
        for (SavingsAccount a : accounts)
//call addInterest on a
            a.addInterest();
//define a pair mm
        Pair<SavingsAccount, SavingsAccount> mm
                = PairUtil.minmax(accounts);
//get the first element of the pair
        System.out.println(mm.getFirst().getBalance());
//print the expected result
        System.out.println("Expected: 1100");
//print the second element of the pair
        System.out.println(mm.getSecond().getBalance());
//print the expected result
        System.out.println("Expected: 11000");
    }
}
