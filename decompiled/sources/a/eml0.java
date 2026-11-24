package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eml0 implements iml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8052a = axq.g();

    public eml0() {
        aol0 aol0Var = aol0.f1207a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eml0) && this.f8052a.equals(((eml0) obj).f8052a);
    }

    @Override // a.iml0
    public final eol0 f() {
        return aol0.f1207a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f8052a;
    }

    public final int hashCode() {
        return this.f8052a.hashCode();
    }

    public final String toString() {
        return kng0.l("LargeCardLargeTeamLogo(id=", this.f8052a, Separators.RPAREN);
    }
}
