package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class t9l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33569a;
    public final q9l b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public t9l(long j, q9l q9lVar, String str, String str2, String str3, int i) {
        this.f33569a = j;
        this.b = q9lVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9l)) {
            return false;
        }
        t9l t9lVar = (t9l) obj;
        return this.f33569a == t9lVar.f33569a && this.b.equals(t9lVar.b) && this.c.equals(t9lVar.c) && this.d.equals(t9lVar.d) && this.e.equals(t9lVar.e) && this.f == t9lVar.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof t9l) && (p6t0Var2 instanceof t9l) && ((t9l) p6t0Var).f33569a == ((t9l) p6t0Var2).f33569a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (Long.hashCode(this.f33569a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof t9l) || !(p6t0Var2 instanceof t9l)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        t9l t9lVar = (t9l) p6t0Var;
        t9l t9lVar2 = (t9l) p6t0Var2;
        k9x.G(arrayList, t9lVar.b, t9lVar2.b);
        k9x.G(arrayList, new p9l(t9lVar.c), new p9l(t9lVar2.c));
        k9x.G(arrayList, new o9l(t9lVar.d), new o9l(t9lVar2.d));
        k9x.G(arrayList, new r9l(t9lVar.e), new r9l(t9lVar2.e));
        k9x.G(arrayList, new n9l(t9lVar.f), new n9l(t9lVar2.f));
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        String strL = kng0.l("Date(value=", this.c, Separators.RPAREN);
        String strL2 = kng0.l("Champ(value=", this.d, Separators.RPAREN);
        String strL3 = kng0.l("Time(value=", this.e, Separators.RPAREN);
        String strE = ua80.e(this.f, "Background(value=", Separators.RPAREN);
        StringBuilder sb = new StringBuilder("DotaStatisticFutureGameItemUiModel(id=");
        sb.append(this.f33569a);
        sb.append(", team=");
        sb.append(this.b);
        f140.v(sb, ", date=", strL, ", champ=", strL2);
        f140.v(sb, ", time=", strL3, ", background=", strE);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
