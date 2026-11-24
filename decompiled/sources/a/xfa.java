package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xfa implements zfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40782a;
    public final zga b;
    public final uga c;
    public final nem d;

    public xfa(long j, zga zgaVar, uga ugaVar, nem nemVar) {
        this.f40782a = j;
        this.b = zgaVar;
        this.c = ugaVar;
        this.d = nemVar;
    }

    @Override // a.zfa
    public final long a() {
        return this.f40782a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfa)) {
            return false;
        }
        xfa xfaVar = (xfa) obj;
        return this.f40782a == xfaVar.f40782a && this.b.equals(xfaVar.b) && this.c.equals(xfaVar.c) && this.d.equals(xfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f40782a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(gameId=" + this.f40782a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
