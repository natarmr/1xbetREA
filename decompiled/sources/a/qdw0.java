package a;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qdw0 implements Iterable, Serializable {
    public static final pdw0 b = new pdw0(vew0.f37305a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28555a = 0;

    static {
        int i = ldw0.f19874a;
    }

    public static pdw0 k(byte[] bArr, int i, int i2) {
        try {
            return l(bArr, i, i2);
        } catch (zew0 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static pdw0 l(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return b;
        }
        o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new pdw0(bArr2);
    }

    public static int o(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            v4i0.m(vqd.p(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb.append("Beginning index larger than ending index: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb2.append("End index: ");
        sb2.append(i2);
        sb2.append(" >= ");
        sb2.append(i3);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public static /* synthetic */ boolean q(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        o(i, i4, bArr.length);
        o(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte b(int i);

    public abstract int e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qdw0)) {
            return false;
        }
        qdw0 qdw0Var = (qdw0) obj;
        int iE = e();
        if (iE != qdw0Var.e()) {
            return false;
        }
        if (iE == 0) {
            return true;
        }
        int i = this.f28555a;
        int i2 = qdw0Var.f28555a;
        if (i == 0 || i2 == 0 || i == i2) {
            return i(qdw0Var);
        }
        return false;
    }

    public abstract odw0 f(int i, int i2);

    public abstract void g(byte[] bArr, int i);

    public abstract void h(aew0 aew0Var);

    public final int hashCode() {
        int iJ = this.f28555a;
        if (iJ == 0) {
            int iE = e();
            iJ = j(iE, iE);
            if (iJ == 0) {
                iJ = 1;
            }
            this.f28555a = iJ;
        }
        return iJ;
    }

    public abstract boolean i(qdw0 qdw0Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new eg9(this);
    }

    public abstract int j(int i, int i2);

    public final byte[] m() {
        int iE = e();
        if (iE == 0) {
            return vew0.f37305a;
        }
        byte[] bArr = new byte[iE];
        g(bArr, iE);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return axq.n(kng0.p(e(), "<ByteString@", hexString, " size=", " contents=\""), e() <= 50 ? ghm0.w(m()) : ghm0.w(f(0, 47).m()).concat("..."), "\">");
    }
}
