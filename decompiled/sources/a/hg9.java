package a;

/* JADX INFO: loaded from: classes.dex */
public final class hg9 extends mg9 {
    public final int e;
    public final int f;

    public hg9(byte[] bArr, int i, int i2) {
        super(bArr);
        mg9.e(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // a.mg9
    public final byte b(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(twn.m(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(f140.j(i, "Index > length: ", i2, ", "));
    }

    @Override // a.mg9
    public final void g(byte[] bArr, int i) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // a.mg9
    public final int h() {
        return this.e;
    }

    @Override // a.mg9
    public final byte i(int i) {
        return this.b[this.e + i];
    }

    @Override // a.mg9
    public final int size() {
        return this.f;
    }
}
