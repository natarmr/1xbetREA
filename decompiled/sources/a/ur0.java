package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36141a;
    public final v5q b;
    public final rlk0 c;
    public final y5d0 d;
    public final ep0 e;
    public final boolean f;
    public final int g;
    public final uaq0 h;

    public ur0(long j, v5q v5qVar, rlk0 rlk0Var, y5d0 y5d0Var, ep0 ep0Var, boolean z, int i, uaq0 uaq0Var) {
        this.f36141a = j;
        this.b = v5qVar;
        this.c = rlk0Var;
        this.d = y5d0Var;
        this.e = ep0Var;
        this.f = z;
        this.g = i;
        this.h = uaq0Var;
    }

    public static ur0 a(ur0 ur0Var, v5q v5qVar, rlk0 rlk0Var, y5d0 y5d0Var, uaq0 uaq0Var, int i) {
        long j = ur0Var.f36141a;
        if ((i & 2) != 0) {
            v5qVar = ur0Var.b;
        }
        v5q v5qVar2 = v5qVar;
        if ((i & 4) != 0) {
            rlk0Var = ur0Var.c;
        }
        rlk0 rlk0Var2 = rlk0Var;
        if ((i & 8) != 0) {
            y5d0Var = ur0Var.d;
        }
        y5d0 y5d0Var2 = y5d0Var;
        ep0 ep0Var = ur0Var.e;
        boolean z = ur0Var.f;
        int i2 = ur0Var.g;
        if ((i & 128) != 0) {
            uaq0Var = ur0Var.h;
        }
        uaq0 uaq0Var2 = uaq0Var;
        ur0Var.getClass();
        v5qVar2.getClass();
        rlk0Var2.getClass();
        y5d0Var2.getClass();
        uaq0Var2.getClass();
        return new ur0(j, v5qVar2, rlk0Var2, y5d0Var2, ep0Var, z, i2, uaq0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur0)) {
            return false;
        }
        ur0 ur0Var = (ur0) obj;
        return this.f36141a == ur0Var.f36141a && this.b.equals(ur0Var.b) && this.c.equals(ur0Var.c) && this.d.equals(ur0Var.d) && this.e == ur0Var.e && this.f == ur0Var.f && this.g == ur0Var.g && this.h == ur0Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + twn.a(this.g, brm0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f36141a) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f), 31);
    }

    public final String toString() {
        return "AggregatorFiltersState(partitionId=" + this.f36141a + ", filtersContentState=" + this.b + ", sortingOptionContentState=" + this.c + ", providersContentState=" + this.d + ", screenStyle=" + this.e + ", isAggregatorMethodListEnabled=" + this.f + ", lottieTypeId=" + this.g + ", theme=" + this.h + Separators.RPAREN;
    }
}
