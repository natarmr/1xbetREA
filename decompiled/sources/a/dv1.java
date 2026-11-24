package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dv1 implements ev1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu1 f6721a;
    public final bv1 b;
    public final ql5 c;
    public final fu1 d;
    public final mdm e;

    public dv1(qu1 qu1Var, bv1 bv1Var, ql5 ql5Var, fu1 fu1Var, mdm mdmVar) {
        bv1Var.getClass();
        fu1Var.getClass();
        mdmVar.getClass();
        this.f6721a = qu1Var;
        this.b = bv1Var;
        this.c = ql5Var;
        this.d = fu1Var;
        this.e = mdmVar;
    }

    @Override // a.ev1
    public final qu1 d() {
        return this.f6721a;
    }

    @Override // a.ev1
    public final fu1 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv1)) {
            return false;
        }
        dv1 dv1Var = (dv1) obj;
        return this.f6721a == dv1Var.f6721a && this.b == dv1Var.b && Intrinsics.d(this.c, dv1Var.c) && Intrinsics.d(this.d, dv1Var.d) && Intrinsics.d(this.e, dv1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f6721a.hashCode() * 31)) * 31;
        ql5 ql5Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(screenStyle=");
        sb.append(this.f6721a);
        sb.append(", selectedTab=");
        sb.append(this.b);
        sb.append(", balance=");
        sb.append(this.c);
        sb.append(", headerUiModel=");
        sb.append(this.d);
        sb.append(", config=");
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
