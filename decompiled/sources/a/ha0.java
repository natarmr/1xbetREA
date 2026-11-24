package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ha0 implements qa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra0 f12701a;

    public ha0(ra0 ra0Var) {
        this.f12701a = ra0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha0) && this.f12701a.equals(((ha0) obj).f12701a);
    }

    public final int hashCode() {
        return this.f12701a.hashCode();
    }

    public final String toString() {
        return "OnAggregatorActionCardClicked(item=" + this.f12701a + Separators.RPAREN;
    }
}
