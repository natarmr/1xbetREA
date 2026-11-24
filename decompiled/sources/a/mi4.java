package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class mi4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvs0 f21825a;

    public mi4(rvs0 rvs0Var) {
        this.f21825a = rvs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi4) && this.f21825a.equals(((mi4) obj).f21825a);
    }

    public final int hashCode() {
        return this.f21825a.hashCode();
    }

    public final String toString() {
        return "OnTwoFactorAuthenticationConfirmationResult(result=" + this.f21825a + Separators.RPAREN;
    }
}
