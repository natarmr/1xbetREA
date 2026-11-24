package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q5b0 implements w5b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f28144a;

    public final boolean equals(Object obj) {
        if (obj instanceof q5b0) {
            return this.f28144a.equals(((q5b0) obj).f28144a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28144a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f28144a, Separators.RPAREN);
    }
}
