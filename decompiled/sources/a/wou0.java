package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wou0 implements you0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f39515a;

    public wou0(uid uidVar) {
        this.f39515a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wou0) && this.f39515a.equals(((wou0) obj).f39515a);
    }

    public final int hashCode() {
        return this.f39515a.hashCode();
    }

    public final String toString() {
        return vqd.m("OnDelegateAction(delegateAction=", this.f39515a, Separators.RPAREN);
    }
}
