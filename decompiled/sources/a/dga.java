package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dga implements fga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6034a = axq.g();

    public dga() {
        f9l0 f9l0Var = f9l0.f9160a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dga) && this.f6034a.equals(((dga) obj).f6034a);
    }

    @Override // a.fga
    public final h9l0 f() {
        return f9l0.f9160a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f6034a;
    }

    public final int hashCode() {
        return this.f6034a.hashCode();
    }

    public final String toString() {
        return kng0.l("MediumCardSmallTeamLogo(id=", this.f6034a, Separators.RPAREN);
    }
}
