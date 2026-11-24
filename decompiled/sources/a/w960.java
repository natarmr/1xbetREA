package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class w960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f38764a = new Object[0];
    public static final vy40 b = new vy40(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            v4i0.m(ohs0.m("Index ", i, " is out of bounds. The list has ", " elements.", size));
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            jf4.o(ohs0.m("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", ").", i2));
        } else if (i < 0) {
            v4i0.m(ua80.e(i, "fromIndex (", ") is less than 0."));
        } else {
            if (i2 <= size) {
                return;
            }
            v4i0.m(ohs0.m("toIndex (", i2, ") is more than than the list size (", Separators.RPAREN, size));
        }
    }
}
