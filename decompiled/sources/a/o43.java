package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f24613a;
    public final c0d b;
    public final long c;
    public final t33 d;
    public final t33 e;
    public final t33 f;
    public final wz40 g;
    public final t33 h;
    public final s4u0 i;
    public final gzc j;
    public final gzc k;
    public final s4u0 l;

    public o43(j43 j43Var, c0d c0dVar, long j, t33 t33Var, t33 t33Var2, t33 t33Var3, wz40 wz40Var, t33 t33Var4, s4u0 s4u0Var, gzc gzcVar, gzc gzcVar2, s4u0 s4u0Var2) {
        j43Var.getClass();
        c0dVar.getClass();
        t33Var.getClass();
        t33Var2.getClass();
        t33Var3.getClass();
        wz40Var.getClass();
        t33Var4.getClass();
        this.f24613a = j43Var;
        this.b = c0dVar;
        this.c = j;
        this.d = t33Var;
        this.e = t33Var2;
        this.f = t33Var3;
        this.g = wz40Var;
        this.h = t33Var4;
        this.i = s4u0Var;
        this.j = gzcVar;
        this.k = gzcVar2;
        this.l = s4u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o43)) {
            return false;
        }
        o43 o43Var = (o43) obj;
        return Intrinsics.d(this.f24613a, o43Var.f24613a) && this.b == o43Var.b && daq0.a(this.c, o43Var.c) && Intrinsics.d(this.d, o43Var.d) && Intrinsics.d(this.e, o43Var.e) && Intrinsics.d(this.f, o43Var.f) && Intrinsics.d(this.g, o43Var.g) && Intrinsics.d(this.h, o43Var.h) && Intrinsics.d(this.i, o43Var.i) && this.j.equals(o43Var.j) && this.k.equals(o43Var.k) && Intrinsics.d(this.l, o43Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f24613a.hashCode() * 31)) * 31;
        eaq0[] eaq0VarArr = daq0.b;
        int iHashCode2 = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + rw2.b(iHashCode, 31, this.c)) * 31)) * 31)) * 31)) * 31)) * 31;
        s4u0 s4u0Var = this.i;
        int iHashCode3 = (this.k.hashCode() + ((this.j.hashCode() + ((iHashCode2 + (s4u0Var == null ? 0 : s4u0Var.hashCode())) * 31)) * 31)) * 31;
        s4u0 s4u0Var2 = this.l;
        return iHashCode3 + (s4u0Var2 != null ? s4u0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "AnimatedCoefficientsAnimationParametersModel(animatedCoefficientModelState=" + this.f24613a + ", prevCoefficientChangeState=" + this.b + ", fontSize=" + daq0.f(this.c) + ", arrowAlphaAnimatable=" + this.d + ", blockedIconAlphaAnimatable=" + this.e + ", oldCoefficientAlphaAnimatable=" + this.f + ", curCoefficientColorAnimatableHolder=" + this.g + ", coefficientsScaleAnimatable=" + this.h + ", arrowIconImageVectorPainter=" + this.i + ", arrowCoefIconParams=" + this.j + ", blockedCoefIconParams=" + this.k + ", blockedIconImageVectorPainter=" + this.l + Separators.RPAREN;
    }
}
