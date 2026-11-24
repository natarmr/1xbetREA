package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rfa implements tfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30376a;
    public final pga b;
    public final kga c;
    public final nem d;

    public rfa(long j, pga pgaVar, kga kgaVar, nem nemVar) {
        this.f30376a = j;
        this.b = pgaVar;
        this.c = kgaVar;
        this.d = nemVar;
    }

    @Override // a.tfa
    public final long a() {
        return this.f30376a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfa)) {
            return false;
        }
        rfa rfaVar = (rfa) obj;
        return this.f30376a == rfaVar.f30376a && this.b.equals(rfaVar.b) && this.c.equals(rfaVar.c) && this.d.equals(rfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f30376a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(gameId=" + this.f30376a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
