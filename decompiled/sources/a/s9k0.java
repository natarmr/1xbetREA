package a;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s9k0 {
    public static final q9k0 a(q9k0 q9k0Var) {
        if (!(q9k0Var instanceof q9k0)) {
            q9k0Var = null;
        }
        if (q9k0Var != null) {
            return q9k0Var;
        }
        ykd.b("Inconsistent composition");
        csj.b();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        return iC >= 0 ? iC : -(iC + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((bet) arrayList.get(i4)).f2467a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iE = Intrinsics.e(i5, i);
            if (iE < 0) {
                i3 = i4 + 1;
            } else {
                if (iE <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
