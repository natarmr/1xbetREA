package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yjb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f42733a;

    public final boolean equals(Object obj) {
        if (obj instanceof yjb0) {
            return this.f42733a.equals(((yjb0) obj).f42733a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42733a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f42733a, Separators.RPAREN);
    }
}
