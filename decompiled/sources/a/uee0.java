package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uee0 implements s8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ftr f35524a;
    public final String b;

    public uee0(ftr ftrVar) {
        this.f35524a = ftrVar;
        this.b = String.valueOf(ftrVar.f10128a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uee0) && this.f35524a.equals(((uee0) obj).f35524a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f35524a.f10128a.hashCode();
    }

    public final String toString() {
        return "RecommendedGamesContainer(games=" + this.f35524a + Separators.RPAREN;
    }
}
