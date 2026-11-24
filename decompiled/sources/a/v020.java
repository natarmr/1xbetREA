package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v020 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36563a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final xqj0 h;
    public final ixs0 i;
    public final zdm0 j;
    public final nc5 k;
    public final Set l;
    public final ehm0 m;
    public final ehm0 n;
    public final na00 o;
    public final ehm0 p;
    public final List q;
    public final ehm0 r;
    public final ehm0 s;
    public final ehm0 t;
    public final ehm0 u;
    public final uaq0 v;
    public final llm0 w;

    static {
        xqj0 xqj0Var = xqj0.v;
    }

    public v020(boolean z, boolean z2, long j, boolean z3, String str, String str2, int i, xqj0 xqj0Var, ixs0 ixs0Var, zdm0 zdm0Var, nc5 nc5Var, Set set, ehm0 ehm0Var, ehm0 ehm0Var2, na00 na00Var, ehm0 ehm0Var3, List list, ehm0 ehm0Var4, ehm0 ehm0Var5, ehm0 ehm0Var6, ehm0 ehm0Var7, uaq0 uaq0Var, llm0 llm0Var) {
        xqj0Var.getClass();
        list.getClass();
        this.f36563a = z;
        this.b = z2;
        this.c = j;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = xqj0Var;
        this.i = ixs0Var;
        this.j = zdm0Var;
        this.k = nc5Var;
        this.l = set;
        this.m = ehm0Var;
        this.n = ehm0Var2;
        this.o = na00Var;
        this.p = ehm0Var3;
        this.q = list;
        this.r = ehm0Var4;
        this.s = ehm0Var5;
        this.t = ehm0Var6;
        this.u = ehm0Var7;
        this.v = uaq0Var;
        this.w = llm0Var;
    }

    public static v020 a(v020 v020Var, boolean z, boolean z2, long j, boolean z3, int i, xqj0 xqj0Var, ixs0 ixs0Var, zdm0 zdm0Var, nc5 nc5Var, Set set, ehm0 ehm0Var, ehm0 ehm0Var2, na00 na00Var, ehm0 ehm0Var3, List list, ehm0 ehm0Var4, ehm0 ehm0Var5, ehm0 ehm0Var6, ehm0 ehm0Var7, uaq0 uaq0Var, int i2) {
        boolean z4 = (i2 & 1) != 0 ? v020Var.f36563a : z;
        boolean z5 = (i2 & 2) != 0 ? v020Var.b : z2;
        long j2 = (i2 & 4) != 0 ? v020Var.c : j;
        boolean z6 = (i2 & 8) != 0 ? v020Var.d : z3;
        String str = v020Var.e;
        String str2 = v020Var.f;
        int i3 = (i2 & 64) != 0 ? v020Var.g : i;
        xqj0 xqj0Var2 = (i2 & 128) != 0 ? v020Var.h : xqj0Var;
        ixs0 ixs0Var2 = (i2 & 256) != 0 ? v020Var.i : ixs0Var;
        zdm0 zdm0Var2 = (i2 & 512) != 0 ? v020Var.j : zdm0Var;
        nc5 nc5Var2 = (i2 & 1024) != 0 ? v020Var.k : nc5Var;
        Set set2 = (i2 & 2048) != 0 ? v020Var.l : set;
        ehm0 ehm0Var8 = (i2 & 4096) != 0 ? v020Var.m : ehm0Var;
        ehm0 ehm0Var9 = (i2 & 8192) != 0 ? v020Var.n : ehm0Var2;
        na00 na00Var2 = (i2 & 16384) != 0 ? v020Var.o : na00Var;
        ehm0 ehm0Var10 = (32768 & i2) != 0 ? v020Var.p : ehm0Var3;
        List list2 = (65536 & i2) != 0 ? v020Var.q : list;
        ehm0 ehm0Var11 = (131072 & i2) != 0 ? v020Var.r : ehm0Var4;
        ehm0 ehm0Var12 = (262144 & i2) != 0 ? v020Var.s : ehm0Var5;
        ehm0 ehm0Var13 = (524288 & i2) != 0 ? v020Var.t : ehm0Var6;
        ehm0 ehm0Var14 = (1048576 & i2) != 0 ? v020Var.u : ehm0Var7;
        uaq0 uaq0Var2 = (i2 & 2097152) != 0 ? v020Var.v : uaq0Var;
        llm0 llm0Var = v020Var.w;
        v020Var.getClass();
        xqj0Var2.getClass();
        list2.getClass();
        uaq0Var2.getClass();
        return new v020(z4, z5, j2, z6, str, str2, i3, xqj0Var2, ixs0Var2, zdm0Var2, nc5Var2, set2, ehm0Var8, ehm0Var9, na00Var2, ehm0Var10, list2, ehm0Var11, ehm0Var12, ehm0Var13, ehm0Var14, uaq0Var2, llm0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v020)) {
            return false;
        }
        v020 v020Var = (v020) obj;
        return this.f36563a == v020Var.f36563a && this.b == v020Var.b && this.c == v020Var.c && this.d == v020Var.d && this.e.equals(v020Var.e) && this.f.equals(v020Var.f) && this.g == v020Var.g && Intrinsics.d(this.h, v020Var.h) && Intrinsics.d(this.i, v020Var.i) && this.j.equals(v020Var.j) && this.k.equals(v020Var.k) && this.l.equals(v020Var.l) && this.m.equals(v020Var.m) && this.n.equals(v020Var.n) && this.o.equals(v020Var.o) && this.p.equals(v020Var.p) && Intrinsics.d(this.q, v020Var.q) && this.r.equals(v020Var.r) && this.s.equals(v020Var.s) && this.t.equals(v020Var.t) && this.u.equals(v020Var.u) && this.v == v020Var.v && this.w == v020Var.w;
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + twn.a(this.g, ua80.b(ua80.b(brm0.e(rw2.b(brm0.e(Boolean.hashCode(this.f36563a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31)) * 31;
        ixs0 ixs0Var = this.i;
        return this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + dw9.a((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ohs0.g(this.l, (this.k.hashCode() + kng0.a(this.j, (iHashCode + (ixs0Var == null ? 0 : ixs0Var.hashCode())) * 31, 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31, this.q)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("MainStatisticStateModel(isLoading=", ", isError=", ", sportId=", this.f36563a, this.b);
        hne.t(this.c, ", nightMode=", sbQ, this.d);
        f140.v(sbQ, ", customBackground=", this.e, ", statId=", this.f);
        sbQ.append(", currentTabPage=");
        sbQ.append(this.g);
        sbQ.append(", currentHeaderModel=");
        sbQ.append(this.h);
        sbQ.append(", twoTeamGameUiModel=");
        sbQ.append(this.i);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.j);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.k);
        sbQ.append(", tabsTitlesListUiModel=");
        sbQ.append(this.l);
        sbQ.append(", gameEventUiModel=");
        sbQ.append(this.m);
        sbQ.append(", forecastUiState=");
        sbQ.append(this.n);
        sbQ.append(", lineupsState=");
        sbQ.append(this.o);
        sbQ.append(", preMatchUiState=");
        sbQ.append(this.p);
        sbQ.append(", menuItems=");
        sbQ.append(this.q);
        sbQ.append(", lastGamesUiState=");
        sbQ.append(this.r);
        sbQ.append(", futureGamesUiState=");
        sbQ.append(this.s);
        sbQ.append(", gamesUiState=");
        sbQ.append(this.t);
        sbQ.append(", scoreUiState=");
        sbQ.append(this.u);
        sbQ.append(", theme=");
        sbQ.append(this.v);
        sbQ.append(", statisticStyle=");
        sbQ.append(this.w);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
