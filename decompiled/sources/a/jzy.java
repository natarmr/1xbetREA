package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17436a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final long h;
    public final lho i;
    public final cys0 j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final List o;
    public final List p;

    public jzy(int i, int i2, long j, lho lhoVar, cys0 cys0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2) {
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f17436a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i2;
        this.h = j;
        this.i = lhoVar;
        this.j = cys0Var;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = list;
        this.p = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzy)) {
            return false;
        }
        jzy jzyVar = (jzy) obj;
        return this.f17436a == jzyVar.f17436a && this.b.equals(jzyVar.b) && Intrinsics.d(this.c, jzyVar.c) && Intrinsics.d(this.d, jzyVar.d) && this.e.equals(jzyVar.e) && this.f.equals(jzyVar.f) && this.g == jzyVar.g && this.h == jzyVar.h && this.i == jzyVar.i && this.j == jzyVar.j && this.k.equals(jzyVar.k) && this.l.equals(jzyVar.l) && this.m.equals(jzyVar.m) && this.n.equals(jzyVar.n) && Intrinsics.d(this.o, jzyVar.o) && Intrinsics.d(this.p, jzyVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + dw9.a(ua80.b(ua80.b(ua80.b(ua80.b((this.j.hashCode() + ((this.i.hashCode() + rw2.b(twn.a(this.g, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f17436a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h)) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f17436a, "LastGameModel(dateStart=", ", gameId=", this.b, ", score1=");
        f140.v(sbR, this.c, ", score2=", this.d, ", teamId1=");
        f140.v(sbR, this.e, ", teamId2=", this.f, ", winner=");
        sbR.append(this.g);
        sbR.append(", feedGameId=");
        sbR.append(this.h);
        sbR.append(", statusType=");
        sbR.append(this.i);
        sbR.append(", typeCardGame=");
        sbR.append(this.j);
        f140.v(sbR, ", team1Name=", this.k, ", team2Name=", this.l);
        f140.v(sbR, ", team1Image=", this.m, ", team2Image=", this.n);
        hne.v(", subTeamOne=", ", subTeamTwo=", sbR, this.o, this.p);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
