package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class lal implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19710a;
    public final y4l b;
    public final y4l c;

    public lal(long j, y4l y4lVar, y4l y4lVar2) {
        this.f19710a = j;
        this.b = y4lVar;
        this.c = y4lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lal)) {
            return false;
        }
        lal lalVar = (lal) obj;
        return this.f19710a == lalVar.f19710a && this.b.equals(lalVar.b) && this.c.equals(lalVar.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof lal) && (p6t0Var2 instanceof lal) && ((lal) p6t0Var).f19710a == ((lal) p6t0Var2).f19710a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f19710a) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof lal) || !(p6t0Var2 instanceof lal)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lal lalVar = (lal) p6t0Var;
        lal lalVar2 = (lal) p6t0Var2;
        k9x.G(linkedHashSet, new jal(lalVar.b), new jal(lalVar2.b));
        k9x.G(linkedHashSet, new kal(lalVar.c), new kal(lalVar2.c));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return rw2.o(axq.o(this.f19710a, "DotaTeamsUiModel(id=", ", firstTeam=", "FirstTeam(value=" + this.b + Separators.RPAREN), ", secondTeam=", "SecondTeam(value=" + this.c + Separators.RPAREN, Separators.RPAREN);
    }
}
