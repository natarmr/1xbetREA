package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class whm0 implements yhm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39174a;
    public final sjm0 b;
    public final pim0 c;

    public whm0(long j, sjm0 sjm0Var, pim0 pim0Var) {
        this.f39174a = j;
        this.b = sjm0Var;
        this.c = pim0Var;
    }

    @Override // a.yhm0
    public final long a() {
        return this.f39174a;
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
        if (!(obj instanceof whm0)) {
            return false;
        }
        whm0 whm0Var = (whm0) obj;
        return this.f39174a == whm0Var.f39174a && this.b.equals(whm0Var.b) && this.c.equals(whm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f39174a) * 31)) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(gameId=" + this.f39174a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
