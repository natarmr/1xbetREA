package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr1 f26586a;
    public final boolean b;

    public p91(lr1 lr1Var, boolean z) {
        lr1Var.getClass();
        this.f26586a = lr1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p91)) {
            return false;
        }
        p91 p91Var = (p91) obj;
        return Intrinsics.d(this.f26586a, p91Var.f26586a) && this.b == p91Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f26586a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorNavigationItem(tab=" + this.f26586a + ", isVirtual=" + this.b + Separators.RPAREN;
    }
}
