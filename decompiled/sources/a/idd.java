package a;

/* JADX INFO: loaded from: classes6.dex */
public class idd extends hdd {
    public static int c(int[] iArr, int i) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static Comparable d(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static Comparable e(ycl yclVar, ycl yclVar2) {
        return yclVar.compareTo(yclVar2) <= 0 ? yclVar : yclVar2;
    }
}
