package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jja implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1z f16611a;
    public final bo8 b;

    public jja(i1z i1zVar, bo8 bo8Var) {
        dja djaVar = dja.PENALTY;
        this.f16611a = i1zVar;
        this.b = bo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jja)) {
            return false;
        }
        jja jjaVar = (jja) obj;
        dja djaVar = dja.PENALTY;
        return this.f16611a.equals(jjaVar.f16611a) && this.b.equals(jjaVar.b);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.LAST_GAMES;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f16611a.hashCode() + (dja.LAST_GAMES.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardLastGamesUiModel(type=" + dja.LAST_GAMES + ", contentUiModel=" + this.f16611a + ", bottomInfoUiModel=" + this.b + Separators.RPAREN;
    }
}
