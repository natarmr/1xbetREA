package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class um7 implements vm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f35905a;
    public final m97 b;

    static {
        k97 k97Var = m97.Companion;
    }

    public um7(m0k0 m0k0Var, m97 m97Var) {
        this.f35905a = m0k0Var;
        this.b = m97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um7)) {
            return false;
        }
        um7 um7Var = (um7) obj;
        return this.f35905a.equals(um7Var.f35905a) && this.b.equals(um7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35905a.hashCode() * 31);
    }

    public final String toString() {
        return "MakeBet(betGame=" + this.f35905a + ", betInfo=" + this.b + Separators.RPAREN;
    }
}
