package a;

/* JADX INFO: loaded from: classes2.dex */
public final class puw0 extends vuw0 {
    public final int d;
    public final int e;

    public puw0(byte[] bArr, int i, int i2) {
        super(bArr);
        vuw0.j(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // a.vuw0
    public final byte b(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(twn.m(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(f140.j(i, "Index > length: ", i2, ", "));
    }

    @Override // a.vuw0
    public final byte e(int i) {
        return this.b[this.d + i];
    }

    @Override // a.vuw0
    public final int f() {
        return this.d;
    }

    @Override // a.vuw0
    public final int g() {
        return this.e;
    }

    @Override // a.vuw0
    public final void h(byte[] bArr, int i) {
        System.arraycopy(this.b, this.d, bArr, 0, i);
    }
}
