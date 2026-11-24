package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b8p0 implements d8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f2167a;

    public b8p0(uid uidVar) {
        this.f2167a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8p0) && this.f2167a.equals(((b8p0) obj).f2167a);
    }

    public final int hashCode() {
        return this.f2167a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f2167a, Separators.RPAREN);
    }
}
