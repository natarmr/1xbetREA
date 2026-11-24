package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nrk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbv0 f24006a;

    public nrk0(lbv0 lbv0Var) {
        this.f24006a = lbv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrk0) && this.f24006a.equals(((nrk0) obj).f24006a);
    }

    public final int hashCode() {
        return this.f24006a.hashCode();
    }

    public final String toString() {
        return "WhoWinCardDelegateUserAction(delegateAction=" + this.f24006a + Separators.RPAREN;
    }
}
