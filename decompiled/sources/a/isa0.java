package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class isa0 implements msa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f15295a;

    public isa0(sjd sjdVar) {
        this.f15295a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isa0) && this.f15295a.equals(((isa0) obj).f15295a);
    }

    public final int hashCode() {
        return this.f15295a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(value=", this.f15295a, Separators.RPAREN);
    }
}
