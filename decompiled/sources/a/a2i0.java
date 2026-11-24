package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a2i0 implements b2i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2i0 f126a;

    public a2i0(h2i0 h2i0Var) {
        this.f126a = h2i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2i0) && this.f126a.equals(((a2i0) obj).f126a);
    }

    public final int hashCode() {
        return this.f126a.hashCode();
    }

    public final String toString() {
        return "DismissWithResult(result=" + this.f126a + Separators.RPAREN;
    }
}
