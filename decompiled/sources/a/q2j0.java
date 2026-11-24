package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28001a;

    public final boolean equals(Object obj) {
        if (obj instanceof q2j0) {
            return this.f28001a == ((q2j0) obj).f28001a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28001a);
    }

    public final String toString() {
        return defpackage.c.d("AutoCleanCouponEnd(hasEnable=", Separators.RPAREN, this.f28001a);
    }
}
