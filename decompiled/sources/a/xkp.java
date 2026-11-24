package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xkp implements qlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41039a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String e;
    public final int f;
    public final ArrayList g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public xkp(long j, String str, long j2, boolean z, String str2, int i, ArrayList arrayList, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        this.f41039a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = str2;
        this.f = i;
        this.g = arrayList;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        xkp xkpVar = obj instanceof xkp ? (xkp) obj : null;
        return xkpVar != null && Intrinsics.d(this.e, xkpVar.e) && Intrinsics.d(this.b, xkpVar.b) && this.f == xkpVar.f && this.h == xkpVar.h && this.i == xkpVar.i && this.j == xkpVar.j;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof xkp) && (p6t0Var2 instanceof xkp) && ((xkp) p6t0Var).f41039a == ((xkp) p6t0Var2).f41039a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + brm0.e(brm0.e(twn.a(this.f, ua80.b(this.e.hashCode() * 31, 31, this.b), 31), 31, this.h), 31, this.i);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof xkp) && (p6t0Var2 instanceof xkp)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            xkp xkpVar = (xkp) p6t0Var;
            xkp xkpVar2 = (xkp) p6t0Var2;
            k9x.G(linkedHashSet, new wkp(xkpVar.f), new wkp(xkpVar2.f));
            k9x.G(linkedHashSet, new vkp(xkpVar.j), new vkp(xkpVar2.j));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strE = ua80.e(this.f, "GamesCount(value=", Separators.RPAREN);
        String strD = defpackage.c.d("Expanded(value=", Separators.RPAREN, this.j);
        StringBuilder sbO = axq.o(this.f41039a, "FeedsChampGroupItem(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", subSportId=0, live=");
        f140.s(", image=", this.e, ", gamesCount=", sbO, this.d);
        sbO.append(strE);
        sbO.append(", champSubItems=");
        sbO.append(this.g);
        sbO.append(", top=");
        ua80.u(", new=", ", expanded=", sbO, this.h, this.i);
        return axq.n(sbO, strD, Separators.RPAREN);
    }
}
