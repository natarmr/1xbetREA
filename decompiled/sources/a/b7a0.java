package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b7a0 implements c7a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2097a;
    public final boolean b;

    public b7a0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f2097a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7a0)) {
            return false;
        }
        b7a0 b7a0Var = (b7a0) obj;
        return Intrinsics.d(this.f2097a, b7a0Var.f2097a) && this.b == b7a0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f2097a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketsLoaded(items=" + this.f2097a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
