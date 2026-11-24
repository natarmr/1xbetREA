package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jp9 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16890a;
    public final String b;
    public final boolean c;

    public jp9(String str, int i, boolean z) {
        str.getClass();
        this.f16890a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp9)) {
            return false;
        }
        jp9 jp9Var = (jp9) obj;
        return this.f16890a == jp9Var.f16890a && Intrinsics.d(this.b, jp9Var.b) && this.c == jp9Var.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof jp9) && (p6t0Var2 instanceof jp9) && ((jp9) p6t0Var).f16890a == ((jp9) p6t0Var2).f16890a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f16890a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f16890a, "CallThemeUiModel(id=", ", themeName=", this.b, ", isLast="), this.c, Separators.RPAREN);
    }
}
