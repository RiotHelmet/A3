// NumberSequenceTest.java

/****************************************************************

NumberSequenceTest is a test program for the classes
ArrayNumberSequence and LinkedNumberSequence.

Author
Fadil Galjic

****************************************************************/

import static java.lang.System.out;

class NumberSequenceTest
{
    public static void main (String[] args)
    {
		// double[] realNumbers =
		//     {8.0, 2.0, 16.0, 5.0, 1.0, 12.0, 4.0};
        // NumberSequence sequence = null;
        // sequence = new ArrayNumberSequence(realNumbers);
        // // sequence = new LinkedNumberSequence(realNumbers);
        // out.println("the sequence:");
        // out.println(sequence);
        // out.println();

        // // add code here
        // out.println("length:" + sequence.length());
        // out.println("one upper bound:" + sequence.upperBound());
        // out.println("one lower bound:" + sequence.lowerBound());
        // out.println();

        // out.println("number at position 3: " + sequence.numberAt(3));
        // out.println("position of 8: " + sequence.positionOf(8));
        // out.println();

        // out.println("is increasing: " + sequence.isIncreasing());
        // out.println("is decreasing: " + sequence.isDecreasing());
        // out.println("contains 16: " + sequence.contains(16));
        // out.println();

        // out.println("add 32:");
        // sequence.add(32);
        // out.println(sequence);

        // out.println("insert 0.0 at position 7:");
        // sequence.insert(7, 0.0);
        // out.println(sequence);

        // out.println("remove at position 7:");
        // sequence.removeAt(7);
        // out.println(sequence);
        // out.println();

        // out.println("corresponding array:");
        // out.println(sequence);

        		double[] realNumbers =
		    {8.0, 2.0, 16.0, 5.0, 1.0, 12.0, 4.0};
        LinkedNumberSequence sequence = null;
        sequence = new LinkedNumberSequence(realNumbers);
        out.println("the sequence:");
        out.println(sequence);
        out.println();

        out.println("length:" + sequence.length());
        out.println("one upper bound:" + sequence.upperBound());
        out.println("one lower bound:" + sequence.lowerBound());
        out.println();

        out.println("number at position 3: " + sequence.numberAt(3));
        out.println("position of 8: " + sequence.positionOf(8));
        out.println();

        out.println("is increasing: " + sequence.isIncreasing());
        out.println("is decreasing: " + sequence.isDecreasing());
        out.println("contains 16: " + sequence.contains(16));
        out.println();

        out.println("add 32:");
        sequence.add(32);
        out.println(sequence);

        out.println("insert 0.0 at position 7:");
        sequence.insert(7, 0.0);
        out.println(sequence);

        out.println("remove at position 7:");
        sequence.removeAt(7);
        out.println(sequence);
        out.println();

        out.println("corresponding array:");
        out.println(sequence);

    }
}