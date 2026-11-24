package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jgs implements pgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16494a;

    public jgs(String str) {
        this.f16494a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgs) && this.f16494a.equals(((jgs) obj).f16494a);
    }

    public final int hashCode() {
        return this.f16494a.hashCode();
    }

    public final String toString() {
        return kng0.l("MarketLabelUiModel(marketText=", this.f16494a, Separators.RPAREN);
    }
}
