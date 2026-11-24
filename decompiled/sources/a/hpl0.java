package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hpl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13449a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final dnf0 f;
    public final dhh0 g;
    public final thh0 h;
    public final thh0 i;
    public final ctf0 j;
    public final y78 k;
    public final Integer l;
    public final List m;
    public final Boolean n;
    public final Boolean o;
    public final wcb p;
    public final v5l0 q;
    public final boolean r;

    public hpl0(boolean z, boolean z2, String str, String str2, boolean z3, dnf0 dnf0Var, dhh0 dhh0Var, thh0 thh0Var, thh0 thh0Var2, ctf0 ctf0Var, y78 y78Var, Integer num, List list, Boolean bool, Boolean bool2, wcb wcbVar, v5l0 v5l0Var, boolean z4) {
        dhh0Var.getClass();
        ctf0Var.getClass();
        this.f13449a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = dnf0Var;
        this.g = dhh0Var;
        this.h = thh0Var;
        this.i = thh0Var2;
        this.j = ctf0Var;
        this.k = y78Var;
        this.l = num;
        this.m = list;
        this.n = bool;
        this.o = bool2;
        this.p = wcbVar;
        this.q = v5l0Var;
        this.r = z4;
    }

    public static hpl0 a(hpl0 hpl0Var, boolean z, boolean z2, String str, String str2, boolean z3, dnf0 dnf0Var, dhh0 dhh0Var, thh0 thh0Var, thh0 thh0Var2, Integer num, List list, Boolean bool, Boolean bool2, wcb wcbVar, v5l0 v5l0Var, boolean z4, int i) {
        boolean z5 = (i & 1) != 0 ? hpl0Var.f13449a : z;
        boolean z6 = (i & 2) != 0 ? hpl0Var.b : z2;
        String str3 = (i & 4) != 0 ? hpl0Var.c : str;
        String str4 = (i & 8) != 0 ? hpl0Var.d : str2;
        boolean z7 = (i & 16) != 0 ? hpl0Var.e : z3;
        dnf0 dnf0Var2 = (i & 32) != 0 ? hpl0Var.f : dnf0Var;
        dhh0 dhh0Var2 = (i & 64) != 0 ? hpl0Var.g : dhh0Var;
        thh0 thh0Var3 = (i & 128) != 0 ? hpl0Var.h : thh0Var;
        thh0 thh0Var4 = (i & 256) != 0 ? hpl0Var.i : thh0Var2;
        ctf0 ctf0Var = hpl0Var.j;
        y78 y78Var = hpl0Var.k;
        Integer num2 = (i & 2048) != 0 ? hpl0Var.l : num;
        List list2 = (i & 4096) != 0 ? hpl0Var.m : list;
        Boolean bool3 = (i & 8192) != 0 ? hpl0Var.n : bool;
        Boolean bool4 = (i & 16384) != 0 ? hpl0Var.o : bool2;
        wcb wcbVar2 = (32768 & i) != 0 ? hpl0Var.p : wcbVar;
        v5l0 v5l0Var2 = (65536 & i) != 0 ? hpl0Var.q : v5l0Var;
        boolean z8 = (i & 131072) != 0 ? hpl0Var.r : z4;
        hpl0Var.getClass();
        str3.getClass();
        str4.getClass();
        dhh0Var2.getClass();
        ctf0Var.getClass();
        return new hpl0(z5, z6, str3, str4, z7, dnf0Var2, dhh0Var2, thh0Var3, thh0Var4, ctf0Var, y78Var, num2, list2, bool3, bool4, wcbVar2, v5l0Var2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpl0)) {
            return false;
        }
        hpl0 hpl0Var = (hpl0) obj;
        return this.f13449a == hpl0Var.f13449a && this.b == hpl0Var.b && this.c.equals(hpl0Var.c) && this.d.equals(hpl0Var.d) && this.e == hpl0Var.e && this.f.equals(hpl0Var.f) && this.g == hpl0Var.g && this.h.equals(hpl0Var.h) && this.i.equals(hpl0Var.i) && Intrinsics.d(this.j, hpl0Var.j) && this.k.equals(hpl0Var.k) && Intrinsics.d(this.l, hpl0Var.l) && Intrinsics.d(this.m, hpl0Var.m) && Intrinsics.d(this.n, hpl0Var.n) && Intrinsics.d(this.o, hpl0Var.o) && Intrinsics.d(this.p, hpl0Var.p) && this.q == hpl0Var.q && this.r == hpl0Var.r;
    }

    public final int hashCode() {
        int iHashCode = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + brm0.e(ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f13449a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Integer num = this.l;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.m;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.n;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.o;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        wcb wcbVar = this.p;
        int iHashCode6 = (iHashCode5 + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31;
        v5l0 v5l0Var = this.q;
        return Boolean.hashCode(this.r) + ((iHashCode6 + (v5l0Var != null ? v5l0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SportSearchState(recommendRequested=", ", topLineLiveRequested=", ", lastRequestedQuery=", this.f13449a, this.b);
        f140.v(sbQ, this.c, ", query=", this.d, ", refresh=");
        sbQ.append(this.e);
        sbQ.append(", hintState=");
        sbQ.append(this.f);
        sbQ.append(", searchShowType=");
        sbQ.append(this.g);
        sbQ.append(", liveState=");
        sbQ.append(this.h);
        sbQ.append(", lineState=");
        sbQ.append(this.i);
        sbQ.append(", resourceManager=");
        sbQ.append(this.j);
        sbQ.append(", gameUtilsProvider=");
        sbQ.append(this.k);
        sbQ.append(", lottieType=");
        sbQ.append(this.l);
        sbQ.append(", specialEvents=");
        sbQ.append(this.m);
        sbQ.append(", bettingDisabled=");
        sbQ.append(this.n);
        sbQ.append(", hasStream=");
        sbQ.append(this.o);
        sbQ.append(", champImagesHolder=");
        sbQ.append(this.p);
        sbQ.append(", sportEventCardStyle=");
        sbQ.append(this.q);
        sbQ.append(", supportRtl=");
        sbQ.append(this.r);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
