package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nc20 implements zc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ngc0 f23271a;

    public nc20(ngc0 ngc0Var) {
        this.f23271a = ngc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc20) && this.f23271a.equals(((nc20) obj).f23271a);
    }

    public final int hashCode() {
        return this.f23271a.hashCode();
    }

    public final String toString() {
        return "ShowSelectPromoCodeDialog(promoCodesParamsModel=" + this.f23271a + Separators.RPAREN;
    }
}
