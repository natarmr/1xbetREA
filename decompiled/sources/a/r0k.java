package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29634a;

    public final boolean equals(Object obj) {
        if (obj instanceof r0k) {
            return Intrinsics.d(this.f29634a, ((r0k) obj).f29634a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29634a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnShareCouponClicked(betId=", this.f29634a, Separators.RPAREN);
    }
}
