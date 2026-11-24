package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ic5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14519a;
    public final int b;

    public ic5(int i, int i2) {
        this.f14519a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic5)) {
            return false;
        }
        ic5 ic5Var = (ic5) obj;
        return this.f14519a == ic5Var.f14519a && this.b == ic5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f14519a) * 31);
    }

    public final String toString() {
        return ohs0.m("BackgroundDrawableResId(teamOneViewBackgroundId=", this.f14519a, ", teamTwoViewBackgroundId=", Separators.RPAREN, this.b);
    }
}
