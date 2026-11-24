package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class olj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr1 f25458a;

    public olj(lr1 lr1Var) {
        this.f25458a = lr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olj) && this.f25458a.equals(((olj) obj).f25458a);
    }

    public final int hashCode() {
        return this.f25458a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "Aggregator(hasBackStack=false, tab=" + this.f25458a + Separators.RPAREN;
    }
}
