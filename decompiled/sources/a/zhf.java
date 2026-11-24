package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zhf implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44390a;
    public final shf b;
    public final kff c;
    public final String d;
    public final thf e;
    public final vhf f;
    public final phf g;
    public final String h;
    public final String i;
    public final igg0 j;
    public final boolean k;

    public zhf(long j, shf shfVar, kff kffVar, String str, thf thfVar, vhf vhfVar, phf phfVar, String str2, String str3, igg0 igg0Var, boolean z) {
        this.f44390a = j;
        this.b = shfVar;
        this.c = kffVar;
        this.d = str;
        this.e = thfVar;
        this.f = vhfVar;
        this.g = phfVar;
        this.h = str2;
        this.i = str3;
        this.j = igg0Var;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhf)) {
            return false;
        }
        zhf zhfVar = (zhf) obj;
        return this.f44390a == zhfVar.f44390a && this.b.equals(zhfVar.b) && this.c.equals(zhfVar.c) && this.d.equals(zhfVar.d) && this.e.equals(zhfVar.e) && this.f.equals(zhfVar.f) && this.g.equals(zhfVar.g) && this.h.equals(zhfVar.h) && this.i.equals(zhfVar.i) && this.j == zhfVar.j && this.k == zhfVar.k;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof zhf) && (p6t0Var2 instanceof zhf) && ((zhf) p6t0Var).f44390a == ((zhf) p6t0Var2).f44390a;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CRYSTAL_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ua80.b(ua80.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + rw2.b(-1075983062, 31, this.f44390a)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31, 31, this.h), 31, this.i)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof zhf) || !(p6t0Var2 instanceof zhf)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zhf zhfVar = (zhf) p6t0Var;
        zhf zhfVar2 = (zhf) p6t0Var2;
        k9x.G(linkedHashSet, zhfVar.b, zhfVar2.b);
        k9x.G(linkedHashSet, new rhf(zhfVar.c), new rhf(zhfVar2.c));
        k9x.G(linkedHashSet, new qhf(zhfVar.d), new qhf(zhfVar2.d));
        k9x.G(linkedHashSet, zhfVar.e, zhfVar2.e);
        k9x.G(linkedHashSet, zhfVar.f, zhfVar2.f);
        k9x.G(linkedHashSet, zhfVar.g, zhfVar2.g);
        k9x.G(linkedHashSet, new uhf(zhfVar.h), new uhf(zhfVar2.h));
        k9x.G(linkedHashSet, new whf(zhfVar.i), new whf(zhfVar2.i));
        k9x.G(linkedHashSet, new xhf(zhfVar.j), new xhf(zhfVar2.j));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String str = "GameState(value=" + this.c + Separators.RPAREN;
        String strL = kng0.l("FieldDescription(value=", this.d, Separators.RPAREN);
        String strL2 = kng0.l("PlayerOneResult(value=", this.h, Separators.RPAREN);
        String strL3 = kng0.l("PlayerTwoResult(value=", this.i, Separators.RPAREN);
        String str2 = "RoundState(value=" + this.j + Separators.RPAREN;
        StringBuilder sb = new StringBuilder("CrystalUiModel(key=CRYSTAL_KEY, gameId=");
        sb.append(this.f44390a);
        sb.append(", gameText=");
        sb.append(this.b);
        f140.v(sb, ", gameState=", str, ", fieldDescription=", strL);
        sb.append(", playerOneInfo=");
        sb.append(this.e);
        sb.append(", playerTwoInfo=");
        sb.append(this.f);
        sb.append(", countdownTime=");
        sb.append(this.g);
        sb.append(", playerOneResult=");
        sb.append(strL2);
        f140.v(sb, ", playerTwoResult=", strL3, ", roundState=", str2);
        return f140.n(sb, ", supportRtl=", this.k, Separators.RPAREN);
    }
}
