package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f39313a;
    public final int b;
    public final boolean c;
    public final sa50 d;
    public final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public wkm(int i, int i2, boolean z, sa50 sa50Var, long j) {
        this.f39313a = i;
        this.b = i2;
        this.c = z;
        this.d = sa50Var;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkm)) {
            return false;
        }
        wkm wkmVar = (wkm) obj;
        if (this.f39313a != wkmVar.f39313a || this.b != wkmVar.b || this.c != wkmVar.c || !this.d.equals(wkmVar.d)) {
            return false;
        }
        long j = wkmVar.e;
        int i = y3d.h;
        return h2t0.a(this.e, j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + brm0.e(twn.a(this.b, Integer.hashCode(this.f39313a) * 31, 31), 31, this.c)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + iHashCode;
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        StringBuilder sbT = dw9.t("DsNavigationBarIconUiModel(buttonId=", this.f39313a, ", iconResId=", ", enabled=", this.b);
        sbT.append(this.c);
        sbT.append(", iconDecoration=");
        sbT.append(this.d);
        sbT.append(", iconColor=");
        return axq.n(sbT, strI, Separators.RPAREN);
    }
}
