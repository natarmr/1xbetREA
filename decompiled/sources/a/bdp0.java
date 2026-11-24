package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bdp0 implements cdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5a0 f2410a;
    public final f5a0 b;

    public bdp0(f5a0 f5a0Var, f5a0 f5a0Var2) {
        this.f2410a = f5a0Var;
        this.b = f5a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdp0)) {
            return false;
        }
        bdp0 bdp0Var = (bdp0) obj;
        return this.f2410a.equals(bdp0Var.f2410a) && this.b.equals(bdp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2410a.hashCode() * 31);
    }

    public final String toString() {
        return "WithLogoOnlyVertical(firstPlayerLogo=" + this.f2410a + ", secondPlayerLogo=" + this.b + Separators.RPAREN;
    }
}
