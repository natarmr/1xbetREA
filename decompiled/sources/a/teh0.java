package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class teh0 implements xeh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f33821a;

    public teh0(uid uidVar) {
        this.f33821a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof teh0) && this.f33821a.equals(((teh0) obj).f33821a);
    }

    public final int hashCode() {
        return this.f33821a.hashCode();
    }

    public final String toString() {
        return vqd.m("GameCardDelegateAction(delegateAction=", this.f33821a, Separators.RPAREN);
    }
}
