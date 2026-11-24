package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fg9 extends kg9 {
    public final int e;
    public final int f;

    public fg9(byte[] bArr, int i, int i2) {
        super(bArr);
        og9.e(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // a.kg9, a.og9
    public final byte b(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(twn.m(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(f140.j(i, "Index > length: ", i2, ", "));
    }

    @Override // a.kg9, a.og9
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.d, this.e, bArr, 0, i);
    }

    @Override // a.kg9
    public final int i() {
        return this.e;
    }

    @Override // a.kg9
    public final byte j(int i) {
        return this.d[this.e + i];
    }

    @Override // a.kg9, a.og9
    public final int size() {
        return this.f;
    }
}
