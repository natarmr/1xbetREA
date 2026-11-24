package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zil0 implements bjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44445a;
    public final p4n b;
    public final fjl0 c;
    public final ynm d;

    public zil0(long j, p4n p4nVar, fjl0 fjl0Var, ynm ynmVar) {
        this.f44445a = j;
        this.b = p4nVar;
        this.c = fjl0Var;
        this.d = ynmVar;
    }

    @Override // a.bjl0
    public final long a() {
        return this.f44445a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zil0)) {
            return false;
        }
        zil0 zil0Var = (zil0) obj;
        return this.f44445a == zil0Var.f44445a && this.b.equals(zil0Var.b) && this.c.equals(zil0Var.c) && this.d.equals(zil0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f44445a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(gameId=" + this.f44445a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
