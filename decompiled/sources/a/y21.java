package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y21 implements a5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41886a;
    public final double b;
    public final long c;
    public final double d;
    public final i0w e;
    public final long f;
    public final String g;
    public final String h;

    public y21(String str, double d, long j, double d2, i0w i0wVar, long j2, String str2, String str3) {
        nwd nwdVar = q4f.f28094a;
        this.f41886a = str;
        this.b = d;
        this.c = j;
        this.d = d2;
        this.e = i0wVar;
        this.f = j2;
        this.g = str2;
        this.h = str3;
    }

    @Override // a.a5w
    public final jvw b() {
        return this.e;
    }

    @Override // a.a5w
    public final q4f c() {
        return q4f.b;
    }

    @Override // a.a5w
    public final String d() {
        return this.f41886a;
    }

    @Override // a.a5w
    public final double e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) obj;
        if (!this.f41886a.equals(y21Var.f41886a)) {
            return false;
        }
        nwd nwdVar = q4f.f28094a;
        return Double.compare(this.b, y21Var.b) == 0 && this.c == y21Var.c && Double.compare(0.0d, 0.0d) == 0 && Double.compare(this.d, y21Var.d) == 0 && this.e == y21Var.e && this.f == y21Var.f && this.g.equals(y21Var.g) && this.h.equals(y21Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(rw2.b((this.e.hashCode() + brm0.d(this.d, brm0.d(0.0d, rw2.b(brm0.d(this.b, vqd.b(q4f.b, this.f41886a.hashCode() * 31, 31), 31), 31, this.c), 31), 31)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        q4f q4fVar = q4f.b;
        StringBuilder sb = new StringBuilder("AggregatorHistoryItemModel(betId=");
        sb.append(this.f41886a);
        sb.append(", couponType=");
        sb.append(q4fVar);
        sb.append(", winSum=");
        sb.append(this.b);
        kng0.A(sb, ", date=", this.c, ", coefficient=0.0, betSum=");
        sb.append(this.d);
        sb.append(", status=");
        sb.append(this.e);
        kng0.A(sb, ", typeGame=", this.f, ", gameName=");
        return ua80.m(sb, this.g, ", productName=", this.h, Separators.RPAREN);
    }
}
