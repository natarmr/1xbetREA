package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q53 f26385a;
    public final t33 b;
    public final vz40 c;
    public final s4u0 d;
    public final j53 e;

    public p53(q53 q53Var, t33 t33Var, vz40 vz40Var, s4u0 s4u0Var, j53 j53Var) {
        t33Var.getClass();
        vz40Var.getClass();
        this.f26385a = q53Var;
        this.b = t33Var;
        this.c = vz40Var;
        this.d = s4u0Var;
        this.e = j53Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p53)) {
            return false;
        }
        p53 p53Var = (p53) obj;
        return this.f26385a.equals(p53Var.f26385a) && Intrinsics.d(this.b, p53Var.b) && Intrinsics.d(this.c, p53Var.c) && Intrinsics.d(this.d, p53Var.d) && this.e.equals(p53Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.f38283a.hashCode() + ((this.b.hashCode() + (this.f26385a.hashCode() * 31)) * 31)) * 31;
        s4u0 s4u0Var = this.d;
        return this.e.hashCode() + ((iHashCode + (s4u0Var == null ? 0 : s4u0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "AnimatedDeltaParametersModel(animatedDeltaUiModelState=" + this.f26385a + ", arrowAlphaAnimatable=" + this.b + ", deltaColorAnimatableHolder=" + this.c + ", arrowIconImageVectorPainter=" + this.d + ", arrowIconParams=" + this.e + Separators.RPAREN;
    }
}
