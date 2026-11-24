package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class co8 implements eo8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gye f4687a;
    public final String b;

    public co8(gye gyeVar, String str) {
        this.f4687a = gyeVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co8)) {
            return false;
        }
        co8 co8Var = (co8) obj;
        return this.f4687a == co8Var.f4687a && this.b.equals(co8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4687a.hashCode() * 31);
    }

    public final String toString() {
        return "CouponInteractionUiModel(couponButtonState=" + this.f4687a + ", couponButtonText=" + this.b + Separators.RPAREN;
    }
}
