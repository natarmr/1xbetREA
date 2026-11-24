package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jim0 implements kim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16583a;
    public final umm0 b;
    public final pim0 c;

    public jim0(long j, umm0 umm0Var, pim0 pim0Var) {
        this.f16583a = j;
        this.b = umm0Var;
        this.c = pim0Var;
    }

    @Override // a.kim0
    public final long a() {
        return this.f16583a;
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
        if (!(obj instanceof jim0)) {
            return false;
        }
        jim0 jim0Var = (jim0) obj;
        return this.f16583a == jim0Var.f16583a && this.b.equals(jim0Var.b) && this.c.equals(jim0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f16583a) * 31)) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(gameId=" + this.f16583a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
