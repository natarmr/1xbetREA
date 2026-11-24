package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class xkf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41026a;
    public final String b;
    public final String c;
    public final tkf d;
    public final wkf e;
    public final boolean f;
    public final int g;

    public xkf(String str, String str2, String str3, tkf tkfVar, wkf wkfVar, boolean z, int i) {
        this.f41026a = str;
        this.b = str2;
        this.c = str3;
        this.d = tkfVar;
        this.e = wkfVar;
        this.f = z;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkf)) {
            return false;
        }
        xkf xkfVar = (xkf) obj;
        return this.f41026a.equals(xkfVar.f41026a) && this.b.equals(xkfVar.b) && this.c.equals(xkfVar.c) && this.d.equals(xkfVar.d) && this.e.equals(xkfVar.e) && this.f == xkfVar.f && this.g == xkfVar.g;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof xkf) && (p6t0Var2 instanceof xkf);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f41026a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + brm0.e((this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(rw2.b(this.f41026a.hashCode() * 31, 31, 11L), 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof xkf) || !(p6t0Var2 instanceof xkf)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xkf xkfVar = (xkf) p6t0Var;
        xkf xkfVar2 = (xkf) p6t0Var2;
        k9x.G(linkedHashSet, new vkf(xkfVar.b), new vkf(xkfVar2.b));
        k9x.G(linkedHashSet, new ukf(xkfVar.c), new ukf(xkfVar2.c));
        k9x.G(linkedHashSet, xkfVar.d, xkfVar2.d);
        k9x.G(linkedHashSet, xkfVar.e, xkfVar2.e);
        k9x.G(linkedHashSet, new skf(xkfVar.f), new skf(xkfVar2.f));
        k9x.G(linkedHashSet, new rkf(xkfVar.g), new rkf(xkfVar2.g));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("MapName(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("MapBackground(value=", this.c, Separators.RPAREN);
        String strD = defpackage.c.d("DeciderMap(value=", Separators.RPAREN, this.f);
        String strE = ua80.e(this.g, "Background(value=", Separators.RPAREN);
        StringBuilder sbN = b1j.n("Cs2GameBanPickUiModel(key=", this.f41026a, ", id=11, mapName=", strL, ", mapBackground=");
        sbN.append(strL2);
        sbN.append(", firstTeam=");
        sbN.append(this.d);
        sbN.append(", secondTeam=");
        sbN.append(this.e);
        sbN.append(", deciderMap=");
        sbN.append(strD);
        sbN.append(", background=");
        return axq.n(sbN, strE, Separators.RPAREN);
    }
}
