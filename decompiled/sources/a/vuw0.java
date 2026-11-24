package a;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class vuw0 implements Iterable, Serializable {
    public static final vuw0 c = new vuw0(nvw0.f24208a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38069a = 0;
    public final byte[] b;

    static {
        int i = juw0.f17180a;
    }

    public vuw0(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int j(int i, int i2, int i3) {
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

    public static vuw0 k(byte[] bArr, int i) {
        j(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new vuw0(bArr2);
    }

    public byte b(int i) {
        return this.b[i];
    }

    public byte e(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof vuw0) && g() == ((vuw0) obj).g()) {
            if (g() == 0) {
                return true;
            }
            if (!(obj instanceof vuw0)) {
                return obj.equals(this);
            }
            vuw0 vuw0Var = (vuw0) obj;
            int i = this.f38069a;
            int i2 = vuw0Var.f38069a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iG = g();
                if (iG > vuw0Var.g()) {
                    itt0.w(iG, g());
                    return false;
                }
                if (iG > vuw0Var.g()) {
                    jf4.o(f140.j(iG, "Ran off end of other: 0, ", vuw0Var.g(), ", "));
                    return false;
                }
                byte[] bArr = vuw0Var.b;
                int iF = f() + iG;
                int iF2 = f();
                int iF3 = vuw0Var.f();
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

    public int g() {
        return this.b.length;
    }

    public void h(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public final int hashCode() {
        int i = this.f38069a;
        if (i != 0) {
            return i;
        }
        int iG = g();
        int iF = f();
        byte[] bArr = nvw0.f24208a;
        int i2 = iG;
        for (int i3 = iF; i3 < iF + iG; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f38069a = i2;
        return i2;
    }

    public final ByteArrayInputStream i() {
        return new ByteArrayInputStream(this.b, f(), g());
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new eg9(this);
    }

    public final byte[] l() {
        int iG = g();
        if (iG == 0) {
            return nvw0.f24208a;
        }
        byte[] bArr = new byte[iG];
        h(bArr, iG);
        return bArr;
    }

    public final String toString() {
        vuw0 puw0Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iG = g();
        if (g() <= 50) {
            strConcat = ewm0.y(this);
        } else {
            int iJ = j(0, 47, g());
            if (iJ == 0) {
                puw0Var = c;
            } else {
                puw0Var = new puw0(this.b, f(), iJ);
            }
            strConcat = ewm0.y(puw0Var).concat("...");
        }
        return axq.n(kng0.p(iG, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
