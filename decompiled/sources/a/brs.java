package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class brs implements crs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xef0 f3094a;

    public brs(xef0 xef0Var) {
        this.f3094a = xef0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof brs) && this.f3094a.equals(((brs) obj).f3094a);
    }

    public final int hashCode() {
        return this.f3094a.hashCode();
    }

    public final String toString() {
        return "Related(relatedUiModel=" + this.f3094a + Separators.RPAREN;
    }
}
