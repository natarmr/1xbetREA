package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t2o implements u2o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f33225a;

    public t2o(uid uidVar) {
        this.f33225a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2o) && this.f33225a.equals(((t2o) obj).f33225a);
    }

    public final int hashCode() {
        return this.f33225a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f33225a, Separators.RPAREN);
    }
}
