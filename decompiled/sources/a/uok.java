package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uok implements wok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f36020a;

    public uok(uid uidVar) {
        this.f36020a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uok) && this.f36020a.equals(((uok) obj).f36020a);
    }

    public final int hashCode() {
        return this.f36020a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f36020a, Separators.RPAREN);
    }
}
