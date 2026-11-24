package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ihs implements khs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f14796a;

    public ihs(uid uidVar) {
        this.f14796a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihs) && this.f14796a.equals(((ihs) obj).f14796a);
    }

    public final int hashCode() {
        return this.f14796a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f14796a, Separators.RPAREN);
    }
}
