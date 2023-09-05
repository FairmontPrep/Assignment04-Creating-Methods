/*
 * This problem involves the creation and use of a spinner to generate
 * random numbers in a game. A GameSpinner object represents a spinner
 * with a given number of sectors, all equal in size. The GameSpinner
 * class supporrts the following behaviors.
 *      * Creating a new spinner with a specified number of sectors
 *      * Spinning a spinner and reporting the result
 *      * Reporting the length of the current run, the number of 
 *        consecutive spins that are the same as the most recent spin.
 * 
 * The first behavior has already been completed for you (the constructor).
 * You must complete the other two behaviors (spin() and currentRun() methods.)
 * 
 * Refer to README.md for example output
 */

public class GameSpinner {
    private int sectors;
    private int previousSpin = 0;
    private int currentLength = 0;

    // Constructor
    public GameSpinner(int s) {
        sectors = s;
    }

    /*  COMPLETE THIS METHOD
     * This method should 'spin' the spinner and select a random number between
     * 1 and the value of sectors (use '(int)(Math.random() * sectors) + 1').
     * If the new spin is equal to the 'previousSpin' then 'currentLength' should
     * increase by 1; else, 'currentLength' resets to one.
     * Calling this method should also return the value that was spun.
     */
    public int spin() {
        // Insert code here

        return 0;
    }

    /*  COMPLETE THIS METHOD
     * This method should return the 'currentLength' of the GameSpinner class.
     */
    public int currentRun() {
        // Insert code here

        return 0;
    }
}