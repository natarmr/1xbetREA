package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tt00 implements ut00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34488a;
    public final int b;

    public tt00(int i, int i2) {
        this.f34488a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt00)) {
            return false;
        }
        tt00 tt00Var = (tt00) obj;
        return this.f34488a == tt00Var.f34488a && this.b == tt00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f34488a) * 31);
    }

    public final String toString() {
        return ohs0.m("ShowRegions(countryId=", this.f34488a, ", selectedRegionId=", Separators.RPAREN, this.b);
    }
}
