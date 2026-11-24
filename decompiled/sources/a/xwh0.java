package a;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class xwh0 extends qg9 {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwh0(byte[][] bArr, int[] iArr) {
        super(qg9.d.f28671a);
        bArr.getClass();
        this.e = bArr;
        this.f = iArr;
    }

    public final qg9 F() {
        return new qg9(w());
    }

    @Override // a.qg9
    public final String a() {
        return F().a();
    }

    @Override // a.qg9
    public final qg9 d(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new qg9(bArrDigest);
    }

    @Override // a.qg9
    public final int e() {
        return this.f[this.e.length - 1];
    }

    @Override // a.qg9
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qg9) {
            qg9 qg9Var = (qg9) obj;
            if (qg9Var.e() == e() && o(0, qg9Var, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // a.qg9
    public final String f() {
        return F().f();
    }

    @Override // a.qg9
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // a.qg9
    public final int i(byte[] bArr, int i) {
        bArr.getClass();
        return F().i(bArr, i);
    }

    @Override // a.qg9
    public final byte[] k() {
        return w();
    }

    @Override // a.qg9
    public final byte l(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        cy2.x(iArr[length], i, 1L);
        int iL = wb.L(this, i);
        return bArr[iL][(i - (iL == 0 ? 0 : iArr[iL - 1])) + iArr[bArr.length + iL]];
    }

    @Override // a.qg9
    public final int m(byte[] bArr, int i) {
        bArr.getClass();
        return F().m(bArr, i);
    }

    @Override // a.qg9
    public final boolean o(int i, qg9 qg9Var, int i2) {
        qg9Var.getClass();
        if (i >= 0 && i <= e() - i2) {
            int i3 = i2 + i;
            int iL = wb.L(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = iL == 0 ? 0 : iArr[iL - 1];
                int i6 = iArr[iL] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + iL];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (qg9Var.q(i4, bArr[iL], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iL++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // a.qg9
    public final boolean q(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= e() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iL = wb.L(this, i);
            while (i < i4) {
                int[] iArr = this.f;
                int i5 = iL == 0 ? 0 : iArr[iL - 1];
                int i6 = iArr[iL] - i5;
                byte[][] bArr2 = this.e;
                int i7 = iArr[bArr2.length + iL];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (cy2.u(bArr2[iL], (i - i5) + i7, bArr, i2, iMin)) {
                    i2 += iMin;
                    i += iMin;
                    iL++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // a.qg9
    public final String r(Charset charset) {
        charset.getClass();
        return F().r(charset);
    }

    @Override // a.qg9
    public final qg9 s(int i, int i2) {
        if (i < 0) {
            c99.s(ua80.e(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > e()) {
            StringBuilder sbM = b1j.m(i2, "endIndex=", " > length(");
            sbM.append(e());
            sbM.append(')');
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            c99.s(f140.j(i2, "endIndex=", i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == e()) {
            return this;
        }
        if (i == i2) {
            return qg9.d;
        }
        int iL = wb.L(this, i);
        int iL2 = wb.L(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) qx3.k(bArr, iL, iL2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (iL <= iL2) {
            int i4 = iL;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iL2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iL != 0 ? iArr2[iL - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new xwh0(bArr2, iArr);
    }

    @Override // a.qg9
    public final String toString() {
        return F().toString();
    }

    @Override // a.qg9
    public final qg9 v() {
        return F().v();
    }

    @Override // a.qg9
    public final byte[] w() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            qx3.f(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // a.qg9
    public final void y(f99 f99Var, int i) {
        int iL = wb.L(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iL == 0 ? 0 : iArr[iL - 1];
            int i4 = iArr[iL] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iL];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            uvh0 uvh0Var = new uvh0(bArr[iL], i6, i6 + iMin, true, false);
            uvh0 uvh0Var2 = f99Var.f9145a;
            if (uvh0Var2 == null) {
                uvh0Var.g = uvh0Var;
                uvh0Var.f = uvh0Var;
                f99Var.f9145a = uvh0Var;
            } else {
                uvh0 uvh0Var3 = uvh0Var2.g;
                uvh0Var3.getClass();
                uvh0Var3.b(uvh0Var);
            }
            i2 += iMin;
            iL++;
        }
        f99Var.b += (long) i;
    }
}
