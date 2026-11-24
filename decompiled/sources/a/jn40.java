package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jn40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f16795a;
    public final a4x b;

    public jn40(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f16795a = immVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn40)) {
            return false;
        }
        jn40 jn40Var = (jn40) obj;
        return this.f16795a.equals(jn40Var.f16795a) && Intrinsics.d(this.b, jn40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16795a.hashCode() * 31);
    }

    public final String toString() {
        return "ModuleInfoUiState(navBarUiModel=" + this.f16795a + ", modules=" + this.b + Separators.RPAREN;
    }
}
