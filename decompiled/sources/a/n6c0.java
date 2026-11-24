package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n6c0 implements s6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ngc0 f22991a;

    public n6c0(ngc0 ngc0Var) {
        this.f22991a = ngc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6c0) && this.f22991a.equals(((n6c0) obj).f22991a);
    }

    public final int hashCode() {
        return this.f22991a.hashCode();
    }

    public final String toString() {
        return "ShowPromoCodes(promoCodesParamsModel=" + this.f22991a + Separators.RPAREN;
    }
}
