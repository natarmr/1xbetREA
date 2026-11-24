package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o6c0 implements r6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ngc0 f24728a;

    public o6c0(ngc0 ngc0Var) {
        this.f24728a = ngc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6c0) && this.f24728a.equals(((o6c0) obj).f24728a);
    }

    public final int hashCode() {
        return this.f24728a.hashCode();
    }

    public final String toString() {
        return "ShowSelectPromoCodeDialog(promoCodesParamsModel=" + this.f24728a + Separators.RPAREN;
    }
}
