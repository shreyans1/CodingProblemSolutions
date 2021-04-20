class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        List<Character> ca = new ArrayList<>();
        for(char c : str.toCharArray())
        {
        	ca.add(c);
        }

        

        int low = 0 ;
        int high = ca.size()-1;
        while(low<high)
        {
        	char temp = ca.get(low);
        	ca.set(low,ca.get(high));
        	ca.set(high,temp);
        	low++;
        	high--;

        }

        StringBuilder s = new StringBuilder();
        for(Character ct : ca)
        {
        	s.append(ct);
        }
        return s.toString();


    }
}