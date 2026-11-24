package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19355a;

    public l3f(String str) {
        str.getClass();
        this.f19355a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3f) && Intrinsics.d(this.f19355a, ((l3f) obj).f19355a);
    }

    public final int hashCode() {
        return this.f19355a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCouponSaved(couponId=", this.f19355a, Separators.RPAREN);
    }
}
