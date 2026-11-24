package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ddn0 implements gdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f5904a;

    public ddn0(sjd sjdVar) {
        this.f5904a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ddn0) && this.f5904a.equals(((ddn0) obj).f5904a);
    }

    public final int hashCode() {
        return this.f5904a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f5904a, Separators.RPAREN);
    }
}
