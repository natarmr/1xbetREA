package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mse implements ose {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4f f22315a;

    public mse(q4f q4fVar) {
        this.f22315a = q4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mse) && this.f22315a == ((mse) obj).f22315a;
    }

    public final int hashCode() {
        return this.f22315a.hashCode();
    }

    public final String toString() {
        return "FilledByCouponType(couponTypeModel=" + this.f22315a + Separators.RPAREN;
    }
}
