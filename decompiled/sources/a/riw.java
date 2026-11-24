package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class riw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f30562a;

    public riw(hjm hjmVar) {
        this.f30562a = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof riw) && this.f30562a.equals(((riw) obj).f30562a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "ALL_CHAMPS";
    }

    public final int hashCode() {
        return this.f30562a.hashCode() + 999698606;
    }

    public final String toString() {
        return "HomeGameCardHeaderUiModel(key=ALL_CHAMPS, dsModel=" + this.f30562a + Separators.RPAREN;
    }
}
