package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22785a;

    public final boolean equals(Object obj) {
        if (obj instanceof n27) {
            return Intrinsics.d(this.f22785a, ((n27) obj).f22785a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22785a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnAutoBetCanceledConfirmed(betId=", this.f22785a, Separators.RPAREN);
    }
}
