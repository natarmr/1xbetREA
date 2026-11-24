package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k2q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f17587a;
    public j83 b;
    public boolean c = false;
    public ew40 d = null;

    public k2q0(j83 j83Var, j83 j83Var2) {
        this.f17587a = j83Var;
        this.b = j83Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2q0)) {
            return false;
        }
        k2q0 k2q0Var = (k2q0) obj;
        return Intrinsics.d(this.f17587a, k2q0Var.f17587a) && Intrinsics.d(this.b, k2q0Var.b) && this.c == k2q0Var.c && Intrinsics.d(this.d, k2q0Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.f(this.b, this.f17587a.hashCode() * 31, 31), 31, this.c);
        ew40 ew40Var = this.d;
        return iE + (ew40Var == null ? 0 : ew40Var.hashCode());
    }

    public final String toString() {
        j83 j83Var = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.f17587a) + ", substitution=" + ((Object) j83Var) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + Separators.RPAREN;
    }
}
