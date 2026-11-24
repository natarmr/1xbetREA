package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ezd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8668a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;
    public final List f;

    public ezd0(int i, int i2, int i3, int i4, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f8668a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezd0)) {
            return false;
        }
        ezd0 ezd0Var = (ezd0) obj;
        return this.f8668a == ezd0Var.f8668a && this.b == ezd0Var.b && this.c == ezd0Var.c && this.d == ezd0Var.d && Intrinsics.d(this.e, ezd0Var.e) && Intrinsics.d(this.f, ezd0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f8668a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("RainbowStatisticMatchesComparisonTeamModel(directWonMatches=", this.f8668a, ", directWonRounds=", ", attackWins=", this.b);
        axq.r(this.c, this.d, ", defenseWins=", ", bannedMaps=", sbT);
        return kng0.n(", bannedOperators=", Separators.RPAREN, sbT, this.e, this.f);
    }
}
