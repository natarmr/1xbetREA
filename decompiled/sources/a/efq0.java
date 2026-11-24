package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class efq0 extends hfq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s470 f7729a;

    public efq0(s470 s470Var) {
        s470Var.getClass();
        this.f7729a = s470Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efq0) && this.f7729a == ((efq0) obj).f7729a;
    }

    public final int hashCode() {
        return this.f7729a.hashCode();
    }

    public final String toString() {
        return "CreateCombinationView(gameType=" + this.f7729a + Separators.RPAREN;
    }
}
