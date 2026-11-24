package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra0 f2297a;

    public bb80(ra0 ra0Var) {
        this.f2297a = ra0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb80) && this.f2297a.equals(((bb80) obj).f2297a);
    }

    public final int hashCode() {
        return this.f2297a.hashCode();
    }

    public final String toString() {
        return "OnAggregatorActionCardClicked(item=" + this.f2297a + Separators.RPAREN;
    }
}
