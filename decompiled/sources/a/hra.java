package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hra implements qra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f13520a;

    public final boolean equals(Object obj) {
        if (obj instanceof hra) {
            return this.f13520a.equals(((hra) obj).f13520a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13520a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f13520a, Separators.RPAREN);
    }
}
