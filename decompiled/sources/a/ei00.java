package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ei00 implements gi00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f7834a;

    public ei00(uid uidVar) {
        this.f7834a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei00) && this.f7834a.equals(((ei00) obj).f7834a);
    }

    public final int hashCode() {
        return this.f7834a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f7834a, Separators.RPAREN);
    }
}
