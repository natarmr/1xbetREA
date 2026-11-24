package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bhw implements fhw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f2628a;

    public bhw(uid uidVar) {
        this.f2628a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhw) && this.f2628a.equals(((bhw) obj).f2628a);
    }

    public final int hashCode() {
        return this.f2628a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f2628a, Separators.RPAREN);
    }
}
