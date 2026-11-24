package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ega implements fga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7755a = axq.g();

    public ega() {
        g9l0 g9l0Var = g9l0.f10920a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ega) && this.f7755a.equals(((ega) obj).f7755a);
    }

    @Override // a.fga
    public final h9l0 f() {
        return g9l0.f10920a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f7755a;
    }

    public final int hashCode() {
        return this.f7755a.hashCode();
    }

    public final String toString() {
        return kng0.l("SmallCardNoTeamLogo(id=", this.f7755a, Separators.RPAREN);
    }
}
