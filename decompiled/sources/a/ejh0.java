package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ejh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7910a;
    public final long b;
    public final boolean c;

    public ejh0(int i, long j, boolean z) {
        this.f7910a = i;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejh0)) {
            return false;
        }
        ejh0 ejh0Var = (ejh0) obj;
        if (this.f7910a != ejh0Var.f7910a) {
            return false;
        }
        long j = ejh0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && this.c == ejh0Var.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f7910a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.c) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f7910a, "SeasonUiModel(season=", ", selectorTextColor=", y3d.i(this.b), ", showDivider="), this.c, Separators.RPAREN);
    }
}
