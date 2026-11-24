package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hml0 implements iml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13314a = axq.g();

    public hml0() {
        dol0 dol0Var = dol0.f6420a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hml0) && this.f13314a.equals(((hml0) obj).f13314a);
    }

    @Override // a.iml0
    public final eol0 f() {
        return dol0.f6420a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f13314a;
    }

    public final int hashCode() {
        return this.f13314a.hashCode();
    }

    public final String toString() {
        return kng0.l("SmallCardNoTeamLogo(id=", this.f13314a, Separators.RPAREN);
    }
}
