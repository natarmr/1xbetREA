package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vlv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37648a;
    public final hdm0 b;
    public final eme c;
    public final nc5 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final llm0 h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;

    public vlv0(long j, hdm0 hdm0Var, eme emeVar, nc5 nc5Var, boolean z, boolean z2, boolean z3, llm0 llm0Var, String str, String str2, String str3, String str4, String str5, List list) {
        list.getClass();
        this.f37648a = j;
        this.b = hdm0Var;
        this.c = emeVar;
        this.d = nc5Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = llm0Var;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = list;
    }

    public static vlv0 a(vlv0 vlv0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, List list, int i) {
        long j = vlv0Var.f37648a;
        hdm0 hdm0Var = vlv0Var.b;
        eme emeVar = vlv0Var.c;
        nc5 nc5Var2 = (i & 8) != 0 ? vlv0Var.d : nc5Var;
        boolean z4 = (i & 16) != 0 ? vlv0Var.e : z;
        boolean z5 = (i & 32) != 0 ? vlv0Var.f : z2;
        boolean z6 = (i & 64) != 0 ? vlv0Var.g : z3;
        llm0 llm0Var = vlv0Var.h;
        String str6 = (i & 256) != 0 ? vlv0Var.i : str;
        String str7 = (i & 512) != 0 ? vlv0Var.j : str2;
        String str8 = (i & 1024) != 0 ? vlv0Var.k : str3;
        String str9 = (i & 2048) != 0 ? vlv0Var.l : str4;
        String str10 = (i & 4096) != 0 ? vlv0Var.m : str5;
        List list2 = (i & 8192) != 0 ? vlv0Var.n : list;
        vlv0Var.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        list2.getClass();
        return new vlv0(j, hdm0Var, emeVar, nc5Var2, z4, z5, z6, llm0Var, str6, str7, str8, str9, str10, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlv0)) {
            return false;
        }
        vlv0 vlv0Var = (vlv0) obj;
        return this.f37648a == vlv0Var.f37648a && this.b.equals(vlv0Var.b) && this.c == vlv0Var.c && this.d.equals(vlv0Var.d) && this.e == vlv0Var.e && this.f == vlv0Var.f && this.g == vlv0Var.g && this.h == vlv0Var.h && this.i.equals(vlv0Var.i) && this.j.equals(vlv0Var.j) && this.k.equals(vlv0Var.k) && this.l.equals(vlv0Var.l) && this.m.equals(vlv0Var.m) && Intrinsics.d(this.n, vlv0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.h.hashCode() + brm0.e(brm0.e(brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f37648a) * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinterGamesMainState(sportId=");
        sb.append(this.f37648a);
        sb.append(", statisticHeaderModel=");
        sb.append(this.b);
        sb.append(", coreHeaderModel=");
        sb.append(this.c);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.d);
        w6x.A(", isLoading=", ", isError=", sb, this.e, this.f);
        sb.append(", isEmpty=");
        sb.append(this.g);
        sb.append(", screenStyle=");
        sb.append(this.h);
        f140.v(sb, ", trackId=", this.i, ", statId=", this.j);
        f140.v(sb, ", trackTitle=", this.k, ", tournamentTitle=", this.l);
        ua80.t(", dateStart=", this.m, ", mainItemList=", sb, this.n);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
