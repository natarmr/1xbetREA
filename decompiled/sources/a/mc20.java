package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mc20 implements yc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ngc0 f21531a;

    public mc20(ngc0 ngc0Var) {
        this.f21531a = ngc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc20) && this.f21531a.equals(((mc20) obj).f21531a);
    }

    public final int hashCode() {
        return this.f21531a.hashCode();
    }

    public final String toString() {
        return "ShowSelectPromoCodeDialog(promoCodesParamsModel=" + this.f21531a + Separators.RPAREN;
    }
}
