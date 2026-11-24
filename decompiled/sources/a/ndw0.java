package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ndw0 extends odw0 {
    public final byte[] c;
    public final int d;
    public final int e;

    public ndw0(byte[] bArr, int i, int i2) {
        qdw0.o(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // a.qdw0
    public final byte b(int i) {
        return this.c[this.d + i];
    }

    @Override // a.qdw0
    public final int e() {
        return this.e;
    }

    @Override // a.qdw0
    public final odw0 f(int i, int i2) {
        int iO = qdw0.o(i, i2, this.e);
        if (iO == 0) {
            return qdw0.b;
        }
        return new ndw0(this.c, this.d + i, iO);
    }

    @Override // a.qdw0
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // a.qdw0
    public final void h(aew0 aew0Var) {
        aew0Var.c(this.c, this.d, this.e);
    }

    @Override // a.qdw0
    public final boolean i(qdw0 qdw0Var) {
        boolean z = qdw0Var instanceof pdw0;
        if (!z && !(qdw0Var instanceof ndw0)) {
            return qdw0Var.i(this);
        }
        int iE = qdw0Var.e();
        int i = this.e;
        if (i > iE) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= qdw0Var.e()) {
            byte[] bArr = this.c;
            int i2 = this.d;
            if (z) {
                return qdw0.q(bArr, i2, ((pdw0) qdw0Var).c, 0, i);
            }
            if (!(qdw0Var instanceof ndw0)) {
                return qdw0Var.f(0, i).equals(f(i2, i + i2));
            }
            ndw0 ndw0Var = (ndw0) qdw0Var;
            return qdw0.q(bArr, i2, ndw0Var.c, ndw0Var.d, i);
        }
        int iE2 = qdw0Var.e();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(iE2).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(iE2);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // a.qdw0
    public final int j(int i, int i2) {
        return vew0.a(i, this.c, this.d, i2);
    }
}
