package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ww20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39867a;

    public ww20(String str) {
        this.f39867a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww20) && this.f39867a.equals(((ww20) obj).f39867a);
    }

    public final int hashCode() {
        return this.f39867a.hashCode();
    }

    public final String toString() {
        return kng0.l("MarketStateModel(marketText=", this.f39867a, Separators.RPAREN);
    }
}
