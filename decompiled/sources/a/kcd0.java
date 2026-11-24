package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kcd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18053a;

    public kcd0(String str) {
        this.f18053a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcd0) && this.f18053a.equals(((kcd0) obj).f18053a);
    }

    public final int hashCode() {
        return this.f18053a.hashCode();
    }

    public final String toString() {
        return kng0.l("PromoWebAggregator(url=", this.f18053a, Separators.RPAREN);
    }
}
