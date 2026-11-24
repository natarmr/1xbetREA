package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f9m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9161a;
    public final gmm b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;

    public f9m0(int i, gmm gmmVar, long j, boolean z, boolean z2, String str, String str2, boolean z3, int i2) {
        gmmVar = (i2 & 2) != 0 ? fmm.f9790a : gmmVar;
        j = (i2 & 4) != 0 ? y3d.g : j;
        z = (i2 & 8) != 0 ? false : z;
        z2 = (i2 & 16) != 0 ? false : z2;
        str = (i2 & 32) != 0 ? "" : str;
        str2 = (i2 & 64) != 0 ? "" : str2;
        z3 = (i2 & 128) != 0 ? false : z3;
        str.getClass();
        str2.getClass();
        this.f9161a = i;
        this.b = gmmVar;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = str2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9m0)) {
            return false;
        }
        f9m0 f9m0Var = (f9m0) obj;
        if (this.f9161a != f9m0Var.f9161a || !this.b.equals(f9m0Var.b)) {
            return false;
        }
        long j = f9m0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d == f9m0Var.d && this.e == f9m0Var.e && this.f.equals(f9m0Var.f) && this.g.equals(f9m0Var.g) && this.h == f9m0Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f9161a) * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.h) + ua80.b(ua80.b(brm0.e(brm0.e(rw2.b(iHashCode, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("StatisticAppBarUiModel(titleResource=");
        sb.append(this.f9161a);
        sb.append(", navigationBarRightStyle=");
        sb.append(this.b);
        sb.append(", navBarControlColor=");
        brm0.C(strI, ", searchViewExpanded=", ", autoFocus=", sb, this.d);
        f140.s(", searchText=", this.f, ", searchHint=", sb, this.e);
        return defpackage.c.c(this.g, ", hasChevron=", Separators.RPAREN, sb, this.h);
    }
}
