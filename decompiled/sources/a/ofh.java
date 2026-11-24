package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ofh implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25169a;
    public final ArrayList b;
    public final List c;

    public ofh(int i, ArrayList arrayList, List list) {
        this.f25169a = i;
        this.b = arrayList;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofh)) {
            return false;
        }
        ofh ofhVar = (ofh) obj;
        return this.f25169a == ofhVar.f25169a && this.b.equals(ofhVar.b) && this.c.equals(ofhVar.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof ofh) && (p6t0Var2 instanceof ofh) && ((ofh) p6t0Var).f25169a == ((ofh) p6t0Var2).f25169a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, Integer.hashCode(this.f25169a) * 31, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof ofh) || !(p6t0Var2 instanceof ofh)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ofh ofhVar = (ofh) p6t0Var;
        ofh ofhVar2 = (ofh) p6t0Var2;
        k9x.G(linkedHashSet, new lfh(ofhVar.b), new lfh(ofhVar2.b));
        k9x.G(linkedHashSet, new mfh(ofhVar.c), new mfh(ofhVar2.c));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strO = hne.o("Headers(value=", Separators.RPAREN, this.b);
        return axq.n(vqd.r(this.f25169a, "CyberStageUiModel(id=", ", headers=", strO, ", teams="), twn.r(this.c, "Teams(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
