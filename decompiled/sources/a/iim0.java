package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class iim0 implements kim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14836a;
    public final nmm0 b;
    public final pim0 c;

    public iim0(long j, nmm0 nmm0Var, pim0 pim0Var) {
        this.f14836a = j;
        this.b = nmm0Var;
        this.c = pim0Var;
    }

    @Override // a.kim0
    public final long a() {
        return this.f14836a;
    }

    @Override // a.kim0
    public final vmm0 b() {
        return this.b;
    }

    @Override // a.kim0
    public final pim0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iim0)) {
            return false;
        }
        iim0 iim0Var = (iim0) obj;
        return this.f14836a == iim0Var.f14836a && this.b.equals(iim0Var.b) && this.c.equals(iim0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f14836a) * 31)) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(gameId=" + this.f14836a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
