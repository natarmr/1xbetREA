package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e9g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7419a;
    public final String b;
    public final Set c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final List g;
    public final q5g0 h;
    public final long i;
    public final List j;
    public final v5l0 k;
    public final wcb l;
    public final yl9 m;
    public final boolean n;

    public e9g0(int i, String str, Set set, boolean z, boolean z2, String str2, List list, q5g0 q5g0Var, long j, List list2, v5l0 v5l0Var, wcb wcbVar, yl9 yl9Var, boolean z3) {
        str.getClass();
        set.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        v5l0Var.getClass();
        this.f7419a = i;
        this.b = str;
        this.c = set;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = list;
        this.h = q5g0Var;
        this.i = j;
        this.j = list2;
        this.k = v5l0Var;
        this.l = wcbVar;
        this.m = yl9Var;
        this.n = z3;
    }

    public static e9g0 a(e9g0 e9g0Var, Set set, List list, q5g0 q5g0Var, long j, List list2, wcb wcbVar, yl9 yl9Var, int i) {
        int i2 = e9g0Var.f7419a;
        String str = e9g0Var.b;
        Set set2 = (i & 4) != 0 ? e9g0Var.c : set;
        boolean z = e9g0Var.d;
        Set set3 = set2;
        boolean z2 = e9g0Var.e;
        String str2 = e9g0Var.f;
        List list3 = (i & 64) != 0 ? e9g0Var.g : list;
        q5g0 q5g0Var2 = (i & 128) != 0 ? e9g0Var.h : q5g0Var;
        long j2 = (i & 256) != 0 ? e9g0Var.i : j;
        List list4 = (i & 512) != 0 ? e9g0Var.j : list2;
        v5l0 v5l0Var = e9g0Var.k;
        wcb wcbVar2 = (i & 2048) != 0 ? e9g0Var.l : wcbVar;
        yl9 yl9Var2 = (i & 4096) != 0 ? e9g0Var.m : yl9Var;
        boolean z3 = e9g0Var.n;
        e9g0Var.getClass();
        str.getClass();
        set3.getClass();
        str2.getClass();
        list3.getClass();
        list4.getClass();
        v5l0Var.getClass();
        return new e9g0(i2, str, set3, z, z2, str2, list3, q5g0Var2, j2, list4, v5l0Var, wcbVar2, yl9Var2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9g0)) {
            return false;
        }
        e9g0 e9g0Var = (e9g0) obj;
        return this.f7419a == e9g0Var.f7419a && Intrinsics.d(this.b, e9g0Var.b) && Intrinsics.d(this.c, e9g0Var.c) && this.d == e9g0Var.d && this.e == e9g0Var.e && Intrinsics.d(this.f, e9g0Var.f) && Intrinsics.d(this.g, e9g0Var.g) && this.h == e9g0Var.h && this.i == e9g0Var.i && Intrinsics.d(this.j, e9g0Var.j) && this.k == e9g0Var.k && Intrinsics.d(this.l, e9g0Var.l) && this.m.equals(e9g0Var.m) && this.n == e9g0Var.n;
    }

    public final int hashCode() {
        int iC = axq.c(this.k, dw9.a(rw2.b((this.h.hashCode() + dw9.a(ua80.b(brm0.e(brm0.e(ohs0.g(this.c, ua80.b(Integer.hashCode(this.f7419a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31);
        wcb wcbVar = this.l;
        return Boolean.hashCode(this.n) + ((this.m.hashCode() + ((iC + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f7419a, "ResultsState(eventId=", ", eventTitle=", this.b, ", expandedHistoryGamesIds=");
        sbR.append(this.c);
        sbR.append(", customSportIcon=");
        sbR.append(this.d);
        sbR.append(", topIcon=");
        f140.s(", overrideImagesId=", this.f, ", historyGames=", sbR, this.e);
        sbR.append(this.g);
        sbR.append(", errorType=");
        sbR.append(this.h);
        sbR.append(", selectedSportId=");
        hne.x(sbR, this.i, ", sportFilterList=", this.j);
        sbR.append(", sportEventCardStyle=");
        sbR.append(this.k);
        sbR.append(", champImagesHolder=");
        sbR.append(this.l);
        sbR.append(", calendarStateModel=");
        sbR.append(this.m);
        sbR.append(", rtlSupport=");
        sbR.append(this.n);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
