class Solution {
    public boolean isValid(String s) {
        int lengthOfs = s.length(); 

        if (lengthOfs % 2 != 0) {
            return false;
        }
        // HashSet<Character> openingBraces = new HashSet<>(); 
        // openingBraces.add('(');
        // openingBraces.add('{');
        // openingBraces.add('[');

        // HashSet<Character> closingBraces = new HashSet<>(); 
        // openingBraces.add(')');
        // openingBraces.add('}');
        // openingBraces.add(']');

        HashMap<Character, Character> MaP = new HashMap<>();
        MaP.put('(', ')'); 
        MaP.put('{', '}'); 
        MaP.put('[', ']'); 

        Stack<Character> space = new Stack<>();

        for(Character present : s.toCharArray()) {
            System.out.println("present is : " + present);
            
            // just add the opening character
            if (   present == '('  ||   present == '{'    ||    present == '[') {
                System.out.println("im executed");
                space.push(present);
            }

            // check if the closing character matches
            else {            

                if (space.size() <= 0) {
                    return false;
                }
                Character last = space.peek(); // 'last', an opening character
                System.out.println(".  last is    " + last);
                Character correspongCloseForLast = MaP.get(last); // a closing character
                System.out.println(".  correspongCloseForLast.  " + correspongCloseForLast);

                // if present(a closing bracket) is equal to hashmap.get(last)
                // see if there's a match
                
                // if present is not equal to correspongCloseForLast
                    // return false
                
                if (present != correspongCloseForLast) {
                    return false;
                }

                space.pop();
            }
        }


        if (space.empty()){
            return true;
        }

        return false; 
        

    }
}
