package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tjw0 extends ujw0 {
    public final byte[] d;
    public final int e;
    public final int f;

    public tjw0(byte[] bArr, int i, int i2) {
        sjw0.f(i, i + i2, bArr.length);
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // a.sjw0
    public final byte b(int i) {
        return this.d[this.e + i];
    }

    @Override // a.sjw0
    public final int e() {
        return this.f;
    }

    @Override // a.sjw0
    public final ujw0 g(int i, int i2) {
        int iF = sjw0.f(i, i2, this.f);
        if (iF == 0) {
            return sjw0.b;
        }
        return new tjw0(this.d, this.e + i, iF);
    }

    @Override // a.sjw0
    public final void i(byte[] bArr, int i) {
        System.arraycopy(this.d, this.e, bArr, 0, i);
    }

    @Override // a.sjw0
    public final boolean j(sjw0 sjw0Var) {
        boolean z = sjw0Var instanceof vjw0;
        if (!z && !(sjw0Var instanceof tjw0)) {
            return sjw0Var.j(this);
        }
        int iE = sjw0Var.e();
        int i = this.f;
        if (i > iE) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > sjw0Var.e()) {
            jf4.o(f140.j(i, "Ran off end of other: 0, ", sjw0Var.e(), ", "));
            return false;
        }
        byte[] bArr = this.d;
        int i2 = this.e;
        if (z) {
            return sjw0.k(bArr, i2, ((vjw0) sjw0Var).d, 0, i);
        }
        if (!(sjw0Var instanceof tjw0)) {
            return sjw0Var.g(0, i).equals(g(i2, i + i2));
        }
        tjw0 tjw0Var = (tjw0) sjw0Var;
        return sjw0.k(bArr, i2, tjw0Var.d, tjw0Var.e, i);
    }

    @Override // a.sjw0
    public final void m(p4 p4Var) {
        p4Var.X0(this.d, this.e, this.f);
    }

    @Override // a.sjw0
    public final int o(int i, int i2) {
        return lkw0.a(i, this.d, this.e, i2);
    }

    @Override // a.sjw0
    public final wjw0 q() {
        return tdw0.o(this.d, this.e, this.f);
    }
}
