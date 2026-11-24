package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class y4l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42007a;
    public final String b;
    public final ArrayList c;

    public y4l(long j, String str, ArrayList arrayList) {
        this.f42007a = j;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4l)) {
            return false;
        }
        y4l y4lVar = (y4l) obj;
        return this.f42007a == y4lVar.f42007a && this.b.equals(y4lVar.b) && this.c.equals(y4lVar.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof y4l) && (p6t0Var2 instanceof y4l) && ((y4l) p6t0Var).f42007a == ((y4l) p6t0Var2).f42007a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f42007a) * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof y4l) || !(p6t0Var2 instanceof y4l)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        y4l y4lVar = (y4l) p6t0Var;
        y4l y4lVar2 = (y4l) p6t0Var2;
        k9x.G(linkedHashSet, new x4l(y4lVar.b), new x4l(y4lVar2.b));
        k9x.G(linkedHashSet, new w4l(y4lVar.c), new w4l(y4lVar2.c));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("TeamLogo(value=", this.b, Separators.RPAREN);
        return rw2.o(axq.o(this.f42007a, "DotaHeroesOfTeamUiModel(teamId=", ", teamLogo=", strL), ", selectedHeroes=", hne.o("SelectedHeroes(value=", Separators.RPAREN, this.c), Separators.RPAREN);
    }
}
