package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k8t0 implements m8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f17888a;

    public k8t0(uid uidVar) {
        this.f17888a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8t0) && this.f17888a.equals(((k8t0) obj).f17888a);
    }

    public final int hashCode() {
        return this.f17888a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f17888a, Separators.RPAREN);
    }
}
