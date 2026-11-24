package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16367a;
    public final long b;
    public final lho c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final cys0 l;
    public final List m;
    public final List n;
    public final boolean o;

    public jed(String str, long j, lho lhoVar, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, cys0 cys0Var, List list, List list2, boolean z) {
        str.getClass();
        str6.getClass();
        str7.getClass();
        list.getClass();
        list2.getClass();
        this.f16367a = str;
        this.b = j;
        this.c = lhoVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = i;
        this.k = i2;
        this.l = cys0Var;
        this.m = list;
        this.n = list2;
        this.o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jed)) {
            return false;
        }
        jed jedVar = (jed) obj;
        return Intrinsics.d(this.f16367a, jedVar.f16367a) && this.b == jedVar.b && this.c == jedVar.c && this.d.equals(jedVar.d) && this.e.equals(jedVar.e) && this.f.equals(jedVar.f) && this.g.equals(jedVar.g) && Intrinsics.d(this.h, jedVar.h) && Intrinsics.d(this.i, jedVar.i) && this.j == jedVar.j && this.k == jedVar.k && this.l == jedVar.l && Intrinsics.d(this.m, jedVar.m) && Intrinsics.d(this.n, jedVar.n) && this.o == jedVar.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + dw9.a(dw9.a((this.l.hashCode() + twn.a(this.k, twn.a(this.j, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.c.hashCode() + rw2.b(this.f16367a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "CompletedMatchesGameStatisticModel(statisticGameId=", this.f16367a, ", feedGameId=");
        sbO.append(", statusType=");
        sbO.append(this.c);
        sbO.append(", team1Name=");
        sbO.append(this.d);
        f140.v(sbO, ", team2Name=", this.e, ", team1Image=", this.f);
        f140.v(sbO, ", team2Image=", this.g, ", score1=", this.h);
        axq.s(this.j, ", score2=", this.i, ", dateStart=", sbO);
        sbO.append(", winner=");
        sbO.append(this.k);
        sbO.append(", typeCardGame=");
        sbO.append(this.l);
        hne.v(", subTeamOne=", ", subTeamTwo=", sbO, this.m, this.n);
        return f140.n(sbO, ", noScore=", this.o, Separators.RPAREN);
    }
}
