package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ewc implements fwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f8516a;

    public ewc(ra10 ra10Var) {
        ra10Var.getClass();
        this.f8516a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewc) && Intrinsics.d(this.f8516a, ((ewc) obj).f8516a);
    }

    public final int hashCode() {
        return this.f8516a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowError(lottieConfig=", this.f8516a, Separators.RPAREN);
    }
}
