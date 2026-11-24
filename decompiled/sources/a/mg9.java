package a;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class mg9 implements Iterable, Serializable {
    public static final mg9 c = new mg9(fmx.b);
    public static final jg9 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21730a = 0;
    public final byte[] b;

    static {
        d = dw2.a() ? new bj5() : new cl5((byte) 14);
    }

    public mg9(byte[] bArr) {
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

    public static mg9 f(byte[] bArr, int i, int i2) {
        e(i, i + i2, bArr.length);
        return new mg9(d.e(bArr, i, i2));
    }

    public byte b(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof mg9) && size() == ((mg9) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof mg9)) {
                return obj.equals(this);
            }
            mg9 mg9Var = (mg9) obj;
            int i = this.f21730a;
            int i2 = mg9Var.f21730a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > mg9Var.size()) {
                    itt0.w(size, size());
                    return false;
                }
                if (size > mg9Var.size()) {
                    StringBuilder sbM = b1j.m(size, "Ran off end of other: 0, ", ", ");
                    sbM.append(mg9Var.size());
                    throw new IllegalArgumentException(sbM.toString());
                }
                byte[] bArr = mg9Var.b;
                int iH = h() + size;
                int iH2 = h();
                int iH3 = mg9Var.h();
                while (iH2 < iH) {
                    if (this.b[iH2] == bArr[iH3]) {
                        iH2++;
                        iH3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void g(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public int h() {
        return 0;
    }

    public final int hashCode() {
        int i = this.f21730a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iH = h();
        int i2 = size;
        for (int i3 = iH; i3 < iH + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f21730a = i2;
        return i2;
    }

    public byte i(int i) {
        return this.b[i];
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
            strConcat = hxm0.o(this);
        } else {
            int iE = e(0, 47, size());
            strConcat = hxm0.o(iE == 0 ? c : new hg9(this.b, h(), iE)).concat("...");
        }
        return axq.n(kng0.p(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
