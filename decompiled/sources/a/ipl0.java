package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ipl0 implements kpl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15170a;
    public final y4g0 b;

    public ipl0(boolean z, y4g0 y4g0Var) {
        this.f15170a = z;
        this.b = y4g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipl0)) {
            return false;
        }
        ipl0 ipl0Var = (ipl0) obj;
        return this.f15170a == ipl0Var.f15170a && this.b.equals(ipl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f15170a) * 31);
    }

    public final String toString() {
        return "SearchResult(refresh=" + this.f15170a + ", resultState=" + this.b + Separators.RPAREN;
    }
}
