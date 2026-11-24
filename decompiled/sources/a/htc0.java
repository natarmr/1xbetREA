package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class htc0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gtc0 f13626a;

    public htc0(gtc0 gtc0Var) {
        gtc0Var.getClass();
        this.f13626a = gtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htc0) && this.f13626a == ((htc0) obj).f13626a;
    }

    public final int hashCode() {
        return this.f13626a.hashCode();
    }

    public final String toString() {
        return "PromoSimpleShimmerUiItem(type=" + this.f13626a + Separators.RPAREN;
    }
}
