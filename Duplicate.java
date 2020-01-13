import java.util.Scanner;

public class Duplicate {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        int nums[] = new int[6]; //0-5
        int select;

        //outer for loop
        for (int i=0; i<nums.length; i++){

            System.out.println("Please enter a number between 20 and 200: ");
            select = input.nextInt();

            //check if number is between 20 and 200
            if (select > 19 && select < 201){

                //inner for loop- checks for duplicates
                for (int j=0; j<nums.length; j++){

                    //System.out.println("j = " + j);
                    //check if number already exists
                    if (select == nums[j]){

                        System.out.println("That is a duplicate number");
                        //reset position in loop
                        i--;
                        break;
                    }
                    //check if index is filled
                    else if (nums[j] == 0){

                        nums[j] = select;
                        //display current input numbers
                        for (int k=0; k<nums.length; k++){

                            if (nums[k] != 0) {
                                System.out.print(nums[k] + " ");
                            }

                        }
                        System.out.println();
                        break;
                    }
                }//end for loop
            }
            else {

                System.out.println("Your number must be between 20 and 200.");
                //reset position in loop
                i--;
            }
        }//end for loop


    }
}
