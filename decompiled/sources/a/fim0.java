package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fim0 implements kim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9596a;
    public final slm0 b;
    public final pim0 c;

    public fim0(long j, slm0 slm0Var, pim0 pim0Var) {
        this.f9596a = j;
        this.b = slm0Var;
        this.c = pim0Var;
    }

    @Override // a.kim0
    public final long a() {
        return this.f9596a;
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
        if (!(obj instanceof fim0)) {
            return false;
        }
        fim0 fim0Var = (fim0) obj;
        return this.f9596a == fim0Var.f9596a && this.b.equals(fim0Var.b) && this.c.equals(fim0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f9596a) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(gameId=" + this.f9596a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
