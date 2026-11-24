package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td5 f41693a;
    public final itv b;
    public final p580 c;
    public final c0s d;
    public final g0d e;
    public final j680 f;

    public xy6(td5 td5Var, itv itvVar, p580 p580Var, c0s c0sVar, g0d g0dVar, j680 j680Var) {
        this.f41693a = td5Var;
        this.b = itvVar;
        this.c = p580Var;
        this.d = c0sVar;
        this.e = g0dVar;
        this.f = j680Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy6)) {
            return false;
        }
        xy6 xy6Var = (xy6) obj;
        return this.f41693a.equals(xy6Var.f41693a) && Intrinsics.d(this.b, xy6Var.b) && Intrinsics.d(this.c, xy6Var.c) && this.d.equals(xy6Var.d) && Intrinsics.d(this.e, xy6Var.e) && Intrinsics.d(this.f, xy6Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f41693a.hashCode() * 31;
        itv itvVar = this.b;
        int iHashCode2 = (iHashCode + (itvVar == null ? 0 : itvVar.hashCode())) * 31;
        p580 p580Var = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (p580Var == null ? 0 : p580Var.hashCode())) * 31)) * 31;
        g0d g0dVar = this.e;
        int iHashCode4 = (iHashCode3 + (g0dVar == null ? 0 : g0dVar.hashCode())) * 31;
        j680 j680Var = this.f;
        return iHashCode4 + (j680Var != null ? j680Var.hashCode() : 0);
    }

    public final String toString() {
        return "BetGameInfoUiModel(backgroundUiModel=" + this.f41693a + ", headlineUiModel=" + this.b + ", opponentsUiModel=" + this.c + ", gameCardUiModel=" + this.d + ", coefficientSettingsUiModel=" + this.e + ", optionBetUiState=" + this.f + Separators.RPAREN;
    }
}
