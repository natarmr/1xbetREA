package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class pdw0 extends odw0 {
    public final byte[] c;

    public pdw0(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // a.qdw0
    public final byte b(int i) {
        return this.c[i];
    }

    @Override // a.qdw0
    public final int e() {
        return this.c.length;
    }

    @Override // a.qdw0
    public final odw0 f(int i, int i2) {
        byte[] bArr = this.c;
        int iO = qdw0.o(0, i2, bArr.length);
        return iO == 0 ? qdw0.b : new ndw0(bArr, 0, iO);
    }

    @Override // a.qdw0
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // a.qdw0
    public final void h(aew0 aew0Var) {
        byte[] bArr = this.c;
        aew0Var.c(bArr, 0, bArr.length);
    }

    @Override // a.qdw0
    public final boolean i(qdw0 qdw0Var) {
        boolean z = qdw0Var instanceof pdw0;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((pdw0) qdw0Var).c);
        }
        boolean z2 = qdw0Var instanceof ndw0;
        if (!z2) {
            return qdw0Var.i(this);
        }
        ndw0 ndw0Var = (ndw0) qdw0Var;
        int i = ndw0Var.e;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= i) {
            if (z) {
                return qdw0.q(bArr, 0, ((pdw0) qdw0Var).c, 0, length);
            }
            return z2 ? qdw0.q(bArr, 0, ndw0Var.c, ndw0Var.d, length) : qdw0Var.f(0, length).equals(f(0, length));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // a.qdw0
    public final int j(int i, int i2) {
        return vew0.a(i, this.c, 0, i2);
    }
}
