package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vjw0 extends ujw0 {
    public final byte[] d;

    public vjw0(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    @Override // a.sjw0
    public final byte b(int i) {
        return this.d[i];
    }

    @Override // a.sjw0
    public final int e() {
        return this.d.length;
    }

    @Override // a.sjw0
    public final ujw0 g(int i, int i2) {
        byte[] bArr = this.d;
        int iF = sjw0.f(0, i2, bArr.length);
        return iF == 0 ? sjw0.b : new tjw0(bArr, 0, iF);
    }

    @Override // a.sjw0
    public final void i(byte[] bArr, int i) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    @Override // a.sjw0
    public final boolean j(sjw0 sjw0Var) {
        boolean z = sjw0Var instanceof vjw0;
        byte[] bArr = this.d;
        if (z) {
            return Arrays.equals(bArr, ((vjw0) sjw0Var).d);
        }
        if (!(sjw0Var instanceof tjw0)) {
            return sjw0Var.j(this);
        }
        int length = bArr.length;
        if (length > sjw0Var.e()) {
            itt0.w(length, bArr.length);
            return false;
        }
        if (length > sjw0Var.e()) {
            jf4.o(f140.j(length, "Ran off end of other: 0, ", sjw0Var.e(), ", "));
            return false;
        }
        if (sjw0Var instanceof vjw0) {
            return sjw0.k(bArr, 0, ((vjw0) sjw0Var).d, 0, length);
        }
        tjw0 tjw0Var = (tjw0) sjw0Var;
        return sjw0.k(bArr, 0, tjw0Var.d, tjw0Var.e, length);
    }

    @Override // a.sjw0
    public final void m(p4 p4Var) {
        byte[] bArr = this.d;
        p4Var.X0(bArr, 0, bArr.length);
    }

    @Override // a.sjw0
    public final int o(int i, int i2) {
        return lkw0.a(i, this.d, 0, i2);
    }

    @Override // a.sjw0
    public final wjw0 q() {
        byte[] bArr = this.d;
        return tdw0.o(bArr, 0, bArr.length);
    }
}
