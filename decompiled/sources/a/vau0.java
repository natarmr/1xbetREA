package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vau0 implements wau0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f37108a;

    public vau0(ra10 ra10Var) {
        ra10Var.getClass();
        this.f37108a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vau0) && Intrinsics.d(this.f37108a, ((vau0) obj).f37108a);
    }

    public final int hashCode() {
        return this.f37108a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowLottie(lottieConfig=", this.f37108a, Separators.RPAREN);
    }
}
