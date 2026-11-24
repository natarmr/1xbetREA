package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41952a;
    public final String b;
    public final boolean c;
    public final enf0 d;
    public final whh0 e;
    public final ctf0 f;
    public final int g;
    public final List h;
    public final wcb i;
    public final v5l0 j;
    public final Set k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public y3g0(boolean z, String str, boolean z2, enf0 enf0Var, whh0 whh0Var, ctf0 ctf0Var, int i, List list, wcb wcbVar, v5l0 v5l0Var, Set set, boolean z3, boolean z4, boolean z5) {
        ctf0Var.getClass();
        set.getClass();
        this.f41952a = z;
        this.b = str;
        this.c = z2;
        this.d = enf0Var;
        this.e = whh0Var;
        this.f = ctf0Var;
        this.g = i;
        this.h = list;
        this.i = wcbVar;
        this.j = v5l0Var;
        this.k = set;
        this.l = z3;
        this.m = z4;
        this.n = z5;
    }

    public static y3g0 a(y3g0 y3g0Var, boolean z, String str, boolean z2, enf0 enf0Var, whh0 whh0Var, List list, wcb wcbVar, Set set, boolean z3, boolean z4, int i) {
        boolean z5 = (i & 1) != 0 ? y3g0Var.f41952a : z;
        String str2 = (i & 2) != 0 ? y3g0Var.b : str;
        boolean z6 = (i & 4) != 0 ? y3g0Var.c : z2;
        enf0 enf0Var2 = (i & 8) != 0 ? y3g0Var.d : enf0Var;
        whh0 whh0Var2 = (i & 16) != 0 ? y3g0Var.e : whh0Var;
        ctf0 ctf0Var = y3g0Var.f;
        int i2 = y3g0Var.g;
        List list2 = (i & 128) != 0 ? y3g0Var.h : list;
        wcb wcbVar2 = (i & 256) != 0 ? y3g0Var.i : wcbVar;
        v5l0 v5l0Var = y3g0Var.j;
        Set set2 = (i & 1024) != 0 ? y3g0Var.k : set;
        boolean z7 = (i & 2048) != 0 ? y3g0Var.l : z3;
        boolean z8 = y3g0Var.m;
        boolean z9 = (i & 8192) != 0 ? y3g0Var.n : z4;
        y3g0Var.getClass();
        ctf0Var.getClass();
        set2.getClass();
        return new y3g0(z5, str2, z6, enf0Var2, whh0Var2, ctf0Var, i2, list2, wcbVar2, v5l0Var, set2, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3g0)) {
            return false;
        }
        y3g0 y3g0Var = (y3g0) obj;
        return this.f41952a == y3g0Var.f41952a && this.b.equals(y3g0Var.b) && this.c == y3g0Var.c && this.d.equals(y3g0Var.d) && this.e.equals(y3g0Var.e) && Intrinsics.d(this.f, y3g0Var.f) && this.g == y3g0Var.g && Intrinsics.d(this.h, y3g0Var.h) && Intrinsics.d(this.i, y3g0Var.i) && this.j == y3g0Var.j && Intrinsics.d(this.k, y3g0Var.k) && this.l == y3g0Var.l && this.m == y3g0Var.m && this.n == y3g0Var.n;
    }

    public final int hashCode() {
        int iA = twn.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.e(ua80.b(Boolean.hashCode(this.f41952a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31, 31);
        List list = this.h;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        wcb wcbVar = this.i;
        return Boolean.hashCode(this.n) + brm0.e(brm0.e(ohs0.g(this.k, axq.c(this.j, (iHashCode + (wcbVar != null ? wcbVar.hashCode() : 0)) * 31, 31), 31), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("ResultSearchState(recommendRequested=", ", query=", this.b, this.f41952a, ", refresh=");
        sbQ.append(this.c);
        sbQ.append(", hintState=");
        sbQ.append(this.d);
        sbQ.append(", searchState=");
        sbQ.append(this.e);
        sbQ.append(", resourceManager=");
        sbQ.append(this.f);
        sbQ.append(", lottieType=");
        ohs0.v(this.g, ", specialEvents=", ", champImagesHolder=", sbQ, this.h);
        sbQ.append(this.i);
        sbQ.append(", sportEventCardStyle=");
        sbQ.append(this.j);
        sbQ.append(", expandedHistoryGamesIds=");
        sbQ.append(this.k);
        sbQ.append(", scrollTop=");
        sbQ.append(this.l);
        sbQ.append(", supportRtl=");
        return ohs0.p(", connected=", Separators.RPAREN, sbQ, this.m, this.n);
    }
}
