package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30969a;
    public final xr8 b;

    public rr8(boolean z, xr8 xr8Var) {
        this.f30969a = z;
        this.b = xr8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr8)) {
            return false;
        }
        rr8 rr8Var = (rr8) obj;
        return this.f30969a == rr8Var.f30969a && this.b.equals(rr8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f30969a) * 31);
    }

    public final String toString() {
        return "ColumnConfiguration(isPaged=" + this.f30969a + ", horizontalPageOffset=" + this.b + Separators.RPAREN;
    }
}
