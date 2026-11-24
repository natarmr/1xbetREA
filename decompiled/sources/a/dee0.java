package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dee0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f5948a;

    public dee0(a2n a2nVar) {
        this.f5948a = a2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dee0) && this.f5948a.equals(((dee0) obj).f5948a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f5948a.getKey();
    }

    public final int hashCode() {
        return this.f5948a.hashCode();
    }

    public final String toString() {
        return "RecommendedGameUiItem(model=" + this.f5948a + Separators.RPAREN;
    }
}
