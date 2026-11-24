package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ead0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7460a;
    public final boolean b;

    public ead0(String str, boolean z) {
        this.f7460a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ead0)) {
            return false;
        }
        ead0 ead0Var = (ead0) obj;
        return this.f7460a.equals(ead0Var.f7460a) && this.b == ead0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f7460a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Coupon(id=", this.f7460a, ", afterBet=", this.b, Separators.RPAREN);
    }
}
