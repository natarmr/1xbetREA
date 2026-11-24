package a;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class lg9 implements Iterable, Serializable {
    public static final lg9 c = new lg9(dmx.b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19996a = 0;
    public final byte[] b;

    static {
        Class cls = cw2.f5059a;
    }

    public lg9(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            v4i0.m(ua80.e(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            v4i0.m(f140.j(i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        v4i0.m(f140.j(i2, "End index: ", i3, " >= "));
        return 0;
    }

    public byte b(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof lg9) && size() == ((lg9) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof lg9)) {
                return obj.equals(this);
            }
            lg9 lg9Var = (lg9) obj;
            int i = this.f19996a;
            int i2 = lg9Var.f19996a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > lg9Var.size()) {
                    itt0.w(size, size());
                    return false;
                }
                if (size > lg9Var.size()) {
                    StringBuilder sbM = b1j.m(size, "Ran off end of other: 0, ", ", ");
                    sbM.append(lg9Var.size());
                    throw new IllegalArgumentException(sbM.toString());
                }
                byte[] bArr = lg9Var.b;
                int iF = f() + size;
                int iF2 = f();
                int iF3 = lg9Var.f();
                while (iF2 < iF) {
                    if (this.b[iF2] == bArr[iF3]) {
                        iF2++;
                        iF3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int f() {
        return 0;
    }

    public byte g(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.f19996a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iF = f();
        int i2 = size;
        for (int i3 = iF; i3 < iF + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f19996a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new eg9(this);
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = ewm0.r(this);
        } else {
            int iE = e(0, 47, size());
            strConcat = ewm0.r(iE == 0 ? c : new gg9(this.b, f(), iE)).concat("...");
        }
        return axq.n(kng0.p(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
