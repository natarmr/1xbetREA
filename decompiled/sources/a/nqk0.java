package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f23965a;

    public nqk0(uid uidVar) {
        this.f23965a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqk0) && this.f23965a.equals(((nqk0) obj).f23965a);
    }

    public final int hashCode() {
        return this.f23965a.hashCode();
    }

    public final String toString() {
        return vqd.m("GameCardDelegateAction(delegateAction=", this.f23965a, Separators.RPAREN);
    }
}
