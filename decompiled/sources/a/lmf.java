package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class lmf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20293a;
    public final byte b;
    public final jmf c;
    public final orf d;
    public final orf e;
    public final orf f;
    public final orf g;
    public final orf h;
    public final int i;
    public final boolean j;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public lmf(String str, long j, jmf jmfVar, orf orfVar, orf orfVar2, orf orfVar3, orf orfVar4, orf orfVar5, int i, boolean z) {
        this.f20293a = str;
        this.b = (int) j;
        this.c = jmfVar;
        this.d = orfVar;
        this.e = orfVar2;
        this.f = orfVar3;
        this.g = orfVar4;
        this.h = orfVar5;
        this.i = i;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmf)) {
            return false;
        }
        lmf lmfVar = (lmf) obj;
        return this.f20293a.equals(lmfVar.f20293a) && ((long) this.b) == ((long) lmfVar.b) && this.c.equals(lmfVar.c) && this.d.equals(lmfVar.d) && this.e.equals(lmfVar.e) && this.f.equals(lmfVar.f) && this.g.equals(lmfVar.g) && this.h.equals(lmfVar.h) && this.i == lmfVar.i && this.j == lmfVar.j;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof lmf) && (p6t0Var2 instanceof lmf) && ((long) ((lmf) p6t0Var).b) == ((long) ((lmf) p6t0Var2).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f20293a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + twn.a(this.i, (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f20293a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof lmf) || !(p6t0Var2 instanceof lmf)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lmf lmfVar = (lmf) p6t0Var;
        lmf lmfVar2 = (lmf) p6t0Var2;
        k9x.G(linkedHashSet, lmfVar.c, lmfVar2.c);
        k9x.G(linkedHashSet, new emf(lmfVar.d), new emf(lmfVar2.d));
        k9x.G(linkedHashSet, new imf(lmfVar.e), new imf(lmfVar2.e));
        k9x.G(linkedHashSet, new kmf(lmfVar.f), new kmf(lmfVar2.f));
        k9x.G(linkedHashSet, new gmf(lmfVar.g), new gmf(lmfVar2.g));
        k9x.G(linkedHashSet, new fmf(lmfVar.h), new fmf(lmfVar2.h));
        k9x.G(linkedHashSet, new hmf(lmfVar.j), new hmf(lmfVar2.j));
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
        String strD = defpackage.c.d("NeedExtraMargin(value=", Separators.RPAREN, this.j);
        StringBuilder sbO = f140.o(j, "Cs2GamePlayerStatisticUiModel(key=", this.f20293a, ", id=");
        sbO.append(", team=");
        sbO.append(this.c);
        sbO.append(", firstPlayer=");
        sbO.append(str);
        f140.v(sbO, ", secondPlayer=", str2, ", thirdPlayer=", str3);
        f140.v(sbO, ", fourthPlayer=", str4, ", fivePlayer=", str5);
        f140.v(sbO, ", roleBackground=", strE, ", needExtraMargin=", strD);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
