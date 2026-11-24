package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0t {
    public final boh A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final String I;
    public final String J;
    public final List K;
    public final long L;
    public final boolean M;
    public final boolean N;
    public final int O;
    public final Date P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5282a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final String i;
    public final List j;
    public final List k;
    public final List l;
    public final long m;
    public final long n;
    public final String o;
    public final rqs p;
    public final f0t q;
    public final f0t r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final List w;
    public final long x;
    public final pfs y;
    public final boolean z;

    public d0t(long j, String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, List list, List list2, List list3, long j2, long j3, String str7, rqs rqsVar, f0t f0tVar, f0t f0tVar2, long j4, long j5, long j6, long j7, List list4, long j8, pfs pfsVar, boolean z2, boh bohVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str8, String str9, List list5, long j9, boolean z10, boolean z11, int i2, Date date, String str10, String str11, boolean z12, int i3) {
        rz4.B(list, list2, list3, list4, list5);
        this.f5282a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = z;
        this.i = str6;
        this.j = list;
        this.k = list2;
        this.l = list3;
        this.m = j2;
        this.n = j3;
        this.o = str7;
        this.p = rqsVar;
        this.q = f0tVar;
        this.r = f0tVar2;
        this.s = j4;
        this.t = j5;
        this.u = j6;
        this.v = j7;
        this.w = list4;
        this.x = j8;
        this.y = pfsVar;
        this.z = z2;
        this.A = bohVar;
        this.B = z3;
        this.C = z4;
        this.D = z5;
        this.E = z6;
        this.F = z7;
        this.G = z8;
        this.H = z9;
        this.I = str8;
        this.J = str9;
        this.K = list5;
        this.L = j9;
        this.M = z10;
        this.N = z11;
        this.O = i2;
        this.P = date;
        this.Q = str10;
        this.R = str11;
        this.S = z12;
        this.T = i3;
    }

    public static d0t a(d0t d0tVar, List list, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, int i, int i2) {
        long j = (i & 1) != 0 ? d0tVar.f5282a : -117L;
        String str = d0tVar.b;
        String str2 = d0tVar.c;
        String str3 = d0tVar.d;
        String str4 = d0tVar.e;
        String str5 = d0tVar.f;
        int i3 = d0tVar.g;
        boolean z5 = d0tVar.h;
        String str6 = d0tVar.i;
        List list2 = d0tVar.j;
        List list3 = (i & 1024) != 0 ? d0tVar.k : list;
        List list4 = d0tVar.l;
        long j2 = d0tVar.m;
        long j3 = d0tVar.n;
        String str7 = d0tVar.o;
        rqs rqsVar = d0tVar.p;
        f0t f0tVar = d0tVar.q;
        f0t f0tVar2 = d0tVar.r;
        long j4 = d0tVar.s;
        long j5 = d0tVar.t;
        long j6 = d0tVar.u;
        long j7 = d0tVar.v;
        List list5 = d0tVar.w;
        long j8 = d0tVar.x;
        pfs pfsVar = d0tVar.y;
        boolean z6 = d0tVar.z;
        boh bohVar = d0tVar.A;
        boolean z7 = d0tVar.B;
        boolean z8 = d0tVar.C;
        boolean z9 = (i & 536870912) != 0 ? d0tVar.D : z;
        boolean z10 = (i & 1073741824) != 0 ? d0tVar.E : z2;
        boolean z11 = (i & Integer.MIN_VALUE) != 0 ? d0tVar.F : z3;
        boolean z12 = (i2 & 1) != 0 ? d0tVar.G : z4;
        boolean z13 = d0tVar.H;
        String str8 = d0tVar.I;
        String str9 = d0tVar.J;
        List list6 = (i2 & 16) != 0 ? d0tVar.K : arrayList;
        long j9 = d0tVar.L;
        boolean z14 = d0tVar.M;
        boolean z15 = d0tVar.N;
        int i4 = d0tVar.O;
        Date date = d0tVar.P;
        String str10 = d0tVar.Q;
        String str11 = d0tVar.R;
        boolean z16 = d0tVar.S;
        int i5 = d0tVar.T;
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new d0t(j, str, str2, str3, str4, str5, i3, z5, str6, list2, list3, list4, j2, j3, str7, rqsVar, f0tVar, f0tVar2, j4, j5, j6, j7, list5, j8, pfsVar, z6, bohVar, z7, z8, z9, z10, z11, z12, z13, str8, str9, list6, j9, z14, z15, i4, date, str10, str11, z16, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d0t.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d0t d0tVar = (d0t) obj;
        return this.f5282a == d0tVar.f5282a && this.h == d0tVar.h && Intrinsics.d(this.K, d0tVar.K) && this.E == d0tVar.E && this.F == d0tVar.F && this.D == d0tVar.D && Intrinsics.d(this.k, d0tVar.k) && this.p.equals(d0tVar.p) && this.G == d0tVar.G;
    }

    public final int hashCode() {
        return (this.K.hashCode() * 31) + Long.hashCode(this.f5282a);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5282a, "GameZip(id=", ", anyInfo=", this.b);
        f140.v(sbO, ", vid=", this.c, ", type=", this.d);
        f140.v(sbO, ", videoId=", this.e, ", period=", this.f);
        dw9.v(this.g, ", gameNumber=", ", isFinish=", sbO, this.h);
        ua80.t(", fullName=", this.i, ", events=", sbO, this.j);
        hne.v(", subGames=", ", groups=", sbO, this.k, this.l);
        kng0.A(sbO, ", idMain=", this.m, ", champId=");
        kng0.z(sbO, this.n, ", champName=", this.o);
        sbO.append(", score=");
        sbO.append(this.p);
        sbO.append(", firstOpponent=");
        sbO.append(this.q);
        sbO.append(", secondOpponent=");
        sbO.append(this.r);
        sbO.append(", timeStart=");
        sbO.append(this.s);
        kng0.A(sbO, ", timeBefore=", this.t, ", subSportId=");
        sbO.append(this.u);
        kng0.A(sbO, ", sportId=", this.v, ", infoStatList=");
        sbO.append(this.w);
        sbO.append(", constId=");
        sbO.append(this.x);
        sbO.append(", gameInfo=");
        sbO.append(this.y);
        sbO.append(", showPreMatch=");
        sbO.append(this.z);
        sbO.append(", cyberType=");
        sbO.append(this.A);
        sbO.append(", isHostGuest=");
        sbO.append(this.B);
        w6x.A(", live=", ", subscribed=", sbO, this.C, this.D);
        w6x.A(", favorite=", ", canSubscribe=", sbO, this.E, this.F);
        w6x.A(", videoSupport=", ", zoneSupport=", sbO, this.G, this.H);
        f140.v(sbO, ", sportName=", this.I, ", fullChampName=", this.J);
        sbO.append(", eventsByGroups=");
        sbO.append(this.K);
        sbO.append(", stadiumId=");
        hne.t(this.L, ", final=", sbO, this.M);
        cs0.v(this.O, ", coefsSupported=", ", globalChampId=", sbO, this.N);
        sbO.append(", requestedAt=");
        sbO.append(this.P);
        sbO.append(", statGameId=");
        sbO.append(this.Q);
        w6x.z(", opponents=", this.R, ", videoSoonSupport=", sbO, this.S);
        return vqd.p(sbO, ", countryId=", this.T, Separators.RPAREN);
    }
}
