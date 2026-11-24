package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class chw implements ghw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f4381a;

    public chw(uid uidVar) {
        this.f4381a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chw) && this.f4381a.equals(((chw) obj).f4381a);
    }

    public final int hashCode() {
        return this.f4381a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f4381a, Separators.RPAREN);
    }
}
