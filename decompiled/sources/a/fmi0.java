package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fmi0 implements hmi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f9784a;

    public fmi0(ra10 ra10Var) {
        ra10Var.getClass();
        this.f9784a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmi0) && Intrinsics.d(this.f9784a, ((fmi0) obj).f9784a);
    }

    public final int hashCode() {
        return this.f9784a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowError(lottieConfig=", this.f9784a, Separators.RPAREN);
    }
}
