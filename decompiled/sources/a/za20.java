package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class za20 implements zc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f44048a;

    public za20(aud audVar) {
        audVar.getClass();
        this.f44048a = audVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za20) && Intrinsics.d(this.f44048a, ((za20) obj).f44048a);
    }

    public final int hashCode() {
        return this.f44048a.hashCode();
    }

    public final String toString() {
        return "AddToCouponSideEffect(couponConfig=" + this.f44048a + Separators.RPAREN;
    }
}
