public class main {

	public static void main(String[] args) {
        final int numDice = 3; // number of dice to throw, must be 1 or greater
        final int numThrows = 3; // number of times all dice will be thrown
        final int numFaces = 6; // number of faces on the dice

        Die[] d1 = new Die[numDice];
        d1 = createDie(numFaces, numFaces, d1);
        shake(d1, numThrows);
    }

    private static void shake(Die[] dice, int numThrows) {
        int grandTotal = 0; // running total of the value for all dice tosses
        for (int x = 0; x < numThrows; x++) { // tosses the dice the correct number of times
            int subTotal = 0; // total of all dice thrown during one toss
            for (int i = 0; i < (dice.length); i++) { // rolls each dice
                dice[i].roll();
                subTotal += dice[i].getFaceValue();
            }
            System.out.print("Toss " + (x + 1) + ": generated a ");
            for (int y = 0; y < dice.length - 1; y++) {// prints all but last face values
                System.out.print(dice[y] + " and a ");
            }
            System.out.println(dice[dice.length - 1] + " for a total of " + subTotal); // prints the last dice value and subtotal for this toss
            grandTotal += subTotal; // total of all the tosses this shake
        }
        System.out.println("Total of the " + numThrows + " tosses is: " + grandTotal + "\n");
    }// end of shake(Die[], int) method

    private static void shake(Die dice, int numThrows) {
        int grandTotal = 0; // total of all tosses
        for (int i = 0; i < numThrows; i++) { // tosses dice the correct number of times
            dice.roll();
            System.out.println("Toss " + (i + 1) + ": generated a " + dice);
            grandTotal += dice.getFaceValue();
        }
        System.out.println("Total of the " + numThrows + " tosses is: " + grandTotal + "\n");
    }// end of shake(Die, int) method

    private static Die[] createDie(int value, int face, Die[] dice) {
		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Die(value, face);
		}
		return dice;
	}// end of createDie(int, int, Die[]) method
}// end of main