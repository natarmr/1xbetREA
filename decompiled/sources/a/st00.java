package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class st00 implements ut00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32751a;
    public final int b;

    public st00(int i, int i2) {
        this.f32751a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st00)) {
            return false;
        }
        st00 st00Var = (st00) obj;
        return this.f32751a == st00Var.f32751a && this.b == st00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f32751a) * 31);
    }

    public final String toString() {
        return ohs0.m("ShowCities(regionId=", this.f32751a, ", selectedCityId=", Separators.RPAREN, this.b);
    }
}
