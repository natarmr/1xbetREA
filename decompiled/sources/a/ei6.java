package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ei6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7843a;
    public final boolean b;
    public final rh7 c;
    public final double d;
    public final double e;
    public final String f;
    public final boolean g;
    public final long h;
    public final afo i;
    public final long j;
    public final long k;

    public ei6(long j, boolean z, rh7 rh7Var, double d, double d2, String str, boolean z2, long j2, afo afoVar, long j3, long j4) {
        this.f7843a = j;
        this.b = z;
        this.c = rh7Var;
        this.d = d;
        this.e = d2;
        this.f = str;
        this.g = z2;
        this.h = j2;
        this.i = afoVar;
        this.j = j3;
        this.k = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei6)) {
            return false;
        }
        ei6 ei6Var = (ei6) obj;
        return this.f7843a == ei6Var.f7843a && this.b == ei6Var.b && this.c.equals(ei6Var.c) && Double.compare(this.d, ei6Var.d) == 0 && Double.compare(this.e, ei6Var.e) == 0 && this.f.equals(ei6Var.f) && this.g == ei6Var.g && this.h == ei6Var.h && this.i.equals(ei6Var.i) && this.j == ei6Var.j && this.k == ei6Var.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + rw2.b((this.i.hashCode() + rw2.b(brm0.e(ua80.b(brm0.d(this.e, brm0.d(this.d, (this.c.hashCode() + brm0.e(Long.hashCode(this.f7843a) * 31, 31, this.b)) * 31, 31), 31), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f7843a, "BetBuilderMarketEventModel(marketTypeId=", ", blocked=", this.b);
        sbR.append(", player=");
        sbR.append(this.c);
        sbR.append(", parameter=");
        sbR.append(this.d);
        ohs0.A(sbR, this.e, ", coef=", ", coefV=");
        brm0.C(this.f, ", isCenter=", ", polybetRuleId=", sbR, this.g);
        sbR.append(this.h);
        sbR.append(", eventParams=");
        sbR.append(this.i);
        kng0.A(sbR, ", groupId=", this.j, ", shortGroupId=");
        return brm0.k(this.k, Separators.RPAREN, sbR);
    }
}
