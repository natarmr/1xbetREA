package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class him0 implements kim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13120a;
    public final gmm0 b;
    public final pim0 c;

    public him0(long j, gmm0 gmm0Var, pim0 pim0Var) {
        this.f13120a = j;
        this.b = gmm0Var;
        this.c = pim0Var;
    }

    @Override // a.kim0
    public final long a() {
        return this.f13120a;
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
        if (!(obj instanceof him0)) {
            return false;
        }
        him0 him0Var = (him0) obj;
        return this.f13120a == him0Var.f13120a && this.b.equals(him0Var.b) && this.c.equals(him0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f13120a) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=" + this.f13120a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
