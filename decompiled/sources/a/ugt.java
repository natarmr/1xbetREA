package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ugt implements vgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35641a;

    public final boolean equals(Object obj) {
        if (obj instanceof ugt) {
            return Intrinsics.d(this.f35641a, ((ugt) obj).f35641a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35641a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnWontedBetSumChange(betSum=", this.f35641a, Separators.RPAREN);
    }
}
