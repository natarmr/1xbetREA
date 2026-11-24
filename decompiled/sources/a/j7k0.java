package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class j7k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t33 f16045a;
    public long b;

    public j7k0(t33 t33Var, long j) {
        this.f16045a = t33Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j7k0) {
            j7k0 j7k0Var = (j7k0) obj;
            if (this.f16045a == j7k0Var.f16045a && qkx.a(this.b, j7k0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f16045a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f16045a + ", startSize=" + qkx.b(this.b) + Separators.RPAREN;
    }
}
