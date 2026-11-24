package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lnp0 implements onp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f20358a;
    public final a4x b;
    public final dxh0 c;
    public final int d;
    public final a4x e;

    public lnp0(imm immVar, a4x a4xVar, dxh0 dxh0Var, int i, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f20358a = immVar;
        this.b = a4xVar;
        this.c = dxh0Var;
        this.d = i;
        this.e = a4xVar2;
    }

    @Override // a.onp0
    public final imm a() {
        return this.f20358a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnp0)) {
            return false;
        }
        lnp0 lnp0Var = (lnp0) obj;
        return this.f20358a.equals(lnp0Var.f20358a) && Intrinsics.d(this.b, lnp0Var.b) && this.c.equals(lnp0Var.c) && this.d == lnp0Var.d && Intrinsics.d(this.e, lnp0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, hne.h(this.c, cs0.b(this.b, this.f20358a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(navigationBarUiModel=");
        sb.append(this.f20358a);
        sb.append(", tabs=");
        sb.append(this.b);
        sb.append(", tabsStyle=");
        sb.append(this.c);
        sb.append(", selectedTab=");
        sb.append(this.d);
        sb.append(", transfers=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
