package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oc20 implements xc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ngc0 f25009a;

    public oc20(ngc0 ngc0Var) {
        this.f25009a = ngc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc20) && this.f25009a.equals(((oc20) obj).f25009a);
    }

    public final int hashCode() {
        return this.f25009a.hashCode();
    }

    public final String toString() {
        return "ShowSelectPromoCodeDialog(promoCodesParamsModel=" + this.f25009a + Separators.RPAREN;
    }
}
