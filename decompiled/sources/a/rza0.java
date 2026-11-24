package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rza0 implements wza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wq5 f31350a;

    public rza0(wq5 wq5Var) {
        this.f31350a = wq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rza0) && this.f31350a.equals(((rza0) obj).f31350a);
    }

    public final int hashCode() {
        return this.f31350a.hashCode();
    }

    public final String toString() {
        return "AggregatorBannerSideEffect(bannerSideEffect=" + this.f31350a + Separators.RPAREN;
    }
}
