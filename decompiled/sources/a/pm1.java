package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27210a;
    public final String b;

    public pm1(long j, String str) {
        str.getClass();
        this.f27210a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm1)) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        return this.f27210a == pm1Var.f27210a && Intrinsics.d(this.b, pm1Var.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Long.hashCode(this.f27210a) * 31)) * 31) + 326313939;
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f27210a, "TournamentStagesScreen(tournamentId=", ", tournamentTitle=", this.b);
        sbO.append(", tournamentType=AGGREGATOR_TOURNAMENT_STAGES_CELL_STATIC_STYLE)");
        return sbO.toString();
    }
}
