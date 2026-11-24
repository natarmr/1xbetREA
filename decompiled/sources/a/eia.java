package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class eia implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gha f7848a;
    public final cia b;
    public final mha c;
    public final mha d;
    public final sha e;

    public eia(gha ghaVar, cia ciaVar, mha mhaVar, mha mhaVar2, sha shaVar) {
        this.f7848a = ghaVar;
        this.b = ciaVar;
        this.c = mhaVar;
        this.d = mhaVar2;
        this.e = shaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eia)) {
            return false;
        }
        eia eiaVar = (eia) obj;
        return this.f7848a.equals(eiaVar.f7848a) && this.b.equals(eiaVar.b) && this.c.equals(eiaVar.c) && this.d.equals(eiaVar.d) && this.e.equals(eiaVar.e);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof eia) && (p6t0Var2 instanceof eia);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CARD_FOOTBALL_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.f7848a.hashCode() + 1697220676) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof eia) || !(p6t0Var2 instanceof eia)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        eia eiaVar = (eia) p6t0Var;
        eia eiaVar2 = (eia) p6t0Var2;
        k9x.G(linkedHashSet, new yha(eiaVar.f7848a), new yha(eiaVar2.f7848a));
        k9x.G(linkedHashSet, eiaVar.b, eiaVar2.b);
        k9x.G(linkedHashSet, new zha(eiaVar.c), new zha(eiaVar2.c));
        k9x.G(linkedHashSet, new aia(eiaVar.d), new aia(eiaVar2.d));
        k9x.G(linkedHashSet, new bia(eiaVar.e), new bia(eiaVar2.e));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String str = "Attack(value=" + this.f7848a + Separators.RPAREN;
        String str2 = "FirstPeriod(value=" + this.c + Separators.RPAREN;
        String str3 = "SecondPeriod(value=" + this.d + Separators.RPAREN;
        String str4 = "Status(value=" + this.e + Separators.RPAREN;
        StringBuilder sb = new StringBuilder("CardFootballUiModel(key=CARD_FOOTBALL_KEY, attack=");
        sb.append(str);
        sb.append(", teamDefenders=");
        sb.append(this.b);
        sb.append(", firstPeriod=");
        f140.v(sb, str2, ", secondPeriod=", str3, ", status=");
        return axq.n(sb, str4, Separators.RPAREN);
    }
}
