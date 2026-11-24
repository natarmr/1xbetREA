package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dmp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f6333a;

    public dmp(uid uidVar) {
        this.f6333a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmp) && this.f6333a.equals(((dmp) obj).f6333a);
    }

    public final int hashCode() {
        return this.f6333a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f6333a, Separators.RPAREN);
    }
}
