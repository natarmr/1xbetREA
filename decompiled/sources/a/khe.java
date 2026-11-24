package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class khe implements die {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ftr f18287a;

    public khe(ftr ftrVar) {
        this.f18287a = ftrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khe) && this.f18287a.equals(((khe) obj).f18287a);
    }

    public final int hashCode() {
        return this.f18287a.f10128a.hashCode();
    }

    public final String toString() {
        return "FavoritesLoaded(content=" + this.f18287a + Separators.RPAREN;
    }
}
