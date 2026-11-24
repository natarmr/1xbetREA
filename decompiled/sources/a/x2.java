package a;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {
    public x2(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            hny.k(i3, dw9.t("startIndex: ", i, ", endIndex: ", ", size: ", i2));
        } else {
            if (i <= i2) {
                return;
            }
            jf4.o(f140.j(i, "startIndex: ", i2, " > endIndex: "));
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            v4i0.m(f140.j(i, "index: ", i2, ", size: "));
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i > i2) {
            v4i0.m(f140.j(i, "index: ", i2, ", size: "));
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            hny.k(i3, dw9.t("fromIndex: ", i, ", toIndex: ", ", size: ", i2));
        } else {
            if (i <= i2) {
                return;
            }
            jf4.o(f140.j(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    public static int e(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            return i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i3;
    }
}
