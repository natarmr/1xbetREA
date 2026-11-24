package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class han0 implements jan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f12732a;

    public han0(uid uidVar) {
        this.f12732a = uidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof han0) && this.f12732a.equals(((han0) obj).f12732a);
    }

    public final int hashCode() {
        return this.f12732a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f12732a, Separators.RPAREN);
    }
}
