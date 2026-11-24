package a;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class og9 implements Iterable, Serializable {
    public static final kg9 b = new kg9(cmx.b);
    public static final ig9 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25206a;

    static {
        c = bw2.a() ? new kl5() : new yk5();
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

    public static kg9 f(byte[] bArr, int i, int i2) {
        e(i, i + i2, bArr.length);
        return new kg9(c.e(bArr, i, i2));
    }

    public abstract byte b(int i);

    public abstract void g(byte[] bArr, int i);

    public final byte[] h() {
        int size = size();
        if (size == 0) {
            return cmx.b;
        }
        byte[] bArr = new byte[size];
        g(bArr, size);
        return bArr;
    }

    public final int hashCode() {
        int i = this.f25206a;
        if (i != 0) {
            return i;
        }
        int size = size();
        kg9 kg9Var = (kg9) this;
        int i2 = kg9Var.i();
        int i3 = size;
        for (int i4 = i2; i4 < i2 + size; i4++) {
            i3 = (i3 * 31) + kg9Var.d[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.f25206a = i3;
        return i3;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = pvm0.p(this);
        } else {
            kg9 kg9Var = (kg9) this;
            int iE = e(0, 47, kg9Var.size());
            strConcat = pvm0.p(iE == 0 ? b : new fg9(kg9Var.d, kg9Var.i(), iE)).concat("...");
        }
        return axq.n(kng0.p(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
