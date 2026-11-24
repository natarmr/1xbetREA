package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uno0 implements zno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35974a;
    public final a4x b;

    public uno0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f35974a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uno0)) {
            return false;
        }
        uno0 uno0Var = (uno0) obj;
        return this.f35974a == uno0Var.f35974a && Intrinsics.d(this.b, uno0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f35974a) * 31);
    }

    public final String toString() {
        return "AccordeonLineItemsOffset(scrollToTop=" + this.f35974a + ", items=" + this.b + Separators.RPAREN;
    }
}
