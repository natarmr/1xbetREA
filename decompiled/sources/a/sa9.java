package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sa9 implements va9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f31880a;
    public final a4x b;
    public final boolean c;
    public final a4x d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public sa9(imm immVar, a4x a4xVar, int i, a4x a4xVar2, boolean z) {
        immVar.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f31880a = immVar;
        this.b = a4xVar;
        this.c = i;
        this.d = a4xVar2;
        this.e = z;
    }

    @Override // a.va9
    public final imm a() {
        return this.f31880a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa9)) {
            return false;
        }
        sa9 sa9Var = (sa9) obj;
        return Intrinsics.d(this.f31880a, sa9Var.f31880a) && Intrinsics.d(this.b, sa9Var.b) && this.c == sa9Var.c && Intrinsics.d(this.d, sa9Var.d) && this.e == sa9Var.e;
    }

    public final int hashCode() {
        return rk.n.hashCode() + brm0.e(cs0.b(this.d, twn.a(this.c ? 1 : 0, cs0.b(this.b, this.f31880a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        return "Success(toolBarUiModel=" + this.f31880a + ", tabSegments=" + this.b + ", currentTab=" + (this.c ? 1 : 0) + ", players=" + this.d + ", nextButtonEnabled=" + this.e + ", nextButtonType=" + rk.n + Separators.RPAREN;
    }
}
