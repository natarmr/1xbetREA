package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fhc implements jhc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9533a;

    public final boolean equals(Object obj) {
        if (obj instanceof fhc) {
            return Intrinsics.d(this.f9533a, ((fhc) obj).f9533a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9533a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnLimitValueChange(newValue=", this.f9533a, Separators.RPAREN);
    }
}
