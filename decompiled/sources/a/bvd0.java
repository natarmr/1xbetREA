package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bvd0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ivd0 f3275a;
    public final ivd0 b;
    public final myd0 c;

    public bvd0(ivd0 ivd0Var, ivd0 ivd0Var2, myd0 myd0Var) {
        this.f3275a = ivd0Var;
        this.b = ivd0Var2;
        this.c = myd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvd0)) {
            return false;
        }
        bvd0 bvd0Var = (bvd0) obj;
        return this.f3275a.equals(bvd0Var.f3275a) && this.b.equals(bvd0Var.b) && this.c.equals(bvd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f3275a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RainbowGameMainStatisticModel(firstTeamStatistic=" + this.f3275a + ", secondTeamStatistic=" + this.b + ", rainbowSixStatistic=" + this.c + Separators.RPAREN;
    }
}
