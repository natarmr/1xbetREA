package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gim0 implements kim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11356a;
    public final zlm0 b;
    public final pim0 c;

    public gim0(long j, zlm0 zlm0Var, pim0 pim0Var) {
        this.f11356a = j;
        this.b = zlm0Var;
        this.c = pim0Var;
    }

    @Override // a.kim0
    public final long a() {
        return this.f11356a;
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
        if (!(obj instanceof gim0)) {
            return false;
        }
        gim0 gim0Var = (gim0) obj;
        return this.f11356a == gim0Var.f11356a && this.b.equals(gim0Var.b) && this.c.equals(gim0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f11356a) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(gameId=" + this.f11356a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
