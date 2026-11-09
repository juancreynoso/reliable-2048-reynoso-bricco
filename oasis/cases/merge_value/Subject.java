/** Same logic as Cell.mergeWith(Cell), returning the int value instead of a Cell. */
public class Subject {
    static int mergeValue(int a, int b) {
        if (a == 0 && b == 0 || a != b) {
            throw new IllegalArgumentException("cannot merge " + a + " and " + b);
        }
        return a * 2;
    }
}
