package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y5r0 implements n6r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f42063a;

    public final boolean equals(Object obj) {
        if (obj instanceof y5r0) {
            return this.f42063a.equals(((y5r0) obj).f42063a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42063a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f42063a, Separators.RPAREN);
    }
}
