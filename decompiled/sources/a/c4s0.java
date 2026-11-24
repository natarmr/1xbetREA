package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c4s0 implements e4s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f3741a;
    public final a4x b;
    public final a4x c;
    public final b4s0 d;
    public final g3s0 e;
    public final boolean f;
    public final ci g;

    public c4s0(imm immVar, a4x a4xVar, a4x a4xVar2, b4s0 b4s0Var, g3s0 g3s0Var, boolean z, ci ciVar) {
        immVar.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        b4s0Var.getClass();
        g3s0Var.getClass();
        this.f3741a = immVar;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = b4s0Var;
        this.e = g3s0Var;
        this.f = z;
        this.g = ciVar;
    }

    @Override // a.e4s0
    public final imm a() {
        return this.f3741a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4s0)) {
            return false;
        }
        c4s0 c4s0Var = (c4s0) obj;
        return Intrinsics.d(this.f3741a, c4s0Var.f3741a) && Intrinsics.d(this.b, c4s0Var.b) && Intrinsics.d(this.c, c4s0Var.c) && Intrinsics.d(this.d, c4s0Var.d) && this.e == c4s0Var.e && this.f == c4s0Var.f && Intrinsics.d(this.g, c4s0Var.g);
    }

    public final int hashCode() {
        int iE = brm0.e((this.e.hashCode() + ((this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f3741a.hashCode() * 31, 31), 31)) * 31)) * 31, 31, this.f);
        ci ciVar = this.g;
        return iE + (ciVar == null ? 0 : ciVar.hashCode());
    }

    public final String toString() {
        return "Content(navigationBar=" + this.f3741a + ", prizes=" + this.b + ", stagePrizes=" + this.c + ", tabsModel=" + this.d + ", currentPage=" + this.e + ", showTabs=" + this.f + ", button=" + this.g + Separators.RPAREN;
    }
}
