package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tbv0 implements ubv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f33688a;
    public final m97 b;
    public final ms2 c;

    static {
        k97 k97Var = m97.Companion;
    }

    public tbv0(ms2 ms2Var, m97 m97Var, m0k0 m0k0Var) {
        this.f33688a = m0k0Var;
        this.b = m97Var;
        this.c = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbv0)) {
            return false;
        }
        tbv0 tbv0Var = (tbv0) obj;
        return this.f33688a.equals(tbv0Var.f33688a) && this.b.equals(tbv0Var.b) && this.c.equals(tbv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f33688a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowMakeBetDialog(singleBetGame=" + this.f33688a + ", betInfo=" + this.b + ", entryPointType=" + this.c + Separators.RPAREN;
    }
}
