package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fd6 implements jd6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9344a;
    public final boolean b;
    public final String c;

    public fd6(String str, boolean z, boolean z2) {
        this.f9344a = z;
        this.b = z2;
        this.c = str;
    }

    @Override // a.jd6
    public final boolean a() {
        return this.b;
    }

    @Override // a.jd6
    public final boolean b() {
        return this.f9344a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd6)) {
            return false;
        }
        fd6 fd6Var = (fd6) obj;
        return this.f9344a == fd6Var.f9344a && this.b == fd6Var.b && this.c.equals(fd6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f9344a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(f140.q("Blocked(showTrackedBadge=", ", showCouponBadge=", ", coef=", this.f9344a, this.b), this.c, Separators.RPAREN);
    }
}
