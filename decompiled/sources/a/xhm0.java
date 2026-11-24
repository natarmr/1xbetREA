package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xhm0 implements yhm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40900a;
    public final zjm0 b;
    public final pim0 c;

    public xhm0(long j, zjm0 zjm0Var, pim0 pim0Var) {
        this.f40900a = j;
        this.b = zjm0Var;
        this.c = pim0Var;
    }

    @Override // a.yhm0
    public final long a() {
        return this.f40900a;
    }

    @Override // a.yhm0
    public final akm0 b() {
        return this.b;
    }

    @Override // a.yhm0
    public final pim0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhm0)) {
            return false;
        }
        xhm0 xhm0Var = (xhm0) obj;
        return this.f40900a == xhm0Var.f40900a && this.b.equals(xhm0Var.b) && this.c.equals(xhm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f40900a) * 31)) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(gameId=" + this.f40900a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
