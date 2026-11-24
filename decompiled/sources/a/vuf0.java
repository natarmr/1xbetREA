package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vuf0 {
    public static final vuf0 d = new vuf0(false, false, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38046a;
    public final boolean b;
    public final boolean c;

    public vuf0(boolean z, boolean z2, boolean z3) {
        this.f38046a = z;
        this.b = z2;
        this.c = z3;
    }

    public static vuf0 a(vuf0 vuf0Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = vuf0Var.f38046a;
        }
        if ((i & 2) != 0) {
            z2 = vuf0Var.b;
        }
        if ((i & 4) != 0) {
            z3 = vuf0Var.c;
        }
        vuf0Var.getClass();
        return new vuf0(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuf0)) {
            return false;
        }
        vuf0 vuf0Var = (vuf0) obj;
        return this.f38046a == vuf0Var.f38046a && this.b == vuf0Var.b && this.c == vuf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f38046a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("ViewState(progress=", ", documentLoading=", ", networkAvailable=", this.f38046a, this.b), this.c, Separators.RPAREN);
    }
}
