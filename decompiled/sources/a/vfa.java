package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vfa implements zfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37320a;
    public final xga b;
    public final sga c;
    public final nem d;

    public vfa(long j, xga xgaVar, sga sgaVar, nem nemVar) {
        this.f37320a = j;
        this.b = xgaVar;
        this.c = sgaVar;
        this.d = nemVar;
    }

    @Override // a.zfa
    public final long a() {
        return this.f37320a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfa)) {
            return false;
        }
        vfa vfaVar = (vfa) obj;
        return this.f37320a == vfaVar.f37320a && this.b.equals(vfaVar.b) && this.c.equals(vfaVar.c) && this.d.equals(vfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f37320a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(gameId=" + this.f37320a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
