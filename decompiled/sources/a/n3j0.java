package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n3j0 implements p3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22854a;

    public final boolean equals(Object obj) {
        if (obj instanceof n3j0) {
            return this.f22854a == ((n3j0) obj).f22854a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22854a);
    }

    public final String toString() {
        return defpackage.c.d("ClearCouponAfterBetToggleChangeState(value=", Separators.RPAREN, this.f22854a);
    }
}
