package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lxq0 implements nxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f20828a;

    public lxq0(uid uidVar) {
        this.f20828a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxq0) && this.f20828a.equals(((lxq0) obj).f20828a);
    }

    public final int hashCode() {
        return this.f20828a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f20828a, Separators.RPAREN);
    }
}
