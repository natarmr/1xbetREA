package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f7s0 implements h7s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f9073a;
    public final a4x b;
    public final ci c;

    public f7s0(imm immVar, a4x a4xVar, ci ciVar) {
        immVar.getClass();
        a4xVar.getClass();
        this.f9073a = immVar;
        this.b = a4xVar;
        this.c = ciVar;
    }

    @Override // a.h7s0
    public final imm a() {
        return this.f9073a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7s0)) {
            return false;
        }
        f7s0 f7s0Var = (f7s0) obj;
        return Intrinsics.d(this.f9073a, f7s0Var.f9073a) && Intrinsics.d(this.b, f7s0Var.b) && Intrinsics.d(this.c, f7s0Var.c);
    }

    public final int hashCode() {
        int iB = cs0.b(this.b, this.f9073a.hashCode() * 31, 31);
        ci ciVar = this.c;
        return iB + (ciVar == null ? 0 : ciVar.hashCode());
    }

    public final String toString() {
        return "Content(navigationBar=" + this.f9073a + ", stages=" + this.b + ", button=" + this.c + Separators.RPAREN;
    }
}
