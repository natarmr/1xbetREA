package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class d4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4f f5451a;
    public final boolean b;

    public d4f(q4f q4fVar, boolean z) {
        this.f5451a = q4fVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4f)) {
            return false;
        }
        d4f d4fVar = (d4f) obj;
        return this.f5451a == d4fVar.f5451a && this.b == d4fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f5451a.hashCode() * 31);
    }

    public final String toString() {
        return "CouponSpinnerModel(couponTypeModel=" + this.f5451a + ", enabled=" + this.b + Separators.RPAREN;
    }
}
