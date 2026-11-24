package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class v2l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36689a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final s2l e;

    public v2l(long j, String str, String str2, ArrayList arrayList, s2l s2lVar) {
        this.f36689a = j;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = s2lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2l)) {
            return false;
        }
        v2l v2lVar = (v2l) obj;
        return this.f36689a == v2lVar.f36689a && this.b.equals(v2lVar.b) && this.c.equals(v2lVar.c) && this.d.equals(v2lVar.d) && this.e.equals(v2lVar.e);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof v2l) && (p6t0Var2 instanceof v2l) && ((v2l) p6t0Var).f36689a == ((v2l) p6t0Var2).f36689a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.g(this.d, ua80.b(ua80.b(Long.hashCode(this.f36689a) * 31, 31, this.b), 31, this.c), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof v2l) || !(p6t0Var2 instanceof v2l)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        v2l v2lVar = (v2l) p6t0Var;
        v2l v2lVar2 = (v2l) p6t0Var2;
        k9x.G(linkedHashSet, new q2l(v2lVar.b), new q2l(v2lVar2.b));
        k9x.G(linkedHashSet, new t2l(v2lVar.c), new t2l(v2lVar2.c));
        k9x.G(linkedHashSet, new r2l(v2lVar.d), new r2l(v2lVar2.d));
        k9x.G(linkedHashSet, v2lVar.e, v2lVar2.e);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("FirstTeamImage(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("SecondTeamImage(value=", this.c, Separators.RPAREN);
        String strO = hne.o("HeroPick(value=", Separators.RPAREN, this.d);
        StringBuilder sbO = axq.o(this.f36689a, "DotaBanPickUiModel(id=", ", firstTeamImage=", strL);
        f140.v(sbO, ", secondTeamImage=", strL2, ", heroPick=", strO);
        sbO.append(", scrollPosition=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
