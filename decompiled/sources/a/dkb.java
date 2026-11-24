package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dkb implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f6222a;
    public final a4x b;

    public dkb(hjm hjmVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f6222a = hjmVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkb)) {
            return false;
        }
        dkb dkbVar = (dkb) obj;
        return this.f6222a.equals(dkbVar.f6222a) && Intrinsics.d(this.b, dkbVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "LEADERBOARD";
    }

    public final int hashCode() {
        return this.b.hashCode() + hne.e(this.f6222a, 968650819, 31);
    }

    public final String toString() {
        return "ChampionshipLeaderboardUiModel(key=LEADERBOARD, dsModel=" + this.f6222a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
