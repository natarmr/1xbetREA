package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ech {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdh f7565a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final int g;
    public final List h;
    public final List i;
    public final List j;
    public final vbb0 k;
    public final cbe0 l;
    public final nnu0 m;
    public final int n;
    public final g5h o;
    public final List p;
    public final n2o q;

    public ech(hdh hdhVar, boolean z, boolean z2, boolean z3, String str, boolean z4, int i, List list, List list2, List list3, vbb0 vbb0Var, cbe0 cbe0Var, nnu0 nnu0Var, int i2, g5h g5hVar, List list4, n2o n2oVar) {
        hne.C(list, list2, list3, list4);
        this.f7565a = hdhVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = z4;
        this.g = i;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = vbb0Var;
        this.l = cbe0Var;
        this.m = nnu0Var;
        this.n = i2;
        this.o = g5hVar;
        this.p = list4;
        this.q = n2oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ech) {
            ech echVar = (ech) obj;
            if (this.f7565a == echVar.f7565a && this.b == echVar.b && this.c == echVar.c && this.d == echVar.d && this.e.equals(echVar.e) && this.f == echVar.f && this.g == echVar.g && Intrinsics.d(this.h, echVar.h) && Intrinsics.d(this.i, echVar.i) && Intrinsics.d(this.j, echVar.j) && this.k == echVar.k && this.l == echVar.l && this.m == echVar.m && this.n == echVar.n && this.o == echVar.o && Intrinsics.d(this.p, echVar.p) && this.q == echVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode() + dw9.a((this.o.hashCode() + twn.a(this.n, (this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + dw9.a(dw9.a(dw9.a(twn.a(this.g, brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(this.f7565a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31)) * 31, 31)) * 31, 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberRemoteConfigModel(cyberSportSettingsModel=");
        sb.append(this.f7565a);
        sb.append(", hasCyberSport=");
        sb.append(this.b);
        sb.append(", hasCyberOnboarding=");
        ua80.u(", hasUFC=", ", esportsBannerStyle=", sb, this.c, this.d);
        brm0.C(this.e, ", cyberChampTabletNewImageEnabled=", ", cyberGeneralChampId=", sb, this.f);
        ohs0.v(this.g, ", cyberGeneralChampSportsId=", ", cyberGeneralChampSportsDates=", sb, this.h);
        b1j.y(", cyberGeneralChampSportsChampId=", ", popularEsportsBannerStyle=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", realEsportsBannerStyle=");
        sb.append(this.l);
        sb.append(", virtualEsportsBannerStyle=");
        sb.append(this.m);
        sb.append(", esportsButtonImage=");
        sb.append(this.n);
        sb.append(", cyberMainScreenStyle=");
        sb.append(this.o);
        sb.append(", hltvChampIds=");
        sb.append(this.p);
        sb.append(", esportsDisciplineScreenStyle=");
        sb.append(this.q);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
