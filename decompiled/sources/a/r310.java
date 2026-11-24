package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29765a;
    public final int b;

    public r310(int i, int i2) {
        this.f29765a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r310)) {
            return false;
        }
        r310 r310Var = (r310) obj;
        return this.f29765a == r310Var.f29765a && this.b == r310Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f29765a) * 31);
    }

    public final String toString() {
        return ohs0.m("LolStatisticMatchesMatchGraphModel(value=", this.f29765a, ", second=", Separators.RPAREN, this.b);
    }
}
