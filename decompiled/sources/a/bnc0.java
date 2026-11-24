package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bnc0 implements cnc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2876a;
    public final boolean b;
    public final boolean c;

    public bnc0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f2876a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnc0)) {
            return false;
        }
        bnc0 bnc0Var = (bnc0) obj;
        return Intrinsics.d(this.f2876a, bnc0Var.f2876a) && this.b == bnc0Var.b && this.c == bnc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f2876a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(brm0.u("Shimmer(title=", this.f2876a, ", hasBannerSection=", this.b, ", hasGamesSection="), this.c, Separators.RPAREN);
    }
}
