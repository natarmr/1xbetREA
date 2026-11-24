package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class w5g implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38582a;
    public final l7g b;
    public final String c;
    public final r5g d;
    public final String e;
    public final ArrayList f;
    public final String g;
    public final int h;

    public w5g(long j, l7g l7gVar, String str, r5g r5gVar, String str2, ArrayList arrayList, String str3, int i) {
        this.f38582a = j;
        this.b = l7gVar;
        this.c = str;
        this.d = r5gVar;
        this.e = str2;
        this.f = arrayList;
        this.g = str3;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5g)) {
            return false;
        }
        w5g w5gVar = (w5g) obj;
        return this.f38582a == w5gVar.f38582a && this.b.equals(w5gVar.b) && this.c.equals(w5gVar.c) && this.d.equals(w5gVar.d) && this.e.equals(w5gVar.e) && this.f.equals(w5gVar.f) && this.g.equals(w5gVar.g) && this.h == w5gVar.h;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof w5g) && (p6t0Var2 instanceof w5g)) {
            return ((w5g) p6t0Var).c.equals(((w5g) p6t0Var2).c);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + ua80.b(twn.g(this.f, ua80.b((this.d.hashCode() + ua80.b((this.b.hashCode() + (Long.hashCode(this.f38582a) * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31), 31, this.g);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof w5g) || !(p6t0Var2 instanceof w5g)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        w5g w5gVar = (w5g) p6t0Var;
        w5g w5gVar2 = (w5g) p6t0Var2;
        k9x.G(arrayList, new u5g(w5gVar.c), new u5g(w5gVar2.c));
        k9x.G(arrayList, w5gVar.d, w5gVar2.d);
        k9x.G(arrayList, new q5g(w5gVar.e), new q5g(w5gVar2.e));
        k9x.G(arrayList, new s5g(w5gVar.f), new s5g(w5gVar2.f));
        k9x.G(arrayList, new t5g(w5gVar.g), new t5g(w5gVar2.g));
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        String strL = kng0.l("Title(value=", this.c, Separators.RPAREN);
        String strL2 = kng0.l("Date(value=", this.e, Separators.RPAREN);
        String strO = hne.o("Teams(value=", Separators.RPAREN, this.f);
        String strL3 = kng0.l("TeamsSize(value=", this.g, Separators.RPAREN);
        String strE = ua80.e(this.h, "AdditionalBottomMargin(value=", Separators.RPAREN);
        StringBuilder sb = new StringBuilder("CyberCalendarDayItemUiModel(globalId=");
        sb.append(this.f38582a);
        sb.append(", eventInfoUiModel=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(strL);
        sb.append(", disciplineImage=");
        sb.append(this.d);
        f140.v(sb, ", date=", strL2, ", teams=", strO);
        f140.v(sb, ", teamsSize=", strL3, ", additionalBottomMargin=", strE);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
