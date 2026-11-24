package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class smp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ymp0 f32458a;
    public final znq0 b;
    public final ufp0 c;
    public final ufp0 d;
    public final b9a0 e;
    public final String f;

    static {
        b9a0 b9a0Var = b9a0.g;
    }

    public smp0(ymp0 ymp0Var, znq0 znq0Var, ufp0 ufp0Var, ufp0 ufp0Var2, b9a0 b9a0Var, String str) {
        this.f32458a = ymp0Var;
        this.b = znq0Var;
        this.c = ufp0Var;
        this.d = ufp0Var2;
        this.e = b9a0Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smp0)) {
            return false;
        }
        smp0 smp0Var = (smp0) obj;
        return this.f32458a == smp0Var.f32458a && this.b.equals(smp0Var.b) && this.c.equals(smp0Var.c) && this.d.equals(smp0Var.d) && this.e.equals(smp0Var.e) && this.f.equals(smp0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + twn.f(this.d, twn.f(this.c, rw2.b(this.f32458a.hashCode() * 31, 31, this.b.f44687a), 31), 31)) * 31);
    }

    public final String toString() {
        return "TeamTransferModel(transferType=" + this.f32458a + ", dateTimestamp=" + this.b + ", guestTeamModel=" + this.c + ", hostTeamModel=" + this.d + ", playerModel=" + this.e + ", transferTypeTitle=" + this.f + Separators.RPAREN;
    }
}
