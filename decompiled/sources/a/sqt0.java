package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sqt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32644a;
    public final int b;
    public final int c;
    public final boolean d;

    public sqt0(int i, int i2, long j, boolean z) {
        this.f32644a = j;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqt0)) {
            return false;
        }
        sqt0 sqt0Var = (sqt0) obj;
        return this.f32644a == sqt0Var.f32644a && this.b == sqt0Var.b && this.c == sqt0Var.c && this.d == sqt0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Long.hashCode(this.f32644a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f32644a, "UserBonusInfo(userId=", ", agreementId=");
        dw9.v(this.c, ", registerBonusId=", ", isRegisterBonusExpired=", sbQ, this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
