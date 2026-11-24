package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jkb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16659a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final ypl0 e;

    public jkb(Object obj, Object obj2, Object obj3, Object obj4, ypl0 ypl0Var) {
        ypl0Var.getClass();
        this.f16659a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = ypl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkb)) {
            return false;
        }
        jkb jkbVar = (jkb) obj;
        Object obj2 = jkbVar.f16659a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f16659a, obj2) && Intrinsics.d(this.b, jkbVar.b) && Intrinsics.d(this.c, jkbVar.c) && Intrinsics.d(this.d, jkbVar.d) && Intrinsics.d(this.e, jkbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.c(twn.c(twn.c(j0g0.b(this.f16659a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strD = j0g0.d(this.f16659a);
        String strD2 = j0g0.d(this.b);
        String strD3 = j0g0.d(this.c);
        String strD4 = j0g0.d(this.d);
        StringBuilder sbN = b1j.n("ChampionshipScenarioModel(tournamentResult=", strD, ", liveGamesResult=", strD2, ", lineGamesResult=");
        f140.v(sbN, strD3, ", leaderboardResult=", strD4, ", sportSimpleModel=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
