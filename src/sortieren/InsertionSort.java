package sortieren;

public class InsertionSort {
    private int[] a;

    public InsertionSort(int[] a) {
        this.a = a;
    }

    // meine Methode
    public int[] anderesSortieren() {
        // 6 1 3 5 2 4|
        for (int i = 1; i < a.length; i++) {
           int x = a[i];
           int j = i - 1;
           while (j >= 0 && a[j] > x) {
               a[j + 1] = a[j];
               j--;
           }
           a[j + 1] = x;
        }
        return a;
    }

    // Methode aus dem Unterricht
    public int[] sortieren() {
        // 6 1 3 5 2 4|
        for (int i = 1; i < a.length; i++) {
            int j = i;
            // 'j >= 0' auf 'j >= 1' aendern
            while (j >= 1 && a[j] < a[j-1]) {
                Utils.swap(a, j, j-1);
                // j-- hinzugefuegt
                j--;
            }
        }

        return a;
    }
}

/*
    Hausis:
    1. Vervollständigen Sie InsertionSort
    2. Durchlaufen Sie einen kompletten Sortiervorgang mithilfe des Debuggers
    3. Fügen Sie Edge-Cases zu den Testmethoden hinzu
       a) 1, 1, 1, 1, 1
       b) 5, 4, 3, 2, 1
       c) 1, 2, 3, 4, 5
 */