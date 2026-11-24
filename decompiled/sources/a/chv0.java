package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class chv0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4380a;
    public final String b;
    public final String c;
    public final ank0 d;
    public final ank0 e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;

    public chv0(String str, String str2, String str3, ank0 ank0Var, ank0 ank0Var2, String str4, String str5, int i, boolean z) {
        this.f4380a = str;
        this.b = str2;
        this.c = str3;
        this.d = ank0Var;
        this.e = ank0Var2;
        this.f = str4;
        this.g = str5;
        this.h = i;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chv0)) {
            return false;
        }
        chv0 chv0Var = (chv0) obj;
        return this.f4380a.equals(chv0Var.f4380a) && this.b.equals(chv0Var.b) && this.c.equals(chv0Var.c) && this.d.equals(chv0Var.d) && this.e.equals(chv0Var.e) && this.f.equals(chv0Var.f) && this.g.equals(chv0Var.g) && this.h == chv0Var.h && this.i == chv0Var.i;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof chv0) && (p6t0Var2 instanceof chv0);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f4380a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + twn.a(R.drawable.cs2_map_statistic_item_bg, twn.a(this.h, ua80.b(ua80.b(dw9.a(dw9.a(ua80.b(ua80.b(rw2.b(this.f4380a.hashCode() * 31, 31, 10L), 31, this.b), 31, this.c), 31, this.d.f1159a), 31, this.e.f1159a), 31, this.f), 31, this.g), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof chv0) || !(p6t0Var2 instanceof chv0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        chv0 chv0Var = (chv0) p6t0Var;
        chv0 chv0Var2 = (chv0) p6t0Var2;
        k9x.G(linkedHashSet, new zgv0(chv0Var.b), new zgv0(chv0Var2.b));
        k9x.G(linkedHashSet, new ygv0(chv0Var.c), new ygv0(chv0Var2.c));
        k9x.G(linkedHashSet, new xgv0(chv0Var.d), new xgv0(chv0Var2.d));
        k9x.G(linkedHashSet, new bhv0(chv0Var.e), new bhv0(chv0Var2.e));
        k9x.G(linkedHashSet, new wgv0(chv0Var.f), new wgv0(chv0Var2.f));
        k9x.G(linkedHashSet, new ahv0(chv0Var.g), new ahv0(chv0Var2.g));
        k9x.G(linkedHashSet, new vgv0(chv0Var.h), new vgv0(chv0Var2.h));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("MapName(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("MapBackground(value=", this.c, Separators.RPAREN);
        String strP = w6x.p("FirstTeamWinRate(value=", this.d, Separators.RPAREN);
        String strP2 = w6x.p("SecondTeamWinRate(value=", this.e, Separators.RPAREN);
        String strL3 = kng0.l("FirstTeamMapsCount(value=", this.f, Separators.RPAREN);
        String strL4 = kng0.l("SecondTeamMapsCount(value=", this.g, Separators.RPAREN);
        String strE = ua80.e(this.h, "Background(value=", Separators.RPAREN);
        StringBuilder sbN = b1j.n("WinRateUiModel(key=", this.f4380a, ", id=10, mapName=", strL, ", mapBackground=");
        f140.v(sbN, strL2, ", firstTeamWinRate=", strP, ", secondTeamWinRate=");
        f140.v(sbN, strP2, ", firstTeamMapsCount=", strL3, ", secondTeamMapsCount=");
        f140.v(sbN, strL4, ", background=", strE, ", placeholder=");
        return ohs0.k(R.drawable.cs2_map_statistic_item_bg, ", supportRtl=", Separators.RPAREN, sbN, this.i);
    }
}
