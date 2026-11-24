package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26348a;
    public final boolean b;

    public p4f(String str, boolean z) {
        this.f26348a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4f)) {
            return false;
        }
        p4f p4fVar = (p4f) obj;
        return this.f26348a.equals(p4fVar.f26348a) && this.b == p4fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f26348a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("CouponTypeMenuUiModel(couponTypeTitle=", this.f26348a, ", canChooseCouponType=", this.b, Separators.RPAREN);
    }
}
