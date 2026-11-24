package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jia implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3n f16564a;

    public jia(n3n n3nVar) {
        dja djaVar = dja.PENALTY;
        this.f16564a = n3nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jia)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return this.f16564a.equals(((jia) obj).f16564a);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.COMMON;
    }

    public final int hashCode() {
        return this.f16564a.hashCode() + (dja.COMMON.hashCode() * 31);
    }

    public final String toString() {
        return "CardGameBoardUiModel(type=" + dja.COMMON + ", uiModel=" + this.f16564a + Separators.RPAREN;
    }
}
