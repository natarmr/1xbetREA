package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class srf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f32673a;
    public final ank0 b;
    public final ank0 c;
    public final ank0 d;
    public final ank0 e;
    public final ank0 f;
    public final ank0 g;
    public final oqf h;

    public srf(ank0 ank0Var, ank0 ank0Var2, ank0 ank0Var3, ank0 ank0Var4, ank0 ank0Var5, ank0 ank0Var6, ank0 ank0Var7, oqf oqfVar) {
        this.f32673a = ank0Var;
        this.b = ank0Var2;
        this.c = ank0Var3;
        this.d = ank0Var4;
        this.e = ank0Var5;
        this.f = ank0Var6;
        this.g = ank0Var7;
        this.h = oqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srf)) {
            return false;
        }
        srf srfVar = (srf) obj;
        return this.f32673a.equals(srfVar.f32673a) && this.b.equals(srfVar.b) && this.c.equals(srfVar.c) && this.d.equals(srfVar.d) && this.e.equals(srfVar.e) && this.f.equals(srfVar.f) && this.g.equals(srfVar.g) && this.h.equals(srfVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(this.f32673a.f1159a.hashCode() * 31, 31, this.b.f1159a), 31, this.c.f1159a), 31, this.d.f1159a), 31, this.e.f1159a), 31, this.f.f1159a), 31, this.g.f1159a);
    }

    public final String toString() {
        return "Cs2StatisticTabletPlayerUiModel(playerName=" + this.f32673a + ", hp=" + this.b + ", money=" + this.c + ", kills=" + this.d + ", assist=" + this.e + ", dead=" + this.f + ", adr=" + this.g + ", weapon=" + this.h + Separators.RPAREN;
    }
}
