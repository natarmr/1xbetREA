package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lrk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ill0 f20537a;
    public final vvs b;

    public lrk0(ill0 ill0Var, vvs vvsVar) {
        this.f20537a = ill0Var;
        this.b = vvsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrk0)) {
            return false;
        }
        lrk0 lrk0Var = (lrk0) obj;
        return this.f20537a.equals(lrk0Var.f20537a) && this.b == lrk0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20537a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultHistoryEventCardDelegateAction(delegateAction=" + this.f20537a + ", gameType=" + this.b + Separators.RPAREN;
    }
}
