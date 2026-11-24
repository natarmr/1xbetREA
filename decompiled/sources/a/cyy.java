package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cyy implements dyy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ill0 f5199a;

    public cyy(ill0 ill0Var) {
        this.f5199a = ill0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyy) && this.f5199a.equals(((cyy) obj).f5199a);
    }

    public final int hashCode() {
        return this.f5199a.hashCode();
    }

    public final String toString() {
        return "OnResultCardClick(delegateAction=" + this.f5199a + Separators.RPAREN;
    }
}
