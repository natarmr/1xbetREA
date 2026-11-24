package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ra9 implements va9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f30123a;
    public final a4x b;

    public ra9(imm immVar, a4x a4xVar) {
        immVar.getClass();
        a4xVar.getClass();
        this.f30123a = immVar;
        this.b = a4xVar;
    }

    @Override // a.va9
    public final imm a() {
        return this.f30123a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra9)) {
            return false;
        }
        ra9 ra9Var = (ra9) obj;
        return Intrinsics.d(this.f30123a, ra9Var.f30123a) && Intrinsics.d(this.b, ra9Var.b);
    }

    public final int hashCode() {
        return rk.n.hashCode() + brm0.e(cs0.b(this.b, this.f30123a.hashCode() * 31, 31), 31, false);
    }

    public final String toString() {
        return "Loading(toolBarUiModel=" + this.f30123a + ", tabSegments=" + this.b + ", nextButtonEnabled=false, nextButtonType=" + rk.n + Separators.RPAREN;
    }
}
