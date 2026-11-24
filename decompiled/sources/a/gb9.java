package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class gb9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11006a;
    public final double b;
    public final String c;
    public final long d;
    public final String e;
    public final boolean f;

    public gb9(double d, long j, long j2, String str, String str2, boolean z) {
        this.f11006a = j;
        this.b = d;
        this.c = str;
        this.d = j2;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb9)) {
            return false;
        }
        gb9 gb9Var = (gb9) obj;
        return this.f11006a == gb9Var.f11006a && Double.compare(this.b, gb9Var.b) == 0 && this.c.equals(gb9Var.c) && this.d == gb9Var.d && this.e.equals(gb9Var.e) && this.f == gb9Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(rw2.b(ua80.b(brm0.d(this.b, Long.hashCode(this.f11006a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f11006a, "BuilderCouponEventModel(type=", ", param=");
        hne.w(sbQ, this.b, ", coef=", this.c);
        kng0.A(sbQ, ", player=", this.d, ", playerName=");
        return defpackage.c.c(this.e, ", blocked=", Separators.RPAREN, sbQ, this.f);
    }
}
