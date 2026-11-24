package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m020 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f20934a;
    public final a4x b;
    public final long c;
    public final a4x d;
    public final db00 e;
    public final ehm0 f;
    public final ehm0 g;
    public final ehm0 h;
    public final ehm0 i;
    public final ehm0 j;
    public final ehm0 k;
    public final ehm0 l;

    public m020(l7m0 l7m0Var, a4x a4xVar, long j, a4x a4xVar2, db00 db00Var, ehm0 ehm0Var, ehm0 ehm0Var2, ehm0 ehm0Var3, ehm0 ehm0Var4, ehm0 ehm0Var5, ehm0 ehm0Var6, ehm0 ehm0Var7) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f20934a = l7m0Var;
        this.b = a4xVar;
        this.c = j;
        this.d = a4xVar2;
        this.e = db00Var;
        this.f = ehm0Var;
        this.g = ehm0Var2;
        this.h = ehm0Var3;
        this.i = ehm0Var4;
        this.j = ehm0Var5;
        this.k = ehm0Var6;
        this.l = ehm0Var7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m020) {
            m020 m020Var = (m020) obj;
            if (this.f20934a == m020Var.f20934a && Intrinsics.d(this.b, m020Var.b) && this.c == m020Var.c && Intrinsics.d(this.d, m020Var.d) && this.e.equals(m020Var.e) && this.f.equals(m020Var.f) && this.g.equals(m020Var.g) && this.h.equals(m020Var.h) && this.i.equals(m020Var.i) && this.j.equals(m020Var.j) && this.k.equals(m020Var.k) && this.l.equals(m020Var.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + cs0.b(this.d, rw2.b(cs0.b(this.b, this.f20934a.hashCode() * 31, 31), 31, this.c), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MainStatisticContentUiModel(currentTabPage=" + this.f20934a + ", tabsTitlesListUiModel=" + this.b + ", sportId=" + this.c + ", menuItems=" + this.d + ", lineupUiState=" + this.e + ", gameEventUiModel=" + this.f + ", forecastUiState=" + this.g + ", preMatchUiState=" + this.h + ", lastGamesUiState=" + this.i + ", featureGamesUiState=" + this.j + ", gamesUiState=" + this.k + ", scoreUiState=" + this.l + Separators.RPAREN;
    }
}
