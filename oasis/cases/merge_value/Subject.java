/** Port of Cell.mergeWith(Cell) before the overflow fix: returns the value of the merged cell. */
public class Subject {
    static int mergeValue(int a, int b) {
        if (a == 0 && b == 0 || a != b) {
            throw new IllegalArgumentException("cannot merge " + a + " and " + b);
        }
        return a * 2;
    }
}
