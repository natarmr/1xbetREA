package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uyo0 implements wyo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f36501a;

    public uyo0(uid uidVar) {
        this.f36501a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uyo0) && this.f36501a.equals(((uyo0) obj).f36501a);
    }

    public final int hashCode() {
        return this.f36501a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f36501a, Separators.RPAREN);
    }
}
