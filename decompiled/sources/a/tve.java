package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tve implements xve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34595a;
    public final int b;

    public tve(String str, int i) {
        str.getClass();
        this.f34595a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tve)) {
            return false;
        }
        tve tveVar = (tve) obj;
        return Intrinsics.d(this.f34595a, tveVar.f34595a) && this.b == tveVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f34595a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "ShowEditCouponCouponTypeLimitExceeded(currentCouponTypeName=", this.f34595a, ", maxEventCount=", Separators.RPAREN);
    }
}
