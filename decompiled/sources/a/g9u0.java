package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g9u0 implements h9u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f10932a;

    public g9u0(ra10 ra10Var) {
        ra10Var.getClass();
        this.f10932a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9u0) && Intrinsics.d(this.f10932a, ((g9u0) obj).f10932a);
    }

    public final int hashCode() {
        return this.f10932a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowLottie(lottieConfig=", this.f10932a, Separators.RPAREN);
    }
}
