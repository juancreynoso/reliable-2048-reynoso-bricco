/** Port of Cell.canMergeWith(Cell) to ints: a and b are the two cell values. */
public class Subject {
    static boolean canMerge(int a, int b) {
        if (a == 0 && b == 0) {
            return false;
        }
        return a == b;
    }
}
