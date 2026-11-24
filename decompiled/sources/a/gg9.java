package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gg9 extends lg9 {
    public final int d;
    public final int e;

    public gg9(byte[] bArr, int i, int i2) {
        super(bArr);
        lg9.e(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // a.lg9
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

    @Override // a.lg9
    public final int f() {
        return this.d;
    }

    @Override // a.lg9
    public final byte g(int i) {
        return this.b[this.d + i];
    }

    @Override // a.lg9
    public final int size() {
        return this.e;
    }
}
