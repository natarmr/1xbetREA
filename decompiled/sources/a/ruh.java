package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ruh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31127a;
    public final zdm0 b;
    public final nc5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final llm0 g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;

    public ruh(long j, zdm0 zdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, llm0 llm0Var, String str, String str2, String str3, String str4, String str5, List list) {
        list.getClass();
        this.f31127a = j;
        this.b = zdm0Var;
        this.c = nc5Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = llm0Var;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = list;
    }

    public static ruh a(ruh ruhVar, nc5 nc5Var, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, List list, int i) {
        long j = ruhVar.f31127a;
        zdm0 zdm0Var = ruhVar.b;
        nc5 nc5Var2 = (i & 4) != 0 ? ruhVar.c : nc5Var;
        boolean z4 = (i & 8) != 0 ? ruhVar.d : z;
        boolean z5 = (i & 16) != 0 ? ruhVar.e : z2;
        boolean z6 = (i & 32) != 0 ? ruhVar.f : z3;
        llm0 llm0Var = ruhVar.g;
        String str6 = (i & 128) != 0 ? ruhVar.h : str;
        String str7 = (i & 256) != 0 ? ruhVar.i : str2;
        String str8 = (i & 512) != 0 ? ruhVar.j : str3;
        String str9 = (i & 1024) != 0 ? ruhVar.k : str4;
        String str10 = (i & 2048) != 0 ? ruhVar.l : str5;
        List list2 = (i & 4096) != 0 ? ruhVar.m : list;
        ruhVar.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        list2.getClass();
        return new ruh(j, zdm0Var, nc5Var2, z4, z5, z6, llm0Var, str6, str7, str8, str9, str10, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruh)) {
            return false;
        }
        ruh ruhVar = (ruh) obj;
        return this.f31127a == ruhVar.f31127a && this.b.equals(ruhVar.b) && this.c.equals(ruhVar.c) && this.d == ruhVar.d && this.e == ruhVar.e && this.f == ruhVar.f && this.g == ruhVar.g && this.h.equals(ruhVar.h) && this.i.equals(ruhVar.i) && this.j.equals(ruhVar.j) && this.k.equals(ruhVar.k) && this.l.equals(ruhVar.l) && Intrinsics.d(this.m, ruhVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.g.hashCode() + brm0.e(brm0.e(brm0.e((this.c.hashCode() + kng0.a(this.b, Long.hashCode(this.f31127a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyclingMainState(sportId=");
        sb.append(this.f31127a);
        sb.append(", statisticHeaderUiModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        w6x.A(", isError=", ", isEmpty=", sb, this.e, this.f);
        sb.append(", screenStyle=");
        sb.append(this.g);
        sb.append(", trackId=");
        sb.append(this.h);
        f140.v(sb, ", statId=", this.i, ", trackTitle=", this.j);
        f140.v(sb, ", tournamentTitle=", this.k, ", dateStart=", this.l);
        return ohs0.s(sb, ", mainItemList=", this.m, Separators.RPAREN);
    }
}
