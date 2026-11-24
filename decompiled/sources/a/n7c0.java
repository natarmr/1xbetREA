package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class n7c0 implements k7c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23035a;
    public final o0x b;

    public n7c0(ArrayList arrayList) {
        m0x m0xVarY = j0x.y(true);
        this.f23035a = arrayList;
        this.b = m0xVarY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7c0)) {
            return false;
        }
        n7c0 n7c0Var = (n7c0) obj;
        return this.f23035a.equals(n7c0Var.f23035a) && this.b.equals(n7c0Var.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23035a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof n7c0) || !(p6t0Var2 instanceof n7c0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k9x.G(linkedHashSet, new m7c0(((n7c0) p6t0Var).f23035a), new m7c0(((n7c0) p6t0Var2).f23035a));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return "PromoBonusGamesUiItem(gameList=" + hne.o("GameList(value=", Separators.RPAREN, this.f23035a) + ", placeholder=" + this.b + Separators.RPAREN;
    }
}
