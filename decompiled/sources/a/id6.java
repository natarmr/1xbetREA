package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class id6 implements jd6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14568a;

    public id6(String str) {
        str.getClass();
        this.f14568a = str;
    }

    @Override // a.jd6
    public final boolean a() {
        return false;
    }

    @Override // a.jd6
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id6) && Intrinsics.d(this.f14568a, ((id6) obj).f14568a);
    }

    public final int hashCode() {
        return this.f14568a.hashCode() + brm0.e(Boolean.hashCode(false) * 31, 31, false);
    }

    public final String toString() {
        return kng0.l("Line(showCouponBadge=false, showTrackedBadge=false, place=", this.f14568a, Separators.RPAREN);
    }
}
