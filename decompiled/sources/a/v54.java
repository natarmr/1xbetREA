package a;

import android.gov.nist.core.Separators;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class v54 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36811a;
    public final boolean b;
    public final int c;
    public final int d;

    public v54(int i, int i2, String str, boolean z) {
        this.f36811a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v54)) {
            return false;
        }
        v54 v54Var = (v54) obj;
        return this.f36811a.equals(v54Var.f36811a) && this.b == v54Var.b && this.c == v54Var.c && this.d == v54Var.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, brm0.e(this.f36811a.hashCode() * 31, 31, this.b), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", typeByInt=", Separators.RPAREN, brm0.u("AuthEntryPointUiModel(description=", this.f36811a, ", isLastItem=", this.b, ", iconResId="));
    }
}
