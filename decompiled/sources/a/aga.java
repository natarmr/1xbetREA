package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class aga implements fga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f815a = axq.g();

    public aga() {
        c9l0 c9l0Var = c9l0.f3968a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aga) && this.f815a.equals(((aga) obj).f815a);
    }

    @Override // a.fga
    public final h9l0 f() {
        return c9l0.f3968a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f815a;
    }

    public final int hashCode() {
        return this.f815a.hashCode();
    }

    public final String toString() {
        return kng0.l("LargeCardLargeSportIcon(id=", this.f815a, Separators.RPAREN);
    }
}
