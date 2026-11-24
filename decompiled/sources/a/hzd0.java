package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hzd0 {
    public static final gzd0 Companion = new gzd0();
    public static final a8z[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f13902a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final List e;
    public final List f;

    static {
        wez wezVar = wez.f39042a;
        g = new a8z[]{null, null, null, null, maz.a(wezVar, new etd0((byte) 11)), maz.a(wezVar, new etd0((byte) 12))};
    }

    public /* synthetic */ hzd0(int i, Integer num, Integer num2, Integer num3, Integer num4, List list, List list2) {
        if ((i & 1) == 0) {
            this.f13902a = null;
        } else {
            this.f13902a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzd0)) {
            return false;
        }
        hzd0 hzd0Var = (hzd0) obj;
        return Intrinsics.d(this.f13902a, hzd0Var.f13902a) && Intrinsics.d(this.b, hzd0Var.b) && Intrinsics.d(this.c, hzd0Var.c) && Intrinsics.d(this.d, hzd0Var.d) && Intrinsics.d(this.e, hzd0Var.e) && Intrinsics.d(this.f, hzd0Var.f);
    }

    public final int hashCode() {
        Integer num = this.f13902a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("RainbowStatisticMatchesComparisonTeamResponse(directWonMatches=", this.f13902a, ", directWonRounds=", this.b, ", attackWins=");
        rz4.y(sbQ, this.c, ", defenseWins=", this.d, ", bannedMaps=");
        return kng0.n(", bannedOperators=", Separators.RPAREN, sbQ, this.e, this.f);
    }
}
