package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class hnf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13349a;
    public final byte b;
    public final enf c;
    public final srf d;
    public final srf e;
    public final srf f;
    public final srf g;
    public final srf h;
    public final int i;
    public final String j;
    public final boolean k;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public hnf(String str, long j, enf enfVar, srf srfVar, srf srfVar2, srf srfVar3, srf srfVar4, srf srfVar5, int i, String str2, boolean z) {
        this.f13349a = str;
        this.b = (int) j;
        this.c = enfVar;
        this.d = srfVar;
        this.e = srfVar2;
        this.f = srfVar3;
        this.g = srfVar4;
        this.h = srfVar5;
        this.i = i;
        this.j = str2;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnf)) {
            return false;
        }
        hnf hnfVar = (hnf) obj;
        return this.f13349a.equals(hnfVar.f13349a) && ((long) this.b) == ((long) hnfVar.b) && this.c.equals(hnfVar.c) && this.d.equals(hnfVar.d) && this.e.equals(hnfVar.e) && this.f.equals(hnfVar.f) && this.g.equals(hnfVar.g) && this.h.equals(hnfVar.h) && this.i == hnfVar.i && this.j.equals(hnfVar.j) && this.k == hnfVar.k;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof hnf) && (p6t0Var2 instanceof hnf) && ((long) ((hnf) p6t0Var).b) == ((long) ((hnf) p6t0Var2).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f13349a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ua80.b(twn.a(this.i, (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f13349a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.j);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof hnf) || !(p6t0Var2 instanceof hnf)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        hnf hnfVar = (hnf) p6t0Var;
        hnf hnfVar2 = (hnf) p6t0Var2;
        k9x.G(linkedHashSet, hnfVar.c, hnfVar2.c);
        k9x.G(linkedHashSet, new ymf(hnfVar.d), new ymf(hnfVar2.d));
        k9x.G(linkedHashSet, new dnf(hnfVar.e), new dnf(hnfVar2.e));
        k9x.G(linkedHashSet, new fnf(hnfVar.f), new fnf(hnfVar2.f));
        k9x.G(linkedHashSet, new anf(hnfVar.g), new anf(hnfVar2.g));
        k9x.G(linkedHashSet, new zmf(hnfVar.h), new zmf(hnfVar2.h));
        k9x.G(linkedHashSet, new cnf(hnfVar.i), new cnf(hnfVar2.i));
        k9x.G(linkedHashSet, new gnf(hnfVar.j), new gnf(hnfVar2.j));
        k9x.G(linkedHashSet, new bnf(hnfVar.k), new bnf(hnfVar2.k));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        long j = this.b;
        String str = "FirstPlayer(value=" + this.d + Separators.RPAREN;
        String str2 = "SecondPlayer(value=" + this.e + Separators.RPAREN;
        String str3 = "ThirdPlayer(value=" + this.f + Separators.RPAREN;
        String str4 = "FourthPlayer(value=" + this.g + Separators.RPAREN;
        String str5 = "FivePlayer(value=" + this.h + Separators.RPAREN;
        String strE = ua80.e(this.i, "RoleBackground(value=", Separators.RPAREN);
        String strL = kng0.l("TotalCash(value=", this.j, Separators.RPAREN);
        String strD = defpackage.c.d("NeedExtraMargin(value=", Separators.RPAREN, this.k);
        StringBuilder sbO = f140.o(j, "Cs2GameStatisticTabletUiModel(key=", this.f13349a, ", id=");
        sbO.append(", team=");
        sbO.append(this.c);
        sbO.append(", firstPlayer=");
        sbO.append(str);
        f140.v(sbO, ", secondPlayer=", str2, ", thirdPlayer=", str3);
        f140.v(sbO, ", fourthPlayer=", str4, ", fivePlayer=", str5);
        f140.v(sbO, ", roleBackground=", strE, ", totalCash=", strL);
        return rw2.o(sbO, ", needExtraMargin=", strD, Separators.RPAREN);
    }
}
