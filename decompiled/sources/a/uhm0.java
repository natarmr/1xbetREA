package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uhm0 implements yhm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35687a;
    public final ejm0 b;
    public final pim0 c;

    public uhm0(long j, ejm0 ejm0Var, pim0 pim0Var) {
        this.f35687a = j;
        this.b = ejm0Var;
        this.c = pim0Var;
    }

    @Override // a.yhm0
    public final long a() {
        return this.f35687a;
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
        if (!(obj instanceof uhm0)) {
            return false;
        }
        uhm0 uhm0Var = (uhm0) obj;
        return this.f35687a == uhm0Var.f35687a && this.b.equals(uhm0Var.b) && this.c.equals(uhm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f35687a) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(gameId=" + this.f35687a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
