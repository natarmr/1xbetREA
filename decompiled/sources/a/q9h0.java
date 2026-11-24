package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28347a;
    public final int b;

    public q9h0(int i, int i2) {
        this.f28347a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9h0)) {
            return false;
        }
        q9h0 q9h0Var = (q9h0) obj;
        return this.f28347a == q9h0Var.f28347a && this.b == q9h0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f28347a) * 31);
    }

    public final String toString() {
        return ohs0.m("ScrollAnchor(index=", this.f28347a, ", offset=", Separators.RPAREN, this.b);
    }
}
