package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kmg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18537a;
    public final int b;
    public final e8h c;
    public final e8h d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;
    public final ArrayList l;
    public final List m;
    public final List n;

    public kmg(long j, int i, e8h e8hVar, e8h e8hVar2, int i2, String str, String str2, String str3, List list, List list2, List list3, ArrayList arrayList, List list4, List list5) {
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.f18537a = j;
        this.b = i;
        this.c = e8hVar;
        this.d = e8hVar2;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = list;
        this.j = list2;
        this.k = list3;
        this.l = arrayList;
        this.m = list4;
        this.n = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmg)) {
            return false;
        }
        kmg kmgVar = (kmg) obj;
        return this.f18537a == kmgVar.f18537a && this.b == kmgVar.b && this.c.equals(kmgVar.c) && this.d.equals(kmgVar.d) && this.e == kmgVar.e && this.f.equals(kmgVar.f) && this.g.equals(kmgVar.g) && Intrinsics.d(this.h, kmgVar.h) && Intrinsics.d(this.i, kmgVar.i) && Intrinsics.d(this.j, kmgVar.j) && Intrinsics.d(this.k, kmgVar.k) && this.l.equals(kmgVar.l) && Intrinsics.d(this.m, kmgVar.m) && Intrinsics.d(this.n, kmgVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + dw9.a(twn.g(this.l, dw9.a(dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(twn.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f18537a) * 31, 31)) * 31)) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f18537a, "CyberDotaMatchesStatisticMatchModel(matchId=", ", mapNumber=");
        sbQ.append(", radiantTeam=");
        sbQ.append(this.c);
        sbQ.append(", direTeam=");
        sbQ.append(this.d);
        w6x.w(this.e, ", durationSeconds=", ", startTime=", this.f, sbQ);
        f140.v(sbQ, ", endTime=", this.g, ", matchDuration=", this.h);
        hne.v(", netWorthGraph=", ", expGraph=", sbQ, this.i, this.j);
        sbQ.append(", winRateGraph=");
        sbQ.append(this.k);
        sbQ.append(", allPlayers=");
        sbQ.append(this.l);
        hne.v(", banPicks=", ", gameLog=", sbQ, this.m, this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
