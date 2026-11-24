package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vs4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f37931a;
    public final a4x b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public vs4(a4x a4xVar, a4x a4xVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f37931a = a4xVar;
        this.b = a4xVar2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs4)) {
            return false;
        }
        vs4 vs4Var = (vs4) obj;
        return Intrinsics.d(this.f37931a, vs4Var.f37931a) && Intrinsics.d(this.b, vs4Var.b) && this.c == vs4Var.c && this.d == vs4Var.d && this.e == vs4Var.e && this.f == vs4Var.f && this.g == vs4Var.g && this.h == vs4Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(cs0.b(this.b, this.f37931a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("AuthenticatorScreenUiState(notifications=", this.f37931a, ", filters=", this.b, ", showFilters=");
        ua80.u(", refreshing=", ", showEmptyView=", sbQ, this.c, this.d);
        ua80.u(", shimmersEnabled=", ", progressBarEnabled=", sbQ, this.e, this.f);
        return ohs0.p(", error=", Separators.RPAREN, sbQ, this.g, this.h);
    }
}
