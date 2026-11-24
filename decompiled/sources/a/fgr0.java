package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fgr0 implements hgr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f9505a;
    public final j83 b;

    public fgr0(j83 j83Var, j83 j83Var2) {
        this.f9505a = j83Var;
        this.b = j83Var2;
    }

    @Override // a.hgr0
    public final j83 a() {
        return this.f9505a;
    }

    @Override // a.hgr0
    public final j83 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgr0)) {
            return false;
        }
        fgr0 fgr0Var = (fgr0) obj;
        return this.f9505a.equals(fgr0Var.f9505a) && this.b.equals(fgr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9505a.hashCode() * 31);
    }

    public final String toString() {
        return "WithoutTitle(teamOneScore=" + ((Object) this.f9505a) + ", teamTwoScore=" + ((Object) this.b) + Separators.RPAREN;
    }
}
