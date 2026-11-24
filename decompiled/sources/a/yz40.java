package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yz40 {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(int i, int i2, List list) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(ohs0.m("Index ", i, " is out of bounds. The list has ", " elements.", i2));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(ua80.e(i, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException(ohs0.m("toIndex (", i, ") is more than than the list size (", Separators.RPAREN, i2));
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(ohs0.m("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", ").", i2));
    }
}
