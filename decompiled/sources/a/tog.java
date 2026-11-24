package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class tog implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oog f34281a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public tog(oog oogVar, String str, String str2, String str3, int i) {
        this.f34281a = oogVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tog)) {
            return false;
        }
        tog togVar = (tog) obj;
        return this.f34281a.equals(togVar.f34281a) && this.b.equals(togVar.b) && this.c.equals(togVar.c) && this.d.equals(togVar.d) && this.e == togVar.e;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof tog) && (p6t0Var2 instanceof tog);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ua80.b(ua80.b(ua80.b((this.f34281a.hashCode() + (Long.hashCode(1L) * 31)) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof tog) || !(p6t0Var2 instanceof tog)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        tog togVar = (tog) p6t0Var;
        tog togVar2 = (tog) p6t0Var2;
        k9x.G(arrayList, togVar.f34281a, togVar2.f34281a);
        k9x.G(arrayList, new rog(togVar.b), new rog(togVar2.b));
        k9x.G(arrayList, new pog(togVar.c), new pog(togVar2.c));
        k9x.G(arrayList, new qog(togVar.d), new qog(togVar2.d));
        k9x.G(arrayList, new nog(togVar.e), new nog(togVar2.e));
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        String strL = kng0.l("TournamentTitle(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("TournamentDate(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("TournamentTime(value=", this.d, Separators.RPAREN);
        String strE = ua80.e(this.e, "Background(value=", Separators.RPAREN);
        StringBuilder sb = new StringBuilder("CyberFutureGameUiModel(id=1, team=");
        sb.append(this.f34281a);
        sb.append(", tournamentTitle=");
        sb.append(strL);
        sb.append(", tournamentDate=");
        f140.v(sb, strL2, ", tournamentTime=", strL3, ", background=");
        return axq.n(sb, strE, Separators.RPAREN);
    }
}
