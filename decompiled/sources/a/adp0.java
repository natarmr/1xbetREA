package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class adp0 implements cdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5a0 f691a;
    public final k5a0 b;

    public adp0(k5a0 k5a0Var, k5a0 k5a0Var2) {
        this.f691a = k5a0Var;
        this.b = k5a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adp0)) {
            return false;
        }
        adp0 adp0Var = (adp0) obj;
        return this.f691a.equals(adp0Var.f691a) && this.b.equals(adp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f691a.hashCode() * 31);
    }

    public final String toString() {
        return "WithLogoOnlyHorizontal(firstPlayerLogo=" + this.f691a + ", secondPlayerLogo=" + this.b + Separators.RPAREN;
    }
}
