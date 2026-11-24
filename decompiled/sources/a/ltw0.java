package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ltw0 extends ntw0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public ltw0(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new htw0(str, charArray), (Character) '=');
        if (charArray.length == 64) {
            return;
        }
        e9d0.o();
        throw null;
    }

    @Override // a.ntw0
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        xsm0.B(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            htw0 htw0Var = this.f24121a;
            char[] cArr = htw0Var.b;
            char[] cArr2 = htw0Var.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
