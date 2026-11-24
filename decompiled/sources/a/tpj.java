package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tpj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr1 f34336a;

    public tpj(lr1 lr1Var) {
        this.f34336a = lr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpj) && this.f34336a.equals(((tpj) obj).f34336a);
    }

    public final int hashCode() {
        return this.f34336a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "Virtual(hasBackStack=false, tab=" + this.f34336a + Separators.RPAREN;
    }
}
