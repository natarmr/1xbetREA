package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ktw0 extends ntw0 {
    public final char[] e;

    public ktw0(htw0 htw0Var) {
        super(htw0Var, (Character) null);
        this.e = new char[512];
        char[] cArr = htw0Var.b;
        if (cArr.length != 16) {
            e9d0.o();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // a.ntw0
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        xsm0.B(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
