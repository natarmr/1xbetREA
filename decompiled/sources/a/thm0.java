package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class thm0 implements yhm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33968a;
    public final xim0 b;
    public final pim0 c;

    public thm0(long j, xim0 xim0Var, pim0 pim0Var) {
        this.f33968a = j;
        this.b = xim0Var;
        this.c = pim0Var;
    }

    @Override // a.yhm0
    public final long a() {
        return this.f33968a;
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
        if (!(obj instanceof thm0)) {
            return false;
        }
        thm0 thm0Var = (thm0) obj;
        return this.f33968a == thm0Var.f33968a && this.b.equals(thm0Var.b) && this.c.equals(thm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f33968a) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(gameId=" + this.f33968a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
