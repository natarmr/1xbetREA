package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class foa0 implements hoa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9874a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;

    public foa0(String str, String str2, long j, long j2, String str3, String str4, long j3, long j4) {
        str.getClass();
        str2.getClass();
        this.f9874a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
        this.f = str4;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foa0)) {
            return false;
        }
        foa0 foa0Var = (foa0) obj;
        if (!Intrinsics.d(this.f9874a, foa0Var.f9874a) || !Intrinsics.d(this.b, foa0Var.b)) {
            return false;
        }
        long j = foa0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && h2t0.a(this.d, foa0Var.d) && this.e.equals(foa0Var.e) && this.f.equals(foa0Var.f) && h2t0.a(this.g, foa0Var.g) && h2t0.a(this.h, foa0Var.h);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f9874a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.h) + rw2.b(ua80.b(ua80.b(rw2.b(rw2.b(iB, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.d);
        String strI3 = y3d.i(this.g);
        String strI4 = y3d.i(this.h);
        StringBuilder sbN = b1j.n("PointByPointsShortUiModel(scoreOne=", this.f9874a, ", scoreTwo=", this.b, ", scoreOneTextColor=");
        f140.v(sbN, strI, ", scoreTwoTextColor=", strI2, ", advScoreOne=");
        f140.v(sbN, this.e, ", advScoreTwo=", this.f, ", advScoreOneColor=");
        return ua80.m(sbN, strI3, ", advScoreTwoColor=", strI4, Separators.RPAREN);
    }
}
