package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t4g0 implements z4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f33318a;
    public final boolean b;

    public t4g0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f33318a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4g0)) {
            return false;
        }
        t4g0 t4g0Var = (t4g0) obj;
        return Intrinsics.d(this.f33318a, t4g0Var.f33318a) && this.b == t4g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f33318a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(items=" + this.f33318a + ", needScrollTop=" + this.b + Separators.RPAREN;
    }
}
