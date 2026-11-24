package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dyv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6914a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;
    public final boolean g;

    public dyv0(long j, long j2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f6914a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = j2;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyv0)) {
            return false;
        }
        dyv0 dyv0Var = (dyv0) obj;
        return this.f6914a == dyv0Var.f6914a && this.b.equals(dyv0Var.b) && this.c == dyv0Var.c && this.d == dyv0Var.d && this.e == dyv0Var.e && this.f == dyv0Var.f && this.g == dyv0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + rw2.b(rw2.b(brm0.e(brm0.e(ua80.b(Boolean.hashCode(this.f6914a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("XGamesModel(hasSectionXGames=", ", xGamesName=", this.b, this.f6914a, ", hasXGamesPromo=");
        ua80.u(", hasXGamesFavorite=", ", halloweenLuckyWheelDateStart=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        kng0.A(sbQ, ", halloweenLuckyWheelDateEnd=", this.f, ", hasGamesWildFreebet=");
        return rw2.p(sbQ, this.g, Separators.RPAREN);
    }
}
