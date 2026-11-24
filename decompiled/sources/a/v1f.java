package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v1f implements y1f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36625a;

    public v1f(String str) {
        str.getClass();
        this.f36625a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1f) && Intrinsics.d(this.f36625a, ((v1f) obj).f36625a);
    }

    public final int hashCode() {
        return this.f36625a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnCouponIdChanged(couponId=", this.f36625a, Separators.RPAREN);
    }
}
