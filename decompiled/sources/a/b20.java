package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b20 implements c20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f1832a;

    public b20(ra10 ra10Var) {
        ra10Var.getClass();
        this.f1832a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b20) && Intrinsics.d(this.f1832a, ((b20) obj).f1832a);
    }

    public final int hashCode() {
        return this.f1832a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowLottie(lottieConfig=", this.f1832a, Separators.RPAREN);
    }
}
