package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qra0 implements zra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f29200a;

    public qra0(uid uidVar) {
        this.f29200a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qra0) && this.f29200a.equals(((qra0) obj).f29200a);
    }

    public final int hashCode() {
        return this.f29200a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f29200a, Separators.RPAREN);
    }
}
