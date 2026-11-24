package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n4e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6i0 f22894a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public n4e0(j6i0 j6i0Var, boolean z, boolean z2, boolean z3) {
        this.f22894a = j6i0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static n4e0 a(n4e0 n4e0Var, j6i0 j6i0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            j6i0Var = n4e0Var.f22894a;
        }
        if ((i & 4) != 0) {
            z2 = n4e0Var.c;
        }
        boolean z3 = (i & 8) != 0 ? n4e0Var.d : true;
        n4e0Var.getClass();
        return new n4e0(j6i0Var, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4e0)) {
            return false;
        }
        n4e0 n4e0Var = (n4e0) obj;
        return Intrinsics.d(this.f22894a, n4e0Var.f22894a) && this.b == n4e0Var.b && this.c == n4e0Var.c && this.d == n4e0Var.d;
    }

    public final int hashCode() {
        j6i0 j6i0Var = this.f22894a;
        return Boolean.hashCode(this.d) + brm0.e(brm0.e((j6i0Var == null ? 0 : j6i0Var.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingFilterState(selectors=");
        sb.append(this.f22894a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", hasError=");
        return ohs0.p(", isEmpty=", Separators.RPAREN, sb, this.c, this.d);
    }
}
