package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class mbp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21520a;
    public final TeamDetailsParams b;
    public final o9p0 c;
    public final Map d;
    public final boolean e;
    public final sff0 f;
    public final v8d g;
    public final fbp0 h;
    public final boolean i;
    public final List j;
    public final e9p0 k;
    public final obp0 l;
    public final Integer m;
    public final List n;
    public final boolean o;

    public mbp0(boolean z, TeamDetailsParams teamDetailsParams, o9p0 o9p0Var, Map map, boolean z2, sff0 sff0Var, v8d v8dVar, fbp0 fbp0Var, boolean z3, List list, e9p0 e9p0Var, obp0 obp0Var, Integer num, List list2, boolean z4) {
        v8dVar.getClass();
        list.getClass();
        list2.getClass();
        this.f21520a = z;
        this.b = teamDetailsParams;
        this.c = o9p0Var;
        this.d = map;
        this.e = z2;
        this.f = sff0Var;
        this.g = v8dVar;
        this.h = fbp0Var;
        this.i = z3;
        this.j = list;
        this.k = e9p0Var;
        this.l = obp0Var;
        this.m = num;
        this.n = list2;
        this.o = z4;
    }

    public static mbp0 a(mbp0 mbp0Var, boolean z, o9p0 o9p0Var, Map map, fbp0 fbp0Var, e9p0 e9p0Var, obp0 obp0Var, Integer num, ArrayList arrayList, int i) {
        boolean z2 = (i & 1) != 0 ? mbp0Var.f21520a : z;
        TeamDetailsParams teamDetailsParams = mbp0Var.b;
        o9p0 o9p0Var2 = (i & 4) != 0 ? mbp0Var.c : o9p0Var;
        Map map2 = (i & 8) != 0 ? mbp0Var.d : map;
        boolean z3 = mbp0Var.e;
        sff0 sff0Var = mbp0Var.f;
        v8d v8dVar = mbp0Var.g;
        fbp0 fbp0Var2 = (i & 128) != 0 ? mbp0Var.h : fbp0Var;
        boolean z4 = mbp0Var.i;
        List list = mbp0Var.j;
        e9p0 e9p0Var2 = (i & 1024) != 0 ? mbp0Var.k : e9p0Var;
        obp0 obp0Var2 = (i & 2048) != 0 ? mbp0Var.l : obp0Var;
        Integer num2 = (i & 4096) != 0 ? mbp0Var.m : num;
        List list2 = (i & 8192) != 0 ? mbp0Var.n : arrayList;
        boolean z5 = mbp0Var.o;
        mbp0Var.getClass();
        map2.getClass();
        v8dVar.getClass();
        list.getClass();
        list2.getClass();
        return new mbp0(z2, teamDetailsParams, o9p0Var2, map2, z3, sff0Var, v8dVar, fbp0Var2, z4, list, e9p0Var2, obp0Var2, num2, list2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbp0)) {
            return false;
        }
        mbp0 mbp0Var = (mbp0) obj;
        return this.f21520a == mbp0Var.f21520a && this.b.equals(mbp0Var.b) && Intrinsics.d(this.c, mbp0Var.c) && this.d.equals(mbp0Var.d) && this.e == mbp0Var.e && this.f.equals(mbp0Var.f) && Intrinsics.d(this.g, mbp0Var.g) && this.h.equals(mbp0Var.h) && this.i == mbp0Var.i && Intrinsics.d(this.j, mbp0Var.j) && Intrinsics.d(this.k, mbp0Var.k) && Intrinsics.d(this.l, mbp0Var.l) && Intrinsics.d(this.m, mbp0Var.m) && Intrinsics.d(this.n, mbp0Var.n) && this.o == mbp0Var.o;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.f21520a) * 31)) * 31;
        o9p0 o9p0Var = this.c;
        int iA = dw9.a(brm0.e((this.h.hashCode() + ((this.g.hashCode() + cs0.c(this.f, brm0.e(ohs0.f(this.d, (iHashCode + (o9p0Var == null ? 0 : o9p0Var.hashCode())) * 31, 31), 31, this.e), 31)) * 31)) * 31, 31, this.i), 31, this.j);
        e9p0 e9p0Var = this.k;
        int iHashCode2 = (iA + (e9p0Var == null ? 0 : e9p0Var.hashCode())) * 31;
        obp0 obp0Var = this.l;
        int iHashCode3 = (iHashCode2 + (obp0Var == null ? 0 : obp0Var.hashCode())) * 31;
        Integer num = this.m;
        return Boolean.hashCode(this.o) + dw9.a((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamDetailsStateModel(connected=");
        sb.append(this.f21520a);
        sb.append(", params=");
        sb.append(this.b);
        sb.append(", teamDetails=");
        sb.append(this.c);
        sb.append(", sportMap=");
        sb.append(this.d);
        sb.append(", tablet=");
        sb.append(this.e);
        sb.append(", remoteConfigModel=");
        sb.append(this.f);
        sb.append(", commonConfigModel=");
        sb.append(this.g);
        sb.append(", currentSegment=");
        sb.append(this.h);
        sb.append(", bettingDisabled=");
        vqd.y(sb, ", specialEventList=", this.j, ", eventsScenarioModel=", this.i);
        sb.append(this.k);
        sb.append(", teamScenarioModel=");
        sb.append(this.l);
        sb.append(", selectedDateIndex=");
        cs0.z(sb, this.m, ", allLineups=", this.n, ", supportRtl=");
        return rw2.p(sb, this.o, Separators.RPAREN);
    }
}
