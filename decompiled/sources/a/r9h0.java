package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30082a;
    public final int b;

    public r9h0(int i, int i2) {
        this.f30082a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9h0)) {
            return false;
        }
        r9h0 r9h0Var = (r9h0) obj;
        return this.f30082a == r9h0Var.f30082a && this.b == r9h0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f30082a) * 31);
    }

    public final String toString() {
        return ohs0.m("ScrollAnchor(index=", this.f30082a, ", offset=", Separators.RPAREN, this.b);
    }
}
