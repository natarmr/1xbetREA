package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gnl0 implements hnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final izm f11595a;

    public gnl0(izm izmVar) {
        this.f11595a = izmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnl0) && this.f11595a.equals(((gnl0) obj).f11595a);
    }

    public final int hashCode() {
        return this.f11595a.hashCode();
    }

    public final String toString() {
        return "TwoPairs(model=" + this.f11595a + Separators.RPAREN;
    }
}
