package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i1b implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a570 f13989a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final d1b e;
    public final boolean f;
    public final hcs g;
    public final String h;

    public i1b(a570 a570Var, boolean z, boolean z2, String str, d1b d1bVar, boolean z3, hcs hcsVar, String str2) {
        a570Var.getClass();
        str.getClass();
        hcsVar.getClass();
        str2.getClass();
        this.f13989a = a570Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = d1bVar;
        this.f = z3;
        this.g = hcsVar;
        this.h = str2;
    }

    public static i1b c(i1b i1bVar, boolean z, boolean z2) {
        a570 a570Var = i1bVar.f13989a;
        String str = i1bVar.d;
        d1b d1bVar = i1bVar.e;
        boolean z3 = i1bVar.f;
        hcs hcsVar = i1bVar.g;
        String str2 = i1bVar.h;
        i1bVar.getClass();
        a570Var.getClass();
        str.getClass();
        hcsVar.getClass();
        str2.getClass();
        return new i1b(a570Var, z, z2, str, d1bVar, z3, hcsVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1b)) {
            return false;
        }
        i1b i1bVar = (i1b) obj;
        return Intrinsics.d(this.f13989a, i1bVar.f13989a) && this.b == i1bVar.b && this.c == i1bVar.c && Intrinsics.d(this.d, i1bVar.d) && this.e.equals(i1bVar.e) && this.f == i1bVar.f && this.g == i1bVar.g && Intrinsics.d(this.h, i1bVar.h);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return ((p6t0Var instanceof i1b) && (p6t0Var2 instanceof i1b)) ? Intrinsics.d(((i1b) p6t0Var).f13989a, ((i1b) p6t0Var2).f13989a) : super.g(p6t0Var, p6t0Var2);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return ((p6t0Var instanceof i1b) && (p6t0Var2 instanceof i1b)) ? p6t0Var.equals(p6t0Var2) : Intrinsics.d(p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + brm0.e((this.e.hashCode() + ua80.b(brm0.e(brm0.e(this.f13989a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof i1b) || !(p6t0Var2 instanceof i1b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        i1b i1bVar = (i1b) p6t0Var;
        i1b i1bVar2 = (i1b) p6t0Var2;
        k9x.G(arrayList, new c1b(i1bVar.f13989a), new c1b(i1bVar2.f13989a));
        k9x.G(arrayList, new b1b(i1bVar.d), new b1b(i1bVar2.d));
        k9x.G(arrayList, i1bVar.e, i1bVar2.e);
        k9x.G(arrayList, new e1b(i1bVar.b), new e1b(i1bVar2.b));
        k9x.G(arrayList, new f1b(i1bVar.c), new f1b(i1bVar2.c));
        k9x.G(arrayList, new z0b(i1bVar.f), new z0b(i1bVar2.f));
        k9x.G(arrayList, new a1b(i1bVar.g), new a1b(i1bVar2.g));
        k9x.G(arrayList, new g1b(i1bVar.h), new g1b(i1bVar2.h));
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        String str = "GameType(value=" + this.f13989a + Separators.RPAREN;
        String strD = defpackage.c.d("IsCheckable(value=", Separators.RPAREN, this.b);
        String strD2 = defpackage.c.d("IsChecked(value=", Separators.RPAREN, this.c);
        String strL = kng0.l("GameName(value=", this.d, Separators.RPAREN);
        String strD3 = defpackage.c.d("DemoAvailable(value=", Separators.RPAREN, this.f);
        String str2 = "GameFlag(value=" + this.g + Separators.RPAREN;
        String strL2 = kng0.l("MaxCoef(value=", this.h, Separators.RPAREN);
        StringBuilder sbN = b1j.n("CashbackUiItem(gameType=", str, ", isCheckable=", strD, ", isChecked=");
        f140.v(sbN, strD2, ", gameName=", strL, ", imageUrl=");
        sbN.append(this.e);
        sbN.append(", demoAvailable=");
        sbN.append(strD3);
        sbN.append(", gameFlag=");
        return ua80.m(sbN, str2, ", maxCoef=", strL2, Separators.RPAREN);
    }
}
