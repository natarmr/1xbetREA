package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ufc.api.championship.UfcChampionshipParams;

/* JADX INFO: loaded from: classes6.dex */
public final class alb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UfcChampionshipParams f1060a;
    public final kgz b;
    public final List c;
    public final boolean d;
    public final sff0 e;
    public final boolean f;
    public final Locale g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final jkb k;
    public final j0g0 l;
    public final j0g0 m;
    public final Set n;

    public alb(UfcChampionshipParams ufcChampionshipParams, kgz kgzVar, List list, boolean z, sff0 sff0Var, boolean z2, Locale locale, boolean z3, boolean z4, boolean z5, jkb jkbVar, j0g0 j0g0Var, j0g0 j0g0Var2, Set set) {
        set.getClass();
        this.f1060a = ufcChampionshipParams;
        this.b = kgzVar;
        this.c = list;
        this.d = z;
        this.e = sff0Var;
        this.f = z2;
        this.g = locale;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = jkbVar;
        this.l = j0g0Var;
        this.m = j0g0Var2;
        this.n = set;
    }

    public static alb a(alb albVar, boolean z, jkb jkbVar, j0g0 j0g0Var, j0g0 j0g0Var2, LinkedHashSet linkedHashSet, int i) {
        UfcChampionshipParams ufcChampionshipParams = albVar.f1060a;
        kgz kgzVar = albVar.b;
        List list = albVar.c;
        boolean z2 = albVar.d;
        sff0 sff0Var = albVar.e;
        boolean z3 = albVar.f;
        Locale locale = albVar.g;
        boolean z4 = albVar.h;
        boolean z5 = albVar.i;
        boolean z6 = (i & 512) != 0 ? albVar.j : z;
        jkb jkbVar2 = (i & 1024) != 0 ? albVar.k : jkbVar;
        j0g0 j0g0Var3 = (i & 2048) != 0 ? albVar.l : j0g0Var;
        j0g0 j0g0Var4 = (i & 4096) != 0 ? albVar.m : j0g0Var2;
        Set set = (i & 8192) != 0 ? albVar.n : linkedHashSet;
        albVar.getClass();
        set.getClass();
        return new alb(ufcChampionshipParams, kgzVar, list, z2, sff0Var, z3, locale, z4, z5, z6, jkbVar2, j0g0Var3, j0g0Var4, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alb)) {
            return false;
        }
        alb albVar = (alb) obj;
        return this.f1060a.equals(albVar.f1060a) && this.b == albVar.b && Intrinsics.d(this.c, albVar.c) && this.d == albVar.d && this.e.equals(albVar.e) && this.f == albVar.f && this.g.equals(albVar.g) && this.h == albVar.h && this.i == albVar.i && this.j == albVar.j && Intrinsics.d(this.k, albVar.k) && Intrinsics.d(this.l, albVar.l) && Intrinsics.d(this.m, albVar.m) && Intrinsics.d(this.n, albVar.n);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f1060a.hashCode() * 31)) * 31;
        List list = this.c;
        int iE = brm0.e(brm0.e(brm0.e((this.g.hashCode() + brm0.e(cs0.c(this.e, brm0.e((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.d), 31), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j);
        jkb jkbVar = this.k;
        int iHashCode2 = (iE + (jkbVar == null ? 0 : jkbVar.hashCode())) * 31;
        j0g0 j0g0Var = this.l;
        int iB = (iHashCode2 + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31;
        j0g0 j0g0Var2 = this.m;
        return this.n.hashCode() + ((iB + (j0g0Var2 != null ? j0g0.b(j0g0Var2.f15681a) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipStateModel(params=");
        sb.append(this.f1060a);
        sb.append(", gender=");
        sb.append(this.b);
        sb.append(", specialEventList=");
        rz4.z(sb, ", bettingDisabled=", this.c, ", remoteConfigModel=", this.d);
        sb.append(this.e);
        sb.append(", tablet=");
        sb.append(this.f);
        sb.append(", currentLocale=");
        sb.append(this.g);
        sb.append(", supportRtl=");
        sb.append(this.h);
        sb.append(", showVenue=");
        ua80.u(", connected=", ", scenarioModel=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", results=");
        sb.append(this.l);
        sb.append(", stadiumInfoResult=");
        sb.append(this.m);
        sb.append(", expandedHistoryGamesIds=");
        sb.append(this.n);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
