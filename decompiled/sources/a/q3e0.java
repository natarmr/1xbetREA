package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q3e0 implements s3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9a0 f28049a;
    public final b9a0 b;

    static {
        b9a0 b9a0Var = b9a0.g;
    }

    public q3e0(b9a0 b9a0Var, b9a0 b9a0Var2) {
        this.f28049a = b9a0Var;
        this.b = b9a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3e0)) {
            return false;
        }
        q3e0 q3e0Var = (q3e0) obj;
        return this.f28049a.equals(q3e0Var.f28049a) && this.b.equals(q3e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28049a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoPlayerCell(playerModel=" + this.f28049a + ", pairPlayerModel=" + this.b + Separators.RPAREN;
    }
}
