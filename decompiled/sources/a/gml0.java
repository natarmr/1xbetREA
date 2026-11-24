package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gml0 implements iml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11547a = axq.g();

    public gml0() {
        col0 col0Var = col0.f4707a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gml0) && this.f11547a.equals(((gml0) obj).f11547a);
    }

    @Override // a.iml0
    public final eol0 f() {
        return col0.f4707a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f11547a;
    }

    public final int hashCode() {
        return this.f11547a.hashCode();
    }

    public final String toString() {
        return kng0.l("MediumCardSmallTeamLogo(id=", this.f11547a, Separators.RPAREN);
    }
}
