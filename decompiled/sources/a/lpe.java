package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lpe implements ope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20436a;
    public final long b;
    public final long c;

    public lpe(boolean z) {
        pz40 pz40Var = s6t0.f31722a;
        long backgroundGroup = s6t0.b().f33626a.getBackgroundGroup();
        long secondary = s6t0.b().f33626a.getSecondary();
        this.f20436a = z;
        this.b = backgroundGroup;
        this.c = secondary;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpe)) {
            return false;
        }
        lpe lpeVar = (lpe) obj;
        if (this.f20436a != lpeVar.f20436a) {
            return false;
        }
        long j = lpeVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, lpeVar.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f20436a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        return axq.n(axq.q("SecondaryAccordion(isExpanded=", ", backgroundColor=", strI, this.f20436a, ", textColor="), y3d.i(this.c), Separators.RPAREN);
    }
}
