package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e4t0 implements g4t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4t0 f7200a;

    public e4t0(l4t0 l4t0Var) {
        this.f7200a = l4t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4t0) && this.f7200a.equals(((e4t0) obj).f7200a);
    }

    public final int hashCode() {
        return this.f7200a.hashCode();
    }

    public final String toString() {
        return "NoScore(winner=" + this.f7200a + Separators.RPAREN;
    }
}
