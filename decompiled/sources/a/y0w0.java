package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y0w0 implements g1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f41827a;

    public y0w0(m7h0 m7h0Var) {
        this.f41827a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0w0) && this.f41827a.equals(((y0w0) obj).f41827a);
    }

    public final int hashCode() {
        return this.f41827a.hashCode();
    }

    public final String toString() {
        return "NewRoot(screen=" + this.f41827a + Separators.RPAREN;
    }
}
