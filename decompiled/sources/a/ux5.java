package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ux5 extends vx5 {
    /* JADX WARN: Illegal instructions before constructor call */
    public ux5(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new sx5(str, charArray), (Character) '=');
        x0x.A(charArray.length == 64);
    }

    @Override // a.vx5
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        x0x.I(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            sx5 sx5Var = this.f38184a;
            char[] cArr = sx5Var.b;
            char[] cArr2 = sx5Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
