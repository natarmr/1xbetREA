package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hd6 implements jd6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12855a;
    public final boolean b;
    public final String c;
    public final cd6 d;
    public final long e;

    public hd6(boolean z, boolean z2, String str, cd6 cd6Var, long j) {
        this.f12855a = z;
        this.b = z2;
        this.c = str;
        this.d = cd6Var;
        this.e = j;
    }

    @Override // a.jd6
    public final boolean a() {
        return this.f12855a;
    }

    @Override // a.jd6
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd6)) {
            return false;
        }
        hd6 hd6Var = (hd6) obj;
        return this.f12855a == hd6Var.f12855a && this.b == hd6Var.b && this.c.equals(hd6Var.c) && this.d == hd6Var.d && this.e == hd6Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + ua80.b(brm0.e(Boolean.hashCode(this.f12855a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Game(showCouponBadge=", ", showTrackedBadge=", ", coef=", this.f12855a, this.b);
        sbQ.append(this.c);
        sbQ.append(", coefColor=");
        sbQ.append(this.d);
        sbQ.append(", playerId=");
        return brm0.k(this.e, Separators.RPAREN, sbQ);
    }
}
