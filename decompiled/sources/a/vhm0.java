package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vhm0 implements yhm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37438a;
    public final ljm0 b;
    public final pim0 c;

    public vhm0(long j, ljm0 ljm0Var, pim0 pim0Var) {
        this.f37438a = j;
        this.b = ljm0Var;
        this.c = pim0Var;
    }

    @Override // a.yhm0
    public final long a() {
        return this.f37438a;
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
        if (!(obj instanceof vhm0)) {
            return false;
        }
        vhm0 vhm0Var = (vhm0) obj;
        return this.f37438a == vhm0Var.f37438a && this.b.equals(vhm0Var.b) && this.c.equals(vhm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f37438a) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=" + this.f37438a + ", middleBlock=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
