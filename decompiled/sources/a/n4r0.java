package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n4r0 implements s4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f22912a;

    public final boolean equals(Object obj) {
        if (obj instanceof n4r0) {
            return this.f22912a.equals(((n4r0) obj).f22912a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22912a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f22912a, Separators.RPAREN);
    }
}
