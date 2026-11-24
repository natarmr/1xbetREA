package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l7o implements n7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f19569a;

    public l7o(uid uidVar) {
        this.f19569a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7o) && this.f19569a.equals(((l7o) obj).f19569a);
    }

    public final int hashCode() {
        return this.f19569a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f19569a, Separators.RPAREN);
    }
}
