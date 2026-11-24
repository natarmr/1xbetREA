package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ija implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1z f14864a;
    public final ao8 b;

    public ija(g1z g1zVar, ao8 ao8Var) {
        dja djaVar = dja.PENALTY;
        this.f14864a = g1zVar;
        this.b = ao8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ija)) {
            return false;
        }
        ija ijaVar = (ija) obj;
        dja djaVar = dja.PENALTY;
        return this.f14864a.equals(ijaVar.f14864a) && this.b.equals(ijaVar.b);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.LAST_GAMES;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f14864a.hashCode() + (dja.LAST_GAMES.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardLastGamesUiModel(type=" + dja.LAST_GAMES + ", contentUiModel=" + this.f14864a + ", bottomInfoUiModel=" + this.b + Separators.RPAREN;
    }
}
