package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cv1 implements ev1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu1 f5011a;
    public final bv1 b;
    public final ql5 c;
    public final fu1 d;
    public final a4x e;
    public final bml f;
    public final ou1 g;
    public final zs1 h;
    public final mtl i;
    public final mtl j;
    public final mtl k;
    public final mtl l;

    public cv1(qu1 qu1Var, bv1 bv1Var, ql5 ql5Var, fu1 fu1Var, a4x a4xVar, bml bmlVar, ou1 ou1Var, zs1 zs1Var, mtl mtlVar, mtl mtlVar2, mtl mtlVar3, mtl mtlVar4) {
        bv1Var.getClass();
        fu1Var.getClass();
        a4xVar.getClass();
        bmlVar.getClass();
        ou1Var.getClass();
        zs1Var.getClass();
        this.f5011a = qu1Var;
        this.b = bv1Var;
        this.c = ql5Var;
        this.d = fu1Var;
        this.e = a4xVar;
        this.f = bmlVar;
        this.g = ou1Var;
        this.h = zs1Var;
        this.i = mtlVar;
        this.j = mtlVar2;
        this.k = mtlVar3;
        this.l = mtlVar4;
    }

    @Override // a.ev1
    public final qu1 d() {
        return this.f5011a;
    }

    @Override // a.ev1
    public final fu1 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv1)) {
            return false;
        }
        cv1 cv1Var = (cv1) obj;
        return this.f5011a == cv1Var.f5011a && this.b == cv1Var.b && Intrinsics.d(this.c, cv1Var.c) && Intrinsics.d(this.d, cv1Var.d) && Intrinsics.d(this.e, cv1Var.e) && Intrinsics.d(this.f, cv1Var.f) && Intrinsics.d(this.g, cv1Var.g) && Intrinsics.d(this.h, cv1Var.h) && Intrinsics.d(this.i, cv1Var.i) && Intrinsics.d(this.j, cv1Var.j) && Intrinsics.d(this.k, cv1Var.k) && Intrinsics.d(this.l, cv1Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f5011a.hashCode() * 31)) * 31;
        ql5 ql5Var = this.c;
        int iHashCode2 = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + cs0.b(this.e, (this.d.hashCode() + ((iHashCode + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        mtl mtlVar = this.i;
        int iHashCode3 = (iHashCode2 + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode())) * 31;
        mtl mtlVar2 = this.j;
        int iHashCode4 = (iHashCode3 + (mtlVar2 == null ? 0 : mtlVar2.f22376a.hashCode())) * 31;
        mtl mtlVar3 = this.k;
        int iHashCode5 = (iHashCode4 + (mtlVar3 == null ? 0 : mtlVar3.f22376a.hashCode())) * 31;
        mtl mtlVar4 = this.l;
        return iHashCode5 + (mtlVar4 != null ? mtlVar4.f22376a.hashCode() : 0);
    }

    public final String toString() {
        return "Content(screenStyle=" + this.f5011a + ", selectedTab=" + this.b + ", balance=" + this.c + ", headerUiModel=" + this.d + ", descriptionContent=" + this.e + ", gamesContent=" + this.f + ", resultsContent=" + this.g + ", conditionsContent=" + this.h + ", descriptionBottomButton=" + this.i + ", gamesBottomButton=" + this.j + ", resultsBottomButton=" + this.k + ", conditionsBottomButton=" + this.l + Separators.RPAREN;
    }
}
