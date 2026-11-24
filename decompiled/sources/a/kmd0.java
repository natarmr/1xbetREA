package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kmd0 implements qmd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f18534a;
    public final m97 b;
    public final ms2 c;

    static {
        k97 k97Var = m97.Companion;
    }

    public kmd0(ms2 ms2Var, m97 m97Var, m0k0 m0k0Var) {
        ms2Var.getClass();
        this.f18534a = m0k0Var;
        this.b = m97Var;
        this.c = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmd0)) {
            return false;
        }
        kmd0 kmd0Var = (kmd0) obj;
        return this.f18534a.equals(kmd0Var.f18534a) && this.b.equals(kmd0Var.b) && Intrinsics.d(this.c, kmd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f18534a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowMakeBetDialog(simpleBetGame=" + this.f18534a + ", betInfo=" + this.b + ", entryPointType=" + this.c + Separators.RPAREN;
    }
}
