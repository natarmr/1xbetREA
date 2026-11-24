package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class orf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f25733a;
    public final ank0 b;
    public final ank0 c;
    public final ank0 d;
    public final ank0 e;
    public final ank0 f;
    public final ank0 g;

    public orf(ank0 ank0Var, ank0 ank0Var2, ank0 ank0Var3, ank0 ank0Var4, ank0 ank0Var5, ank0 ank0Var6, ank0 ank0Var7) {
        this.f25733a = ank0Var;
        this.b = ank0Var2;
        this.c = ank0Var3;
        this.d = ank0Var4;
        this.e = ank0Var5;
        this.f = ank0Var6;
        this.g = ank0Var7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orf)) {
            return false;
        }
        orf orfVar = (orf) obj;
        return this.f25733a.equals(orfVar.f25733a) && this.b.equals(orfVar.b) && this.c.equals(orfVar.c) && this.d.equals(orfVar.d) && this.e.equals(orfVar.e) && this.f.equals(orfVar.f) && this.g.equals(orfVar.g);
    }

    public final int hashCode() {
        return this.g.f1159a.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(this.f25733a.f1159a.hashCode() * 31, 31, this.b.f1159a), 31, this.c.f1159a), 31, this.d.f1159a), 31, this.e.f1159a), 31, this.f.f1159a);
    }

    public final String toString() {
        return "Cs2StatisticPlayerUiModel(playerName=" + this.f25733a + ", hp=" + this.b + ", money=" + this.c + ", kills=" + this.d + ", assist=" + this.e + ", dead=" + this.f + ", adr=" + this.g + Separators.RPAREN;
    }
}
