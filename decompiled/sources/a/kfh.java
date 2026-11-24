package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class kfh implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18195a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public kfh(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f18195a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfh)) {
            return false;
        }
        kfh kfhVar = (kfh) obj;
        return this.f18195a.equals(kfhVar.f18195a) && this.b.equals(kfhVar.b) && this.c.equals(kfhVar.c) && this.d.equals(kfhVar.d) && this.e.equals(kfhVar.e);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof kfh) && (p6t0Var2 instanceof kfh)) {
            return ((kfh) p6t0Var).f18195a.equals(((kfh) p6t0Var2).f18195a);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f18195a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof kfh) || !(p6t0Var2 instanceof kfh)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kfh kfhVar = (kfh) p6t0Var;
        kfh kfhVar2 = (kfh) p6t0Var2;
        k9x.G(linkedHashSet, new ifh(kfhVar.b), new ifh(kfhVar2.b));
        k9x.G(linkedHashSet, new gfh(kfhVar.c), new gfh(kfhVar2.c));
        k9x.G(linkedHashSet, new hfh(kfhVar.d), new hfh(kfhVar2.d));
        k9x.G(linkedHashSet, new jfh(kfhVar.e), new jfh(kfhVar2.e));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Number(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("Image(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("Name(value=", this.d, Separators.RPAREN);
        String strO = hne.o("Statistics(value=", Separators.RPAREN, this.e);
        StringBuilder sbN = b1j.n("CyberStageTeamItemUiModel(id=", this.f18195a, ", number=", strL, ", image=");
        f140.v(sbN, strL2, ", name=", strL3, ", statistics=");
        return axq.n(sbN, strO, Separators.RPAREN);
    }
}
