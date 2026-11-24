package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27927a;
    public final int b;

    public q100(int i, int i2) {
        this.f27927a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q100)) {
            return false;
        }
        q100 q100Var = (q100) obj;
        return this.f27927a == q100Var.f27927a && this.b == q100Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f27927a) * 31);
    }

    public final String toString() {
        return ohs0.m("LimitsParams(limitValue=", this.f27927a, ", limitType=", Separators.RPAREN, this.b);
    }
}
