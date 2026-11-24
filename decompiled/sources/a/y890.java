package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y890 implements c990 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f42186a;

    public y890(ra10 ra10Var) {
        ra10Var.getClass();
        this.f42186a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y890) && Intrinsics.d(this.f42186a, ((y890) obj).f42186a);
    }

    public final int hashCode() {
        return this.f42186a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowDisableNetwork(lottieConfig=", this.f42186a, Separators.RPAREN);
    }
}
