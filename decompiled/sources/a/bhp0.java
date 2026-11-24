package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bhp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2620a;
    public final int b;

    public bhp0(int i, int i2) {
        this.f2620a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhp0)) {
            return false;
        }
        bhp0 bhp0Var = (bhp0) obj;
        return this.f2620a == bhp0Var.f2620a && this.b == bhp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f2620a) * 31);
    }

    public final String toString() {
        return ohs0.m("TeamRatingChartPointModel(year=", this.f2620a, ", rank=", Separators.RPAREN, this.b);
    }
}
