package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class udt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35495a;
    public final long b;
    public final lho c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final cys0 j;
    public final List k;
    public final List l;

    public udt(String str, long j, lho lhoVar, int i, String str2, String str3, String str4, String str5, int i2, cys0 cys0Var, List list, List list2) {
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f35495a = str;
        this.b = j;
        this.c = lhoVar;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = i2;
        this.j = cys0Var;
        this.k = list;
        this.l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udt)) {
            return false;
        }
        udt udtVar = (udt) obj;
        return this.f35495a.equals(udtVar.f35495a) && this.b == udtVar.b && this.c == udtVar.c && this.d == udtVar.d && Intrinsics.d(this.e, udtVar.e) && Intrinsics.d(this.f, udtVar.f) && this.g.equals(udtVar.g) && this.h.equals(udtVar.h) && this.i == udtVar.i && this.j == udtVar.j && Intrinsics.d(this.k, udtVar.k) && Intrinsics.d(this.l, udtVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + dw9.a((this.j.hashCode() + twn.a(this.i, ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.d, (this.c.hashCode() + rw2.b(this.f35495a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "GamesStatisticModel(statisticGameId=", this.f35495a, ", feedGameId=");
        sbO.append(", statusType=");
        sbO.append(this.c);
        sbO.append(", dateStart=");
        sbO.append(this.d);
        f140.v(sbO, ", score1=", this.e, ", score2=", this.f);
        f140.v(sbO, ", team1=", this.g, ", team2=", this.h);
        sbO.append(", winner=");
        sbO.append(this.i);
        sbO.append(", typeCardGame=");
        sbO.append(this.j);
        hne.v(", subTeamOne=", ", subTeamTwo=", sbO, this.k, this.l);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
