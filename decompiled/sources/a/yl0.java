package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yl0 implements am0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zll f42817a;
    public final j8b b;

    public yl0(zll zllVar, j8b j8bVar) {
        this.f42817a = zllVar;
        this.b = j8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl0)) {
            return false;
        }
        yl0 yl0Var = (yl0) obj;
        return this.f42817a.equals(yl0Var.f42817a) && this.b.equals(yl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42817a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorFavoritesGamesUiModel(item=" + this.f42817a + ", category=" + this.b + Separators.RPAREN;
    }
}
