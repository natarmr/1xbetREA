package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dd4 implements fd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f5878a;

    public dd4(uu4 uu4Var) {
        this.f5878a = uu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd4) && this.f5878a.equals(((dd4) obj).f5878a);
    }

    public final int hashCode() {
        return this.f5878a.hashCode();
    }

    public final String toString() {
        return "TwoFAConfirmSuccess(authorizationData=" + this.f5878a + Separators.RPAREN;
    }
}
