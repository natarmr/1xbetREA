package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f7g0 implements h7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9057a;
    public final a4x b;

    public f7g0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f9057a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7g0)) {
            return false;
        }
        f7g0 f7g0Var = (f7g0) obj;
        return this.f9057a == f7g0Var.f9057a && Intrinsics.d(this.b, f7g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f9057a) * 31);
    }

    public final String toString() {
        return "Content(rtlSupport=" + this.f9057a + ", colorLegend=" + this.b + Separators.RPAREN;
    }
}
