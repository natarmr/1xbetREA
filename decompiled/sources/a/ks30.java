package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ks30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18795a;
    public final boolean b;

    public ks30(boolean z, boolean z2) {
        this.f18795a = z;
        this.b = z2;
    }

    public static ks30 a(ks30 ks30Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ks30Var.f18795a;
        }
        if ((i & 2) != 0) {
            z2 = ks30Var.b;
        }
        ks30Var.getClass();
        return new ks30(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks30)) {
            return false;
        }
        ks30 ks30Var = (ks30) obj;
        return this.f18795a == ks30Var.f18795a && this.b == ks30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f18795a) * 31);
    }

    public final String toString() {
        return hne.n("ViewState(showProgress=", ", clickAllowed=", Separators.RPAREN, this.f18795a, this.b);
    }
}
