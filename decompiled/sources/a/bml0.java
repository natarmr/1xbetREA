package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bml0 implements cml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2841a;
    public final jol0 b;
    public final xnl0 c;

    public bml0(long j, jol0 jol0Var, xnl0 xnl0Var) {
        this.f2841a = j;
        this.b = jol0Var;
        this.c = xnl0Var;
    }

    @Override // a.cml0
    public final long a() {
        return this.f2841a;
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
        if (!(obj instanceof bml0)) {
            return false;
        }
        bml0 bml0Var = (bml0) obj;
        return this.f2841a == bml0Var.f2841a && this.b.equals(bml0Var.b) && this.c.equals(bml0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f2841a) * 31)) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(gameId=" + this.f2841a + ", topBlock=" + this.b + ", middleBlock=" + this.c + Separators.RPAREN;
    }
}
