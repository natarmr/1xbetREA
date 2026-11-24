package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class k9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17926a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final l9p0 g;
    public final l9p0 h;
    public final String i;
    public final String j;
    public final long k;
    public final String l;
    public final Map m;
    public final String n;
    public final int o;

    public k9p0(long j, long j2, long j3, long j4, String str, String str2, l9p0 l9p0Var, l9p0 l9p0Var2, String str3, String str4, long j5, String str5, Map map, String str6, int i) {
        this.f17926a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = str2;
        this.g = l9p0Var;
        this.h = l9p0Var2;
        this.i = str3;
        this.j = str4;
        this.k = j5;
        this.l = str5;
        this.m = map;
        this.n = str6;
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9p0)) {
            return false;
        }
        k9p0 k9p0Var = (k9p0) obj;
        return this.f17926a == k9p0Var.f17926a && this.b == k9p0Var.b && this.c == k9p0Var.c && this.d == k9p0Var.d && this.e.equals(k9p0Var.e) && this.f.equals(k9p0Var.f) && this.g.equals(k9p0Var.g) && this.h.equals(k9p0Var.h) && this.i.equals(k9p0Var.i) && this.j.equals(k9p0Var.j) && this.k == k9p0Var.k && this.l.equals(k9p0Var.l) && this.m.equals(k9p0Var.m) && this.n.equals(k9p0Var.n) && this.o == k9p0Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + ua80.b(ohs0.f(this.m, ua80.b(rw2.b(ua80.b(ua80.b((this.h.hashCode() + ((this.g.hashCode() + ua80.b(ua80.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f17926a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f17926a, "TeamDetailsGameResultModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", champId=");
        kng0.z(sbQ, this.d, ", champName=", this.e);
        sbQ.append(", champImage=");
        sbQ.append(this.f);
        sbQ.append(", firstTeam=");
        sbQ.append(this.g);
        sbQ.append(", secondTeam=");
        sbQ.append(this.h);
        sbQ.append(", score=");
        sbQ.append(this.i);
        hne.B(sbQ, ", dopInfo=", this.j, ", dateStartInSeconds=");
        kng0.z(sbQ, this.k, ", status=", this.l);
        sbQ.append(", matchInfos=");
        sbQ.append(this.m);
        sbQ.append(", statId=");
        sbQ.append(this.n);
        return vqd.p(sbQ, ", globalChampId=", this.o, Separators.RPAREN);
    }
}
