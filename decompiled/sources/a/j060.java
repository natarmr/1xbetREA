package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j060 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15667a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public j060(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f15667a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j060)) {
            return false;
        }
        j060 j060Var = (j060) obj;
        return this.f15667a == j060Var.f15667a && this.b == j060Var.b && this.c == j060Var.c && this.d == j060Var.d && this.e == j060Var.e && this.f == j060Var.f && this.g == j060Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f15667a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("NoTabsDashboardFiltersElementsConfig(eventsCount=", this.f15667a, ", teamsCount=", ", champsCount=", this.b);
        axq.r(this.c, this.d, ", trackedCount=", ", xGamesCount=", sbT);
        axq.r(this.e, this.f, ", aggregatorCount=", ", viewsCount=", sbT);
        return rz4.j(this.g, Separators.RPAREN, sbT);
    }
}
