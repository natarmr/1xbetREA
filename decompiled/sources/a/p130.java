package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m97 f26180a;
    public final m0k0 b;
    public final ms2 c;

    static {
        k97 k97Var = m97.Companion;
    }

    public p130(ms2 ms2Var, m97 m97Var, m0k0 m0k0Var) {
        this.f26180a = m97Var;
        this.b = m0k0Var;
        this.c = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p130)) {
            return false;
        }
        p130 p130Var = (p130) obj;
        return this.f26180a.equals(p130Var.f26180a) && this.b.equals(p130Var.b) && this.c.equals(p130Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f26180a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowMakeBetDialog(betInfo=" + this.f26180a + ", singleBetGame=" + this.b + ", entryPointType=" + this.c + Separators.RPAREN;
    }
}
