package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qm7 implements vm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28969a;
    public final int b;
    public final m0k0 c;
    public final m97 d;

    static {
        k97 k97Var = m97.Companion;
    }

    public qm7(String str, int i, m0k0 m0k0Var, m97 m97Var) {
        this.f28969a = str;
        this.b = i;
        this.c = m0k0Var;
        this.d = m97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm7)) {
            return false;
        }
        qm7 qm7Var = (qm7) obj;
        return this.f28969a.equals(qm7Var.f28969a) && this.b == qm7Var.b && this.c.equals(qm7Var.c) && this.d.equals(qm7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, this.f28969a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "CouponTypeMaxItemsLimitExceed(curCouponTypeName=", this.f28969a, ", maxEventCount=", ", singleBetGame=");
        sbP.append(this.c);
        sbP.append(", betInfo=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
