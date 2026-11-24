package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b37 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1888a;

    public final boolean equals(Object obj) {
        if (obj instanceof b37) {
            return Intrinsics.d(this.f1888a, ((b37) obj).f1888a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1888a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSetCoupon(betId=", this.f1888a, Separators.RPAREN);
    }
}
