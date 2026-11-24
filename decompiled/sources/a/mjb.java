package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mjb implements ijb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ill0 f21888a;

    public mjb(ill0 ill0Var) {
        this.f21888a = ill0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjb) && this.f21888a.equals(((mjb) obj).f21888a);
    }

    public final int hashCode() {
        return this.f21888a.hashCode();
    }

    public final String toString() {
        return "OnResultClick(delegateAction=" + this.f21888a + Separators.RPAREN;
    }
}
