package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yll0 implements cml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42849a;
    public final gol0 b;
    public final zml0 c;

    public yll0(long j, gol0 gol0Var, zml0 zml0Var) {
        this.f42849a = j;
        this.b = gol0Var;
        this.c = zml0Var;
    }

    @Override // a.cml0
    public final long a() {
        return this.f42849a;
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
        if (!(obj instanceof yll0)) {
            return false;
        }
        yll0 yll0Var = (yll0) obj;
        return this.f42849a == yll0Var.f42849a && this.b.equals(yll0Var.b) && this.c.equals(yll0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f42849a) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(gameId=" + this.f42849a + ", topBlock=" + this.b + ", middleBlock=" + this.c + Separators.RPAREN;
    }
}
