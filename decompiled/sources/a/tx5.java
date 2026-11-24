package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tx5 extends vx5 {
    public final char[] f;

    public tx5(sx5 sx5Var) {
        super(sx5Var, (Character) null);
        this.f = new char[512];
        char[] cArr = sx5Var.b;
        x0x.A(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // a.vx5
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        x0x.I(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
