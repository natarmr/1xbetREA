package a;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sjw0 implements Serializable, Iterable {
    public static final vjw0 b = new vjw0(lkw0.f20222a);
    public static final sxs0 c = new sxs0((byte) 24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32322a = 0;

    public static int f(int i, int i2, int i3) {
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

    public static vjw0 h(byte[] bArr, int i, int i2) {
        try {
            return l(bArr, i, i2);
        } catch (qkw0 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* synthetic */ boolean k(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        f(i, i4, bArr.length);
        f(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static vjw0 l(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return b;
        }
        f(i, i + i2, bArr.length);
        c.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new vjw0(bArr2);
    }

    public abstract byte b(int i);

    public abstract int e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sjw0)) {
            return false;
        }
        sjw0 sjw0Var = (sjw0) obj;
        int iE = e();
        if (iE != sjw0Var.e()) {
            return false;
        }
        if (iE == 0) {
            return true;
        }
        int i = this.f32322a;
        int i2 = sjw0Var.f32322a;
        if (i == 0 || i2 == 0 || i == i2) {
            return j(sjw0Var);
        }
        return false;
    }

    public abstract ujw0 g(int i, int i2);

    public final int hashCode() {
        int iO = this.f32322a;
        if (iO == 0) {
            int iE = e();
            iO = o(iE, iE);
            if (iO == 0) {
                iO = 1;
            }
            this.f32322a = iO;
        }
        return iO;
    }

    public abstract void i(byte[] bArr, int i);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new eg9(this);
    }

    public abstract boolean j(sjw0 sjw0Var);

    public abstract void m(p4 p4Var);

    public abstract int o(int i, int i2);

    public abstract wjw0 q();

    public final byte[] r() {
        int iE = e();
        if (iE == 0) {
            return lkw0.f20222a;
        }
        byte[] bArr = new byte[iE];
        i(bArr, iE);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return axq.n(kng0.p(e(), "<ByteString@", hexString, " size=", " contents=\""), e() <= 50 ? jpm0.v(r()) : jpm0.v(g(0, 47).r()).concat("..."), "\">");
    }
}
