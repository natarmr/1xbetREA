package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iyd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15584a;
    public final int b;
    public final int c;

    public iyd0(String str, int i, int i2) {
        this.f15584a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyd0)) {
            return false;
        }
        iyd0 iyd0Var = (iyd0) obj;
        return this.f15584a.equals(iyd0Var.f15584a) && this.b == iyd0Var.b && this.c == iyd0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f15584a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.p(this.b, "RainbowSixStatisticMapModel(name=", this.f15584a, ", firstTeamScore=", ", secondTeamScore="));
    }
}
