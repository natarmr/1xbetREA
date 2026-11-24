package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tno0 implements zno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34246a;
    public final a4x b;

    public tno0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f34246a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tno0)) {
            return false;
        }
        tno0 tno0Var = (tno0) obj;
        return this.f34246a == tno0Var.f34246a && Intrinsics.d(this.b, tno0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f34246a) * 31);
    }

    public final String toString() {
        return "AccordeonLineItemsBackground(scrollToTop=" + this.f34246a + ", items=" + this.b + Separators.RPAREN;
    }
}
