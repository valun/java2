
public class Spisok {

    private Elem first;
    private Elem current;
    private Elem cur;
    int i;

    public void addsp(int value) {

        if (first == null) {
            first = new Elem();
            first.value = value;
        } else {
            current = first;
            while (current.linc != null) {
                current = current.linc;
                cur = current;
            }
            Elem newcurr = new Elem();
            current.linc = newcurr;
            newcurr.value = value;
        }
    }

    public int show(int num) {
        current = first;
        for (i = 1; i < num; i++) {
            current = current.linc;
        }
        return current.value;
    }
}