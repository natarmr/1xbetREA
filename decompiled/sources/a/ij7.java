package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ij7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14859a;

    public final boolean equals(Object obj) {
        if (obj instanceof ij7) {
            return Intrinsics.d(this.f14859a, ((ij7) obj).f14859a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14859a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSetCoupon(betId=", this.f14859a, Separators.RPAREN);
    }
}
