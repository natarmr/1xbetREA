package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g730 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y130 f10795a;
    public final long b;

    public g730(y130 y130Var, long j) {
        this.f10795a = y130Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g730)) {
            return false;
        }
        g730 g730Var = (g730) obj;
        return this.f10795a.equals(g730Var.f10795a) && this.b == g730Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f10795a.hashCode() * 31);
    }

    public final String toString() {
        return "Markets(internalEffect=" + this.f10795a + ", champId=" + this.b + Separators.RPAREN;
    }
}
