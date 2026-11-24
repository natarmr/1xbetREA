package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class aml0 implements cml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1114a;
    public final iol0 b;
    public final pnl0 c;

    public aml0(long j, iol0 iol0Var, pnl0 pnl0Var) {
        this.f1114a = j;
        this.b = iol0Var;
        this.c = pnl0Var;
    }

    @Override // a.cml0
    public final long a() {
        return this.f1114a;
    }

    @Override // a.cml0
    public final ynl0 b() {
        return this.c;
    }

    @Override // a.cml0
    public final kol0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aml0)) {
            return false;
        }
        aml0 aml0Var = (aml0) obj;
        return this.f1114a == aml0Var.f1114a && this.b.equals(aml0Var.b) && this.c.equals(aml0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f1114a) * 31)) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(gameId=" + this.f1114a + ", topBlock=" + this.b + ", middleBlock=" + this.c + Separators.RPAREN;
    }
}
