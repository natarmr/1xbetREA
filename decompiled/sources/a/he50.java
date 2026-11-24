package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class he50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f12904a;

    public he50(m7h0 m7h0Var) {
        this.f12904a = m7h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he50) && this.f12904a.equals(((he50) obj).f12904a);
    }

    public final int hashCode() {
        return this.f12904a.hashCode();
    }

    public final String toString() {
        return "NewRoot(screen=" + this.f12904a + Separators.RPAREN;
    }
}
