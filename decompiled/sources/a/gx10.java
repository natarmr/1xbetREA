package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f12055a;
    public final vh0 b;

    public gx10(iz30 iz30Var, vh0 vh0Var) {
        vh0Var.getClass();
        this.f12055a = iz30Var;
        this.b = vh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx10)) {
            return false;
        }
        gx10 gx10Var = (gx10) obj;
        return this.f12055a == gx10Var.f12055a && Intrinsics.d(this.b, gx10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12055a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemAggregatorCategoryModel(menuItem=" + this.f12055a + ", aggregatorCategoryModel=" + this.b + Separators.RPAREN;
    }
}
