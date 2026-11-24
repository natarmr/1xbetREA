package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class gsz implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csz f11855a;
    public final boolean b;

    public gsz(csz cszVar, boolean z) {
        this.f11855a = cszVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsz)) {
            return false;
        }
        gsz gszVar = (gsz) obj;
        return this.f11855a.equals(gszVar.f11855a) && this.b == gszVar.b;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof gsz) && (p6t0Var2 instanceof gsz)) {
            return ((gsz) p6t0Var).f11855a.equals(((gsz) p6t0Var2).f11855a);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f11855a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof gsz) || !(p6t0Var2 instanceof gsz)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        gsz gszVar = (gsz) p6t0Var;
        gsz gszVar2 = (gsz) p6t0Var2;
        k9x.G(linkedHashSet, new esz(gszVar.f11855a), new esz(gszVar2.f11855a));
        k9x.G(linkedHashSet, new dsz(gszVar.b), new dsz(gszVar2.b));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return b1j.k("LimitUiModel(limitEnum=", "Enum(value=" + this.f11855a + Separators.RPAREN, ", chosen=", defpackage.c.d("Chosen(value=", Separators.RPAREN, this.b), Separators.RPAREN);
    }
}
