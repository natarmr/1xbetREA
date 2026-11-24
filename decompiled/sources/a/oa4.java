package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class oa4 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvs0 f24912a;

    public oa4(rvs0 rvs0Var) {
        this.f24912a = rvs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oa4) && this.f24912a.equals(((oa4) obj).f24912a);
    }

    public final int hashCode() {
        return this.f24912a.hashCode();
    }

    public final String toString() {
        return "OnTwoFactorAuthenticationConfirmationResult(result=" + this.f24912a + Separators.RPAREN;
    }
}
