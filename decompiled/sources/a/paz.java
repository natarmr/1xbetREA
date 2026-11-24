package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class paz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26678a;
    public final int b;

    public paz(int i, int i2) {
        this.f26678a = i;
        this.b = i2;
        if (!(i >= 0)) {
            adx.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        adx.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paz)) {
            return false;
        }
        paz pazVar = (paz) obj;
        return this.f26678a == pazVar.f26678a && this.b == pazVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f26678a) * 31);
    }

    public final String toString() {
        return ohs0.m("Interval(start=", this.f26678a, ", end=", Separators.RPAREN, this.b);
    }
}
