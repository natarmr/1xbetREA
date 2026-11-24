package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x1t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f40136a;
    public final l7m0 b;

    public x1t0(pz40 pz40Var, pz40 pz40Var2) {
        pz40Var.getClass();
        pz40Var2.getClass();
        this.f40136a = pz40Var;
        this.b = pz40Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1t0)) {
            return false;
        }
        x1t0 x1t0Var = (x1t0) obj;
        return Intrinsics.d(this.f40136a, x1t0Var.f40136a) && Intrinsics.d(this.b, x1t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40136a.hashCode() * 31);
    }

    public final String toString() {
        return "UFCStadiumImagesLoadingState(drawablesState=" + this.f40136a + ", loadingState=" + this.b + Separators.RPAREN;
    }
}
