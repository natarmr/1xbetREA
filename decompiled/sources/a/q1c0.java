package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q1c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27946a;
    public final a4x b;
    public final mtl c;

    public q1c0(mtl mtlVar, a4x a4xVar, boolean z) {
        this.f27946a = z;
        this.b = a4xVar;
        this.c = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1c0)) {
            return false;
        }
        q1c0 q1c0Var = (q1c0) obj;
        return this.f27946a == q1c0Var.f27946a && this.b.equals(q1c0Var.b) && this.c.equals(q1c0Var.c);
    }

    public final int hashCode() {
        return this.c.f22376a.hashCode() + cs0.b(this.b, Boolean.hashCode(this.f27946a) * 31, 31);
    }

    public final String toString() {
        return "ProfileEditTjUiState(isLoading=" + this.f27946a + ", fieldsList=" + this.b + ", bottomBarModel=" + this.c + Separators.RPAREN;
    }
}
