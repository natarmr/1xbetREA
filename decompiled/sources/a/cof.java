package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class cof implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4696a;
    public final byte b;
    public final vnf c;
    public final int d;
    public final oqf e;
    public final oqf f;
    public final oqf g;
    public final oqf h;
    public final oqf i;
    public final String j;
    public final boolean k;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public cof(String str, long j, vnf vnfVar, int i, oqf oqfVar, oqf oqfVar2, oqf oqfVar3, oqf oqfVar4, oqf oqfVar5, String str2, boolean z) {
        this.f4696a = str;
        this.b = (int) j;
        this.c = vnfVar;
        this.d = i;
        this.e = oqfVar;
        this.f = oqfVar2;
        this.g = oqfVar3;
        this.h = oqfVar4;
        this.i = oqfVar5;
        this.j = str2;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cof)) {
            return false;
        }
        cof cofVar = (cof) obj;
        return this.f4696a.equals(cofVar.f4696a) && ((long) this.b) == ((long) cofVar.b) && this.c.equals(cofVar.c) && this.d == cofVar.d && this.e.equals(cofVar.e) && this.f.equals(cofVar.f) && this.g.equals(cofVar.g) && this.h.equals(cofVar.h) && this.i.equals(cofVar.i) && this.j.equals(cofVar.j) && this.k == cofVar.k;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof cof) && (p6t0Var2 instanceof cof) && ((long) ((cof) p6t0Var).b) == ((long) ((cof) p6t0Var2).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f4696a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ua80.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + twn.a(this.d, (this.c.hashCode() + rw2.b(this.f4696a.hashCode() * 31, 31, this.b)) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof cof) || !(p6t0Var2 instanceof cof)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cof cofVar = (cof) p6t0Var;
        cof cofVar2 = (cof) p6t0Var2;
        k9x.G(linkedHashSet, cofVar.c, cofVar2.c);
        k9x.G(linkedHashSet, new unf(cofVar.d), new unf(cofVar2.d));
        k9x.G(linkedHashSet, new xnf(cofVar.e), new xnf(cofVar2.e));
        k9x.G(linkedHashSet, new aof(cofVar.f), new aof(cofVar2.f));
        k9x.G(linkedHashSet, new bof(cofVar.g), new bof(cofVar2.g));
        k9x.G(linkedHashSet, new znf(cofVar.h), new znf(cofVar2.h));
        k9x.G(linkedHashSet, new ynf(cofVar.i), new ynf(cofVar2.i));
        k9x.G(linkedHashSet, new wnf(cofVar.j), new wnf(cofVar2.j));
        k9x.G(linkedHashSet, new tnf(cofVar.k), new tnf(cofVar2.k));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        long j = this.b;
        String strE = ua80.e(this.d, "RoleBackground(value=", Separators.RPAREN);
        String str = "WeaponFirstPlayer(value=" + this.e + Separators.RPAREN;
        String str2 = "WeaponSecondPlayer(value=" + this.f + Separators.RPAREN;
        String str3 = "WeaponThirdPlayer(value=" + this.g + Separators.RPAREN;
        String str4 = "WeaponFourPlayer(value=" + this.h + Separators.RPAREN;
        String str5 = "WeaponFivePlayer(value=" + this.i + Separators.RPAREN;
        String strL = kng0.l("TotalCash(value=", this.j, Separators.RPAREN);
        String strD = defpackage.c.d("NeedExtraMargin(value=", Separators.RPAREN, this.k);
        StringBuilder sbO = f140.o(j, "Cs2GameWeaponUiModel(key=", this.f4696a, ", id=");
        sbO.append(", team=");
        sbO.append(this.c);
        sbO.append(", roleBackground=");
        sbO.append(strE);
        f140.v(sbO, ", weaponFirstPlayer=", str, ", weaponSecondPlayer=", str2);
        f140.v(sbO, ", weaponThirdPlayer=", str3, ", weaponFourPlayer=", str4);
        f140.v(sbO, ", weaponFivePlayer=", str5, ", totalCash=", strL);
        return rw2.o(sbO, ", needExtraMargin=", strD, Separators.RPAREN);
    }
}
