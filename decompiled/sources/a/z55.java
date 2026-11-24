package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.view.View;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z55 implements zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43800a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public z55(j83 j83Var, long j) {
        this.f43800a = (byte) 1;
        String str = j83Var.b;
        tyc tycVar = new tyc((byte) 3, false);
        tycVar.d = str;
        tycVar.b = -1;
        tycVar.c = -1;
        this.f = tycVar;
        this.b = o9q0.f(j);
        this.c = o9q0.e(j);
        this.d = -1;
        this.e = -1;
        int iF = o9q0.f(j);
        int iE = o9q0.e(j);
        if (iF < 0 || iF > str.length()) {
            v4i0.m(f140.j(iF, "start (", str.length(), ") offset is outside of text region "));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            v4i0.m(f140.j(iE, "end (", str.length(), ") offset is outside of text region "));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        jf4.o(f140.j(iF, "Do not set reversed range: ", iE, " > "));
        throw null;
    }

    public static String b(int i, int i2, int i3, boolean z) {
        StringBuilder sbM = b1j.m(i, "av01.", Separators.DOT);
        Object[] objArr = {Integer.valueOf(i2)};
        String str = vtt0.f38024a;
        Locale locale = Locale.US;
        sbM.append(String.format(locale, "%02d", objArr));
        sbM.append(z ? "H" : TokenNames.M);
        sbM.append(Separators.DOT);
        sbM.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return sbM.toString();
    }

    public static z55 h(byte[] bArr) throws kq80 {
        try {
            q8b q8bVar = new q8b(bArr, bArr.length);
            q8bVar.n();
            int iG = q8bVar.g(7);
            if (iG != 1) {
                f1t0.g0("Av1Config", "Unsupported av1C version: " + iG);
                return null;
            }
            int iG2 = q8bVar.g(3);
            int iG3 = q8bVar.g(5);
            boolean zF = q8bVar.f();
            int i = q8bVar.f() ? q8bVar.f() ? 12 : 10 : 8;
            q8bVar.o(13);
            String strB = b(iG2, iG3, i, zF);
            if (q8bVar.b() <= 0) {
                return new z55(i, strB);
            }
            q8bVar.n();
            int iG4 = q8bVar.g(4);
            if (iG4 != 1) {
                f1t0.a0("Av1Config", "Unsupported obu_type: " + iG4);
                return new z55(i, strB);
            }
            if (q8bVar.f()) {
                f1t0.a0("Av1Config", "Unsupported obu_extension_flag");
                return new z55(i, strB);
            }
            boolean zF2 = q8bVar.f();
            q8bVar.n();
            if (zF2 && q8bVar.g(8) > 127) {
                f1t0.a0("Av1Config", "Excessive obu_size");
                return new z55(i, strB);
            }
            int iG5 = q8bVar.g(3);
            q8bVar.n();
            if (q8bVar.f()) {
                f1t0.a0("Av1Config", "Unsupported reduced_still_picture_header");
                return new z55(i, strB);
            }
            if (q8bVar.f()) {
                f1t0.a0("Av1Config", "Unsupported timing_info_present_flag");
                return new z55(i, strB);
            }
            if (q8bVar.f()) {
                f1t0.a0("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new z55(i, strB);
            }
            int iG6 = q8bVar.g(5);
            boolean z = false;
            for (int i2 = 0; i2 <= iG6; i2++) {
                q8bVar.o(12);
                if (q8bVar.g(5) > 7) {
                    q8bVar.n();
                }
            }
            int iG7 = q8bVar.g(4);
            int iG8 = q8bVar.g(4);
            q8bVar.o(iG7 + 1);
            q8bVar.o(iG8 + 1);
            if (q8bVar.f()) {
                q8bVar.o(7);
            }
            q8bVar.o(7);
            boolean zF3 = q8bVar.f();
            if (zF3) {
                q8bVar.o(2);
            }
            if ((q8bVar.f() ? 2 : q8bVar.g(1)) > 0 && !q8bVar.f()) {
                q8bVar.o(1);
            }
            if (zF3) {
                q8bVar.o(3);
            }
            q8bVar.o(3);
            boolean zF4 = q8bVar.f();
            if (iG5 == 2 && zF4) {
                q8bVar.n();
            }
            if (iG5 != 1 && q8bVar.f()) {
                z = true;
            }
            if (!q8bVar.f()) {
                return new z55(i, strB);
            }
            int iG9 = q8bVar.g(8);
            int iG10 = q8bVar.g(8);
            return new z55(i, strB, c4d.f(iG9), ((z || iG9 != 1 || iG10 != 13 || q8bVar.g(8) != 0) ? q8bVar.g(1) : 1) == 1 ? 1 : 2, c4d.g(iG10), (byte) 0);
        } catch (RuntimeException e) {
            throw kq80.a("Error parsing AV1 config", e);
        }
    }

    public void a() {
        int i;
        int i2 = this.d;
        x0x.K(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.e == 0)));
    }

    public boolean c(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.b) {
                break;
            }
            if (t(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public boolean d() {
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.b && !i()) {
            i3++;
        }
        boolean z = this.d == this.b;
        this.d = i;
        this.e = i2;
        return !z && c((i3 * 2) + 1);
    }

    public void e(int i, int i2) {
        long jE = s7n0.e(i, i2);
        ((tyc) this.f).d0(i, i2, "");
        long jN = vic.N(s7n0.e(this.b, this.c), jE);
        s(o9q0.f(jN));
        r(o9q0.e(jN));
        int i3 = this.d;
        if (i3 != -1) {
            long jN2 = vic.N(s7n0.e(i3, this.e), jE);
            if (o9q0.c(jN2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = o9q0.f(jN2);
                this.e = o9q0.e(jN2);
            }
        }
    }

    public char f(int i) {
        tyc tycVar = (tyc) this.f;
        hu5 hu5Var = (hu5) tycVar.e;
        if (hu5Var == null) {
            return ((String) tycVar.d).charAt(i);
        }
        if (i < tycVar.b) {
            return ((String) tycVar.d).charAt(i);
        }
        int iD = hu5Var.b - hu5Var.d();
        int i2 = tycVar.b;
        if (i >= iD + i2) {
            return ((String) tycVar.d).charAt(i - ((iD - tycVar.c) + i2));
        }
        int i3 = i - i2;
        int i4 = hu5Var.c;
        char[] cArr = (char[]) hu5Var.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + hu5Var.d];
    }

    public o9q0 g() {
        int i = this.d;
        if (i != -1) {
            return new o9q0(s7n0.e(i, this.e));
        }
        return null;
    }

    public boolean i() {
        boolean z = (((byte[]) this.f)[this.d] & (128 >> this.e)) != 0;
        u();
        return z;
    }

    public int j(int i) {
        int i2;
        this.e += i;
        int i3 = 0;
        while (true) {
            i2 = this.e;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.e = i5;
            byte[] bArr = (byte[]) this.f;
            int i6 = this.d;
            i3 |= (bArr[i6] & 255) << i5;
            if (!t(i6 + 1)) {
                i4 = 1;
            }
            this.d = i6 + i4;
        }
        byte[] bArr2 = (byte[]) this.f;
        int i7 = this.d;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.e = 0;
            this.d = i7 + (t(i7 + 1) ? 2 : 1);
        }
        a();
        return i8;
    }

    public int k() {
        int i = 0;
        while (!i()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? j(i) : 0);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        View view2 = (View) this.f;
        pfx pfxVarI = xiv0Var.f40966a.i(519);
        int i = this.b;
        if (i >= 0) {
            view2.getLayoutParams().height = i + pfxVarI.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + pfxVarI.f26926a, this.d + pfxVarI.b, this.e + pfxVarI.c, view2.getPaddingBottom());
        return xiv0Var;
    }

    public int m() {
        int iK = k();
        return ((iK + 1) / 2) * (iK % 2 == 0 ? -1 : 1);
    }

    public long n() {
        int i = this.d;
        if (i == 0) {
            itt0.a();
            return 0L;
        }
        long[] jArr = (long[]) this.f;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = this.e & (i2 + 1);
        this.d = i - 1;
        return j;
    }

    public void o(int i, int i2, String str) {
        tyc tycVar = (tyc) this.f;
        if (i < 0 || i > tycVar.B()) {
            v4i0.m(f140.j(i, "start (", tycVar.B(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > tycVar.B()) {
            v4i0.m(f140.j(i2, "end (", tycVar.B(), ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            jf4.o(f140.j(i, "Do not set reversed range: ", i2, " > "));
            return;
        }
        tycVar.d0(i, i2, str);
        s(str.length() + i);
        r(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public void p(int i, int i2) {
        tyc tycVar = (tyc) this.f;
        if (i < 0 || i > tycVar.B()) {
            v4i0.m(f140.j(i, "start (", tycVar.B(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > tycVar.B()) {
            v4i0.m(f140.j(i2, "end (", tycVar.B(), ") offset is outside of text region "));
        } else if (i >= i2) {
            jf4.o(f140.j(i, "Do not set reversed or empty range: ", i2, " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public void q(int i, int i2) {
        tyc tycVar = (tyc) this.f;
        if (i < 0 || i > tycVar.B()) {
            v4i0.m(f140.j(i, "start (", tycVar.B(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > tycVar.B()) {
            v4i0.m(f140.j(i2, "end (", tycVar.B(), ") offset is outside of text region "));
        } else if (i > i2) {
            jf4.o(f140.j(i, "Do not set reversed range: ", i2, " > "));
        } else {
            s(i);
            r(i2);
        }
    }

    public void r(int i) {
        if (!(i >= 0)) {
            ycx.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public void s(int i) {
        if (!(i >= 0)) {
            ycx.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public boolean t(int i) {
        int i2 = i - 2;
        if (this.c > i2 || i >= this.b) {
            return false;
        }
        byte[] bArr = (byte[]) this.f;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public String toString() {
        switch (this.f43800a) {
            case 1:
                return ((tyc) this.f).toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        int i = this.e + 1;
        this.e = i;
        if (i == 8) {
            this.e = 0;
            int i2 = this.d;
            this.d = i2 + (t(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public void v(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.d = i4;
        int i5 = (i - (i3 * 8)) + this.e;
        this.e = i5;
        if (i5 > 7) {
            this.d = i4 + 1;
            this.e = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.d) {
                a();
                return;
            } else if (t(i2)) {
                this.d++;
                i2 += 2;
            }
        }
    }

    public /* synthetic */ z55(int i, Object obj, int i2, int i3, int i4, byte b) {
        this.f43800a = b;
        this.b = i;
        this.f = obj;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public z55(byte[] bArr, int i, int i2) {
        this.f43800a = (byte) 4;
        this.f = bArr;
        this.c = i;
        this.d = i;
        this.b = i2;
        this.e = 0;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z55(int i, String str) {
        this(i, str, -1, -1, -1, (byte) 0);
        this.f43800a = (byte) 0;
    }
}
