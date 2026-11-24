package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ivd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15441a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final Map f;
    public final Map g;
    public final rvd0 h;
    public final List i;

    public ivd0(long j, String str, List list, List list2, int i, Map map, Map map2, rvd0 rvd0Var, List list3) {
        b1j.B(list, list2, list3);
        this.f15441a = j;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = map;
        this.g = map2;
        this.h = rvd0Var;
        this.i = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivd0)) {
            return false;
        }
        ivd0 ivd0Var = (ivd0) obj;
        return this.f15441a == ivd0Var.f15441a && this.b.equals(ivd0Var.b) && Intrinsics.d(this.c, ivd0Var.c) && Intrinsics.d(this.d, ivd0Var.d) && this.e == ivd0Var.e && this.f.equals(ivd0Var.f) && this.g.equals(ivd0Var.g) && this.h == ivd0Var.h && Intrinsics.d(this.i, ivd0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ohs0.f(this.g, ohs0.f(this.f, twn.a(this.e, dw9.a(dw9.a(ua80.b(Long.hashCode(this.f15441a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f15441a, "RainbowGameStatisticMainStatModel(teamId=", ", teamName=", this.b);
        hne.v(", teamImages=", ", playerStatistic=", sbO, this.c, this.d);
        sbO.append(", teamScore=");
        sbO.append(this.e);
        sbO.append(", firstRoundsHistory=");
        sbO.append(this.f);
        sbO.append(", secondRoundsHistory=");
        sbO.append(this.g);
        sbO.append(", role=");
        sbO.append(this.h);
        return ohs0.s(sbO, ", bans=", this.i, Separators.RPAREN);
    }
}
