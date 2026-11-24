package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f6s0 implements h6s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f9028a;
    public final a4x b;
    public final ci c;

    public f6s0(imm immVar, a4x a4xVar, ci ciVar) {
        immVar.getClass();
        a4xVar.getClass();
        this.f9028a = immVar;
        this.b = a4xVar;
        this.c = ciVar;
    }

    @Override // a.h6s0
    public final imm a() {
        return this.f9028a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6s0)) {
            return false;
        }
        f6s0 f6s0Var = (f6s0) obj;
        return Intrinsics.d(this.f9028a, f6s0Var.f9028a) && Intrinsics.d(this.b, f6s0Var.b) && Intrinsics.d(this.c, f6s0Var.c);
    }

    public final int hashCode() {
        int iB = cs0.b(this.b, this.f9028a.hashCode() * 31, 31);
        ci ciVar = this.c;
        return iB + (ciVar == null ? 0 : ciVar.hashCode());
    }

    public final String toString() {
        return "Content(navigationBar=" + this.f9028a + ", prizes=" + this.b + ", button=" + this.c + Separators.RPAREN;
    }
}
