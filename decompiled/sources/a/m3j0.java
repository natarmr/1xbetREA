package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m3j0 implements p3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21118a;

    public final boolean equals(Object obj) {
        if (obj instanceof m3j0) {
            return this.f21118a == ((m3j0) obj).f21118a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21118a);
    }

    public final String toString() {
        return defpackage.c.d("AutoCleanCouponAfterEndEventChangeState(value=", Separators.RPAREN, this.f21118a);
    }
}
