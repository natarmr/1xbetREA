package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vcp0 implements ycp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5a0 f37197a;
    public final g5a0 b;

    public vcp0(g5a0 g5a0Var, g5a0 g5a0Var2) {
        this.f37197a = g5a0Var;
        this.b = g5a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcp0)) {
            return false;
        }
        vcp0 vcp0Var = (vcp0) obj;
        return this.f37197a.equals(vcp0Var.f37197a) && this.b.equals(vcp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37197a.hashCode() * 31);
    }

    public final String toString() {
        return "WithLogoOnlyVertical(firstPlayerLogo=" + this.f37197a + ", secondPlayerLogo=" + this.b + Separators.RPAREN;
    }
}
