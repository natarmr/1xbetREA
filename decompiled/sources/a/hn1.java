package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hn1 implements in1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f13330a;

    public hn1(mdm mdmVar) {
        this.f13330a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn1) && this.f13330a.equals(((hn1) obj).f13330a);
    }

    public final int hashCode() {
        return this.f13330a.hashCode();
    }

    public final String toString() {
        return b1j.j("LottieModelAggregatorSearch(config=", this.f13330a, Separators.RPAREN);
    }
}
