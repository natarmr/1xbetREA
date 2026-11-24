package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vbd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37137a;
    public final aue0 b;

    public vbd0(long j, aue0 aue0Var) {
        this.f37137a = j;
        this.b = aue0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbd0)) {
            return false;
        }
        vbd0 vbd0Var = (vbd0) obj;
        return this.f37137a == vbd0Var.f37137a && this.b == vbd0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f37137a) * 31);
    }

    public final String toString() {
        return "PaySystem(balanceId=" + this.f37137a + ", registrationDefaultBonus=" + this.b + Separators.RPAREN;
    }

    public /* synthetic */ vbd0() {
        this(0L, aue0.c);
    }
}
