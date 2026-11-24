package a;

import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z8q0 f491a;
    public final bw40 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public a9q0(z8q0 z8q0Var, bw40 bw40Var, long j) {
        float lineBaseline;
        this.f491a = z8q0Var;
        this.b = bw40Var;
        this.c = j;
        ArrayList arrayList = bw40Var.h;
        float fH = 0.0f;
        if (arrayList.isEmpty()) {
            lineBaseline = 0.0f;
        } else {
            y8q0 y8q0Var = ((yn80) arrayList.get(0)).f42927a.d;
            Paint.FontMetricsInt fontMetricsInt = y8q0Var.l;
            lineBaseline = y8q0Var.h + ((y8q0Var.g + (-1) != 0 || fontMetricsInt == null) ? y8q0Var.f.getLineBaseline(0) : y8q0Var.h(0) - fontMetricsInt.ascent) + 0.0f;
        }
        this.d = lineBaseline;
        if (!arrayList.isEmpty()) {
            yn80 yn80Var = (yn80) CollectionsKt.d0(arrayList);
            y8q0 y8q0Var2 = yn80Var.f42927a.d;
            int i = y8q0Var2.g - 1;
            Paint.FontMetricsInt fontMetricsInt2 = y8q0Var2.l;
            fH = y8q0Var2.h + (fontMetricsInt2 != null ? y8q0Var2.h(i) - fontMetricsInt2.ascent : y8q0Var2.f.getLineBaseline(i)) + 0.0f + yn80Var.f;
        }
        this.e = fH;
        this.f = bw40Var.g;
    }

    public final xsf0 a(int i) {
        bw40 bw40Var = this.b;
        bw40Var.k(i);
        int length = ((j83) bw40Var.f3309a.f38604a).b.length();
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(i == length ? arrayList.size() - 1 : b8k0.B(i, arrayList));
        return yn80Var.f42927a.d.f.isRtlCharAt(yn80Var.d(i)) ? xsf0.b : xsf0.f41414a;
    }

    public final jge0 b(int i) {
        float fJ;
        float fJ2;
        float fI;
        float fI2;
        bw40 bw40Var = this.b;
        bw40Var.j(i);
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.B(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int iD = yn80Var.d(i);
        CharSequence charSequence = s03Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            ycx.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + Separators.RPAREN);
        }
        y8q0 y8q0Var = s03Var.d;
        int iF = y8q0Var.f(iD);
        float fH = y8q0Var.h(iF);
        float fD = y8q0Var.d(iF);
        Layout layout = y8q0Var.f;
        boolean z = layout.getParagraphDirection(iF) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fI = y8q0Var.j(iD, false);
                fI2 = y8q0Var.j(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fI = y8q0Var.i(iD, false);
                fI2 = y8q0Var.i(iD + 1, true);
            } else {
                fJ = y8q0Var.j(iD, false);
                fJ2 = y8q0Var.j(iD + 1, true);
            }
            float f = fI;
            fJ = fI2;
            fJ2 = f;
        } else {
            fJ = y8q0Var.i(iD, false);
            fJ2 = y8q0Var.i(iD + 1, true);
        }
        RectF rectF = new RectF(fJ, fH, fJ2, fD);
        return yn80Var.a(new jge0(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final jge0 c(int i) {
        bw40 bw40Var = this.b;
        bw40Var.k(i);
        int length = ((j83) bw40Var.f3309a.f38604a).b.length();
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(i == length ? arrayList.size() - 1 : b8k0.B(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int iD = yn80Var.d(i);
        CharSequence charSequence = s03Var.e;
        y8q0 y8q0Var = s03Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            ycx.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fI = y8q0Var.i(iD, false);
        int iF = y8q0Var.f(iD);
        return yn80Var.a(new jge0(fI, y8q0Var.h(iF) + 0.0f, fI, y8q0Var.d(iF) + 0.0f));
    }

    public final boolean d() {
        bw40 bw40Var = this.b;
        return bw40Var.c || ((float) ((int) (this.c & 4294967295L))) < bw40Var.e;
    }

    public final boolean e() {
        return ((float) ((int) (this.c >> 32))) < this.b.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a9q0) {
            a9q0 a9q0Var = (a9q0) obj;
            if (Intrinsics.d(this.f491a, a9q0Var.f491a) && this.b == a9q0Var.b && qkx.a(this.c, a9q0Var.c) && this.d == a9q0Var.d && this.e == a9q0Var.e && this.f.equals(a9q0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return e() || d();
    }

    public final float g(int i) {
        bw40 bw40Var = this.b;
        bw40Var.l(i);
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.C(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int i2 = i - yn80Var.d;
        y8q0 y8q0Var = s03Var.d;
        return y8q0Var.f.getLineLeft(i2) + (i2 == y8q0Var.g + (-1) ? y8q0Var.j : 0.0f);
    }

    public final float h(int i) {
        bw40 bw40Var = this.b;
        bw40Var.l(i);
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.C(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int i2 = i - yn80Var.d;
        y8q0 y8q0Var = s03Var.d;
        return y8q0Var.f.getLineRight(i2) + (i2 == y8q0Var.g + (-1) ? y8q0Var.k : 0.0f);
    }

    public final int hashCode() {
        return this.f.hashCode() + defpackage.c.a(defpackage.c.a(rw2.b((this.b.hashCode() + (this.f491a.hashCode() * 31)) * 31, 31, this.c), this.d, 31), this.e, 31);
    }

    public final int i(int i) {
        bw40 bw40Var = this.b;
        bw40Var.l(i);
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.C(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        return s03Var.d.f.getLineStart(i - yn80Var.d) + yn80Var.b;
    }

    public final xsf0 j(int i) {
        bw40 bw40Var = this.b;
        bw40Var.k(i);
        int length = ((j83) bw40Var.f3309a.f38604a).b.length();
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(i == length ? arrayList.size() - 1 : b8k0.B(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int iD = yn80Var.d(i);
        y8q0 y8q0Var = s03Var.d;
        return y8q0Var.f.getParagraphDirection(y8q0Var.f(iD)) == 1 ? xsf0.f41414a : xsf0.b;
    }

    public final w03 k(int i, int i2) {
        bw40 bw40Var = this.b;
        j83 j83Var = (j83) bw40Var.f3309a.f38604a;
        if (i < 0 || i > i2 || i2 > j83Var.b.length()) {
            int length = j83Var.b.length();
            StringBuilder sbT = dw9.t("Start(", i, ") or End(", ") is out of range [0..", i2);
            sbT.append(length);
            sbT.append("), or start > end!");
            ycx.a(sbT.toString());
        }
        if (i == i2) {
            return z03.a();
        }
        w03 w03VarA = z03.a();
        b8k0.E(bw40Var.h, s7n0.e(i, i2), new sva((byte) 2, i, i2, w03VarA));
        return w03VarA;
    }

    public final long l(int i) {
        int iB0;
        int iN;
        int iN2;
        bw40 bw40Var = this.b;
        bw40Var.k(i);
        int length = ((j83) bw40Var.f3309a.f38604a).b.length();
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(i == length ? arrayList.size() - 1 : b8k0.B(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int iD = yn80Var.d(i);
        tyc tycVarK = s03Var.d.k();
        if (tycVarK.J(tycVarK.b0(iD))) {
            tycVarK.i(iD);
            iB0 = iD;
            while (iB0 != -1 && (!tycVarK.J(iB0) || tycVarK.F(iB0))) {
                iB0 = tycVarK.b0(iB0);
            }
        } else {
            tycVarK.i(iD);
            if (tycVarK.I(iD)) {
                iB0 = (!tycVarK.G(iD) || tycVarK.E(iD)) ? tycVarK.b0(iD) : iD;
            } else {
                iB0 = tycVarK.E(iD) ? tycVarK.b0(iD) : -1;
            }
        }
        if (iB0 == -1) {
            iB0 = iD;
        }
        if (tycVarK.F(tycVarK.N(iD))) {
            tycVarK.i(iD);
            iN = iD;
            while (iN != -1 && (tycVarK.J(iN) || !tycVarK.F(iN))) {
                iN = tycVarK.N(iN);
            }
        } else {
            tycVarK.i(iD);
            if (tycVarK.E(iD)) {
                if (!tycVarK.G(iD) || tycVarK.I(iD)) {
                    iN2 = tycVarK.N(iD);
                    iN = iN2;
                } else {
                    iN = iD;
                }
            } else if (tycVarK.I(iD)) {
                iN2 = tycVarK.N(iD);
                iN = iN2;
            } else {
                iN = -1;
            }
        }
        if (iN != -1) {
            iD = iN;
        }
        return yn80Var.b(false, s7n0.e(iB0, iD));
    }

    public final boolean m(int i) {
        bw40 bw40Var = this.b;
        bw40Var.l(i);
        ArrayList arrayList = bw40Var.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.C(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int i2 = i - yn80Var.d;
        Layout layout = s03Var.d.f;
        ThreadLocal threadLocal = c9q0.f3974a;
        return layout.getEllipsisCount(i2) > 0;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f491a + ", multiParagraph=" + this.b + ", size=" + qkx.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + Separators.RPAREN;
    }
}
