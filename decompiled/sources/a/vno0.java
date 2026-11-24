package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vno0 implements zno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37729a;
    public final a4x b;

    public vno0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f37729a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vno0)) {
            return false;
        }
        vno0 vno0Var = (vno0) obj;
        return this.f37729a == vno0Var.f37729a && Intrinsics.d(this.b, vno0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f37729a) * 31);
    }

    public final String toString() {
        return "PlainCategorizedCards(scrollToTop=" + this.f37729a + ", items=" + this.b + Separators.RPAREN;
    }
}
