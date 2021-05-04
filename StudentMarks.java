import java.util.Random;
/**
 * This program finds the average of a class using a 2D array.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-03
 */

public final class StudentMarks {
    private StudentMarks() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method finds the average from a 2D array.
    * @param array This value is the array.
    * @return average This value holds the average.
    */
    public static int averageValue(final int[][] array) {

        // variables
        int totalValue = 0;
        int numOfvalues = 0; //keep track of how many numbers are in array
        int average;

        for (int sCount = 0; sCount < array.length; sCount++) {
            // loop goes through first array, then second...
            for (int mCount = 0; mCount < array[sCount].length; mCount++) {
                // loop goes through each value, adds to total

                // adds each value from array to total
                totalValue += array[sCount][mCount];

                // counts how many values
                numOfvalues += 1;
            }
        }

        // calculating average
        average = totalValue / numOfvalues;

        // return statement
        return average;
    }

    /**
    * This method generates a 4x6 array with random numbers.
    * @param args
    */
    public static void main(final String[] args) {

        // Constants
        final int numOfStudents = 3;
        final int numOfAssignments = 5;
        final int randomRange = 100;

        // creating array
        int[][] marksArray = new int[numOfStudents][numOfAssignments];

        // random number variable
        Random rand = new Random();

        // program information
        System.out.println("This program finds the average "
            + "of a class using arrays.");
        System.out.println();

        // for loop to place random numbers within array
        for (int counter = 0; counter < numOfStudents; counter++) {
            // prints each student
            System.out.print("Student " + counter + "'s marks: ");

            for (int counter1 = 0; counter1 < numOfAssignments; counter1++) {
                // assigns each student 6 random marks

                // generating random numbers
                marksArray[counter][counter1] = rand.nextInt(randomRange);

                // print marks out
                System.out.print(marksArray[counter][counter1] + ", ");
            }
            System.out.println();
        }

        // call average function
        int average = averageValue(marksArray);

        // print class average
        System.out.println();
        System.out.println("The class average is " + average);

        System.out.println();
        System.out.println("Done.");
    }
}
