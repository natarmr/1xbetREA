package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pjd implements sjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f27084a;
    public final m97 b;
    public final ms2 c;

    static {
        k97 k97Var = m97.Companion;
    }

    public pjd(ms2 ms2Var, m97 m97Var, m0k0 m0k0Var) {
        ms2Var.getClass();
        this.f27084a = m0k0Var;
        this.b = m97Var;
        this.c = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjd)) {
            return false;
        }
        pjd pjdVar = (pjd) obj;
        return this.f27084a.equals(pjdVar.f27084a) && this.b.equals(pjdVar.b) && Intrinsics.d(this.c, pjdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f27084a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MakeBet(betGame=" + this.f27084a + ", betInfo=" + this.b + ", entryPoint=" + this.c + Separators.RPAREN;
    }
}
