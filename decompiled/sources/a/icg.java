package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class icg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14535a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final long h;
    public final heg i;
    public final heg j;
    public final String k;
    public final Map l;
    public final String m;
    public final String n;
    public final cg30 o;
    public final int p;

    public icg(long j, String str, String str2, String str3, String str4, long j2, long j3, long j4, heg hegVar, heg hegVar2, String str5, Map map, String str6, String str7, cg30 cg30Var, int i) {
        str2.getClass();
        this.f14535a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = hegVar;
        this.j = hegVar2;
        this.k = str5;
        this.l = map;
        this.m = str6;
        this.n = str7;
        this.o = cg30Var;
        this.p = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icg)) {
            return false;
        }
        icg icgVar = (icg) obj;
        return this.f14535a == icgVar.f14535a && this.b.equals(icgVar.b) && Intrinsics.d(this.c, icgVar.c) && this.d.equals(icgVar.d) && this.e.equals(icgVar.e) && this.f == icgVar.f && this.g == icgVar.g && this.h == icgVar.h && this.i.equals(icgVar.i) && this.j.equals(icgVar.j) && this.k.equals(icgVar.k) && this.l.equals(icgVar.l) && this.m.equals(icgVar.m) && this.n.equals(icgVar.n) && this.o == icgVar.o && this.p == icgVar.p;
    }

    public final int hashCode() {
        return Integer.hashCode(this.p) + ((this.o.hashCode() + ua80.b(ua80.b(ohs0.f(this.l, ua80.b((this.j.hashCode() + ((this.i.hashCode() + rw2.b(rw2.b(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f14535a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31, 31, this.k), 31), 31, this.m), 31, this.n)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f14535a, "CyberChampGameResultModel(id=", ", champName=", this.b);
        f140.v(sbO, ", score=", this.c, ", scoreBase=", this.d);
        hne.B(sbO, ", extraScore=", this.e, ", dateStartInSeconds=");
        sbO.append(this.f);
        kng0.A(sbO, ", sportId=", this.g, ", subSportId=");
        sbO.append(this.h);
        sbO.append(", firstTeam=");
        sbO.append(this.i);
        sbO.append(", secondTeam=");
        sbO.append(this.j);
        sbO.append(", dopInfo=");
        sbO.append(this.k);
        sbO.append(", matchInfo=");
        sbO.append(this.l);
        sbO.append(", status=");
        sbO.append(this.m);
        sbO.append(", statId=");
        sbO.append(this.n);
        sbO.append(", matchStatus=");
        sbO.append(this.o);
        return vqd.p(sbO, ", globalChampId=", this.p, Separators.RPAREN);
    }
}
