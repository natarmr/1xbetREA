package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class peg implements reg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f26850a;

    public peg(uid uidVar) {
        this.f26850a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof peg) && this.f26850a.equals(((peg) obj).f26850a);
    }

    public final int hashCode() {
        return this.f26850a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f26850a, Separators.RPAREN);
    }
}
