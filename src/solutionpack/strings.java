package solutionpack;

abstract class strings {

    public static void main(String[] args){
        strings.Solution createInstanceOfSubClass = new Solution();
    }

    //Inheritance
    static class Solution extends strings{

        Solution(){
            isPalindrome("civic");
        }

        //Find Palindrome:
        public boolean isPalindrome(String s){
            //loop backwards through String, append to empty String, if the Strings are the same then it is a palindrome

            //Empty String
            String reversedS = "1234";
            //convert string to char array for better parsing
            char[] sToArray = s.toCharArray();
            //Array to fill with characters backwards
            char[] arrayForReversedString = new char[s.length()];
            int indexFromZero = 0;
            for(int i = sToArray.length - 1; i >= 0; i--){
                           arrayForReversedString[indexFromZero] = sToArray[i];
                           indexFromZero++;
            }
            //Assemble reversed string from 'arrayForReversedString' char array
            String reversedString = String.valueOf(arrayForReversedString);
            System.out.println(reversedString);

            if(reversedString.equals(s)){
                System.out.println("A valid palindrome was found");
                return true;
            }
            else{
                System.out.println("No Palindrome was found");
                return false;
            }
        }
    }

}
