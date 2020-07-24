package solutionpack;

public class arrays {

    //Instance Variable Property of class arrayAndStrings
      public int[] twoSumProblemArray = new int[4];
      //Instance Array twoSum answer
      public int[] twoSum = new int[2];
    //Instance Variable Property of class arrayAndStrings
    public int[] threeSumProblemArray = new int[6];
    //Instance Array twoSum answer
    public int[] threeSum = new int[3];
      //Class Constructor
      arrays(){
          this.twoSumProblemArray[0] = 2;
          this.twoSumProblemArray[1] = 7;
          this.twoSumProblemArray[2] = 11;
          this.twoSumProblemArray[3] = 15;
          findTwoSum();
          this.threeSumProblemArray[0] = -1;
          this.threeSumProblemArray[1] = 0;
          this.threeSumProblemArray[2] = 1;
          this.threeSumProblemArray[3] = 2;
          this.threeSumProblemArray[4] = -1;
          this.threeSumProblemArray[5] = -4;
          findThreeSum();
          testWhileLoop();
      }
        //Instantiating the arrayStrings class creating an object named 'createInstanceOfClass'
    public static void main(String[] args){
        arrays createInstanceOfClass = new arrays();

    }

    //problemStatement
            //    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
            //
            //    You may assume that each input would have exactly one solution, and you may not use the same element twice.

            //    Given nums = [2, 7, 11, 15], target = 9,
            //
            //    Because nums[0] + nums[1] = 2 + 7 = 9,
            //            return [0, 1].

        //I am able to have this method, without being static, executed upon an instance object of arrayAndStrings, from calling it from the
        //constructor of this particular class
    public void findTwoSum() {
        //iterate over the instance variable array
        for (int i = 0; i < twoSumProblemArray.length; i++){
         //find values in array that are
            for (int y = 0; y < twoSumProblemArray.length; y++){
                if (twoSumProblemArray[i] + twoSumProblemArray[y] == 9){
                    this.twoSum[0] = twoSumProblemArray[i];
                    this.twoSum[1] = twoSumProblemArray[y];
                }
            }
        }
        System.out.println("twoSum[0] = " + this.twoSum[0] + " twoSum[1] = " + this.twoSum[1]);

    }

//Problem Statement:
        //Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

            //    Example:
            //
            //    Given array nums = [-1, 0, 1, 2, -1, -4],
            //
            //    A solution set is:
            //            [
            //            [-1, 0, 1],
            //            [-1, -1, 2]
            //            ]

    private void findThreeSum(){
          //Iteratively compare three different values within an array in a procedural manner such that if a sum of three values within the array
            //is zero. Then instantiate the object with those values in the array 'threeSum.'

            //For loop index = i
                //For loop index = y
                    //For Loop index = z
                        //Conditional: if i + y + z = 0
                            //then: return the values of the array at indexes i, y, and z
        for (int i = 0; i < threeSumProblemArray.length ; i++){
            for (int y = 1; y < threeSumProblemArray.length ; y++){
                for(int z = 2; z < threeSumProblemArray.length ; z++){
                    if(threeSumProblemArray[i] + threeSumProblemArray[y] + threeSumProblemArray[z] == 0){
                        this.threeSum[0] = threeSumProblemArray[i];
                        this.threeSum[1] = threeSumProblemArray[y];
                        this.threeSum[2] = threeSumProblemArray[z];
                        break;
                    }
                }
            }
        }
        System.out.println("threeSum[0] = " + threeSum[0] + " threeSum[1] = " + threeSum[1] + " threeSum[2] = " + threeSum[2]);
    }

    //simple method to utilize a while loop to iterate over an array:
    public void testWhileLoop(){
          int index = 0;
          while (index < threeSumProblemArray.length){
              System.out.println("Test While Loop : " + threeSumProblemArray[index]);
              index++;
          }
    }

    //Array Methods from Concepts 2:

    //Receives: integer array called list. and an integer that is the number of elements in the array
//Returns: iterates and returns the values of the array list
//Example: receives list=[1, 2 , 3] and prints "1" new line "2" new line "3"
    public static void printArray(int [] list, int numElements)
    {
        for(int index = 0; index < numElements; index ++)
        {
            System.out.println(list[index]);
        }
    }
    //Receives: integer list array, integer that indicates the values of the list, and a value to add to the list of e
    //Returns:nothing, but manipulates values in the list to be added to the value given
    //Example: list = [1,2,3] value= [10] manipulates list to be list=[11,12,13]
    public static void increaseByValue(int [] list, int numElements, int value)
    {
        for (int index = 0; index < numElements; index++)
        {
            list[index] = list[index] + value;
        }
    }
    //Receives:integer list array, integer that indicates the values of the list.
    //Returns:the sum of all the values in the list array
    //Example:list=[1, 2 , 3] returns 6

    public static int sumOfArrayValues(int []list, int numElements)
    {
        int sum = 0;
        for (int index = 0; index < numElements; index++)
        {
            sum += list[index];
        }
        return sum;
    }
    //Receives:integer array called list, 2 indexes of the list
    //Returns: Nothing, but swaps the values for the indexes given
    //Example: list=[1, 2 , 3] location1 =[0] location2 = [1] list is now list =[2,1,3]
    public static void swapArrayValues(int [] list, int location1, int location2)
    {
        if (location1<0 || location1 >= list.length)
        {
            return;
        }
        if (location2<0 || location2 > list.length)
        {
            return;
        }

        int num1 = list[location1];
        list[location1]= list[location2];
        list[location2] = num1;
    }

}
