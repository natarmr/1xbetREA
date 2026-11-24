package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vl4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f37605a;
    public final String b;

    public vl4(uu4 uu4Var, String str) {
        this.f37605a = uu4Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl4)) {
            return false;
        }
        vl4 vl4Var = (vl4) obj;
        return this.f37605a.equals(vl4Var.f37605a) && this.b.equals(vl4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37605a.hashCode() * 31);
    }

    public final String toString() {
        return "Confirm(authorizationData=" + this.f37605a + ", deviceId=" + this.b + Separators.RPAREN;
    }
}
