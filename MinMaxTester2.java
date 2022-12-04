public class MinMaxTester2 {
    public static void main(String[] args)
    {
//define the string array words
        String[] words =
                {
                        "Mary", "had", "a", "little", "lamb"
                };
//define a pair
        Pair<String, String> mm = PairUtil2.minmax(words);
//get the first element of the pair
        System.out.println(mm.getFirst());
//print the expected result
        System.out.println("Expected: Mary");
//print the second element of the pair
        System.out.println(mm.getSecond());
//print the expected result
        System.out.println("Expected: little");
    }
}
