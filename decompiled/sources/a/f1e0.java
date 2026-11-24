package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f1e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1e0 f8761a = new e1e0(null);
    public static final k4 b;

    static {
        Integer num = lzx.b;
        b = (num == null || num.intValue() >= 34) ? new sw90() : new wwo();
    }

    public abstract int a(int i);

    public int b() {
        return a(32);
    }

    public int d(int i, int i2) {
        int iB;
        int i3;
        int iA;
        if (i2 <= i) {
            c99.s(ua80.h("Random range is empty: [", Integer.valueOf(i), ", ", Integer.valueOf(i2), ")."));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iB = b() >>> 1;
                    i3 = iB % i4;
                } while ((i4 - 1) + (iB - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iB2 = b();
            if (i <= iB2 && iB2 < i2) {
                return iB2;
            }
        }
    }
}
