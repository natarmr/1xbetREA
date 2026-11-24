package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class my0 implements ny0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f22582a;

    public my0(mdm mdmVar) {
        this.f22582a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my0) && this.f22582a.equals(((my0) obj).f22582a);
    }

    public final int hashCode() {
        return this.f22582a.hashCode();
    }

    public final String toString() {
        return b1j.j("LottieModelAggregatorGamesSearch(config=", this.f22582a, Separators.RPAREN);
    }
}
