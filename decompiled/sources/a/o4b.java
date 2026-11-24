package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o4b implements x4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx70 f24625a;

    public o4b(jx70 jx70Var) {
        this.f24625a = jx70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4b) && this.f24625a.equals(((o4b) obj).f24625a);
    }

    public final int hashCode() {
        return this.f24625a.hashCode();
    }

    public final String toString() {
        return "OnChangeOpenTab(tabState=" + this.f24625a + Separators.RPAREN;
    }
}
