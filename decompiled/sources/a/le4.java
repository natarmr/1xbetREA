package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class le4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvs0 f19882a;

    public le4(rvs0 rvs0Var) {
        this.f19882a = rvs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le4) && this.f19882a.equals(((le4) obj).f19882a);
    }

    public final int hashCode() {
        return this.f19882a.hashCode();
    }

    public final String toString() {
        return "OnTwoFactorAuthenticationConfirmationResult(result=" + this.f19882a + Separators.RPAREN;
    }
}
