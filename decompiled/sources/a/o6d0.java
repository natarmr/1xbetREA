package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o6d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6d0 f24729a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public o6d0(j6d0 j6d0Var, boolean z, boolean z2, boolean z3) {
        this.f24729a = j6d0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static o6d0 a(o6d0 o6d0Var, j6d0 j6d0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            j6d0Var = o6d0Var.f24729a;
        }
        if ((i & 2) != 0) {
            z = o6d0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = o6d0Var.c;
        }
        boolean z3 = (i & 8) != 0 ? o6d0Var.d : true;
        o6d0Var.getClass();
        return new o6d0(j6d0Var, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6d0)) {
            return false;
        }
        o6d0 o6d0Var = (o6d0) obj;
        return this.f24729a.equals(o6d0Var.f24729a) && this.b == o6d0Var.b && this.c == o6d0Var.c && this.d == o6d0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f24729a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxyState(proxySettingsModel=");
        sb.append(this.f24729a);
        sb.append(", showError=");
        sb.append(this.b);
        sb.append(", showLoading=");
        return ohs0.p(", showExitMessage=", Separators.RPAREN, sb, this.c, this.d);
    }
}
