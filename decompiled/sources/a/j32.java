package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j32 implements l32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f15810a;

    public j32(sjd sjdVar) {
        this.f15810a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j32) && this.f15810a.equals(((j32) obj).f15810a);
    }

    public final int hashCode() {
        return this.f15810a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(internalEffect=", this.f15810a, Separators.RPAREN);
    }
}
