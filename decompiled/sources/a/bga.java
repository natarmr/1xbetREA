package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bga implements fga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2544a = axq.g();

    public bga() {
        d9l0 d9l0Var = d9l0.f5707a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bga) && this.f2544a.equals(((bga) obj).f2544a);
    }

    @Override // a.fga
    public final h9l0 f() {
        return d9l0.f5707a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f2544a;
    }

    public final int hashCode() {
        return this.f2544a.hashCode();
    }

    public final String toString() {
        return kng0.l("LargeCardLargeTeamLogo(id=", this.f2544a, Separators.RPAREN);
    }
}
