package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dvp implements fvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f6756a;

    public dvp(uid uidVar) {
        this.f6756a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvp) && this.f6756a.equals(((dvp) obj).f6756a);
    }

    public final int hashCode() {
        return this.f6756a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f6756a, Separators.RPAREN);
    }
}
