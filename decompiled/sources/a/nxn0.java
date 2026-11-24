package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nxn0 implements uxn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f24291a;
    public final boolean b;

    public nxn0(ra10 ra10Var, boolean z) {
        ra10Var.getClass();
        this.f24291a = ra10Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxn0)) {
            return false;
        }
        nxn0 nxn0Var = (nxn0) obj;
        return Intrinsics.d(this.f24291a, nxn0Var.f24291a) && this.b == nxn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f24291a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowLottie(lottieConfig=" + this.f24291a + ", isWithTimer=" + this.b + Separators.RPAREN;
    }
}
