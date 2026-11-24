package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e8l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8l f7378a;
    public final t7l b;
    public final ArrayList c;
    public final ArrayList d;
    public final z7l e;
    public final r7l f;
    public final c8l g;
    public final u7l h;
    public final y7l i;
    public final q7l j;
    public final d8l k;
    public final x7l l;
    public final List m;
    public final ArrayList n;

    public e8l(b8l b8lVar, t7l t7lVar, ArrayList arrayList, ArrayList arrayList2, z7l z7lVar, r7l r7lVar, c8l c8lVar, u7l u7lVar, y7l y7lVar, q7l q7lVar, d8l d8lVar, x7l x7lVar, List list, ArrayList arrayList3) {
        this.f7378a = b8lVar;
        this.b = t7lVar;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = z7lVar;
        this.f = r7lVar;
        this.g = c8lVar;
        this.h = u7lVar;
        this.i = y7lVar;
        this.j = q7lVar;
        this.k = d8lVar;
        this.l = x7lVar;
        this.m = list;
        this.n = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8l)) {
            return false;
        }
        e8l e8lVar = (e8l) obj;
        return this.f7378a.equals(e8lVar.f7378a) && this.b.equals(e8lVar.b) && this.c.equals(e8lVar.c) && this.d.equals(e8lVar.d) && this.e.equals(e8lVar.e) && this.f.equals(e8lVar.f) && this.g.equals(e8lVar.g) && this.h.equals(e8lVar.h) && this.i.equals(e8lVar.i) && this.j.equals(e8lVar.j) && this.k.equals(e8lVar.k) && this.l.equals(e8lVar.l) && this.m.equals(e8lVar.m) && this.n.equals(e8lVar.n);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof e8l) && (p6t0Var2 instanceof e8l);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.n.hashCode() + dw9.a((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + twn.g(this.d, twn.g(this.c, (this.b.hashCode() + (this.f7378a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.m);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof e8l) || !(p6t0Var2 instanceof e8l)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e8l e8lVar = (e8l) p6t0Var;
        e8l e8lVar2 = (e8l) p6t0Var2;
        k9x.G(linkedHashSet, e8lVar.f7378a, e8lVar2.f7378a);
        k9x.G(linkedHashSet, e8lVar.b, e8lVar2.b);
        k9x.G(linkedHashSet, new a8l(e8lVar.c), new a8l(e8lVar2.c));
        k9x.G(linkedHashSet, new s7l(e8lVar.d), new s7l(e8lVar2.d));
        k9x.G(linkedHashSet, e8lVar.e, e8lVar2.e);
        k9x.G(linkedHashSet, e8lVar.f, e8lVar2.f);
        k9x.G(linkedHashSet, e8lVar.g, e8lVar2.g);
        k9x.G(linkedHashSet, e8lVar.h, e8lVar2.h);
        k9x.G(linkedHashSet, e8lVar.i, e8lVar2.i);
        k9x.G(linkedHashSet, e8lVar.j, e8lVar2.j);
        k9x.G(linkedHashSet, e8lVar.k, e8lVar2.k);
        k9x.G(linkedHashSet, e8lVar.l, e8lVar2.l);
        k9x.G(linkedHashSet, new v7l(e8lVar.m), new v7l(e8lVar2.m));
        k9x.G(linkedHashSet, new w7l(e8lVar.n), new w7l(e8lVar2.n));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strO = hne.o("RadiantSelectedHeroes(value=", Separators.RPAREN, this.c);
        String strO2 = hne.o("DireSelectedHeroes(value=", Separators.RPAREN, this.d);
        String strR = twn.r(this.m, "MapBuildings(value=", Separators.RPAREN);
        String strO3 = hne.o("MapHeroes(value=", Separators.RPAREN, this.n);
        StringBuilder sb = new StringBuilder("DotaStageTabletUiModel(radiantTeam=");
        sb.append(this.f7378a);
        sb.append(", direTeam=");
        sb.append(this.b);
        sb.append(", radiantSelectedHeroes=");
        f140.v(sb, strO, ", direSelectedHeroes=", strO2, ", radiantNetWorth=");
        sb.append(this.e);
        sb.append(", direNetWorth=");
        sb.append(this.f);
        sb.append(", radiantTormentor=");
        sb.append(this.g);
        sb.append(", direTormentor=");
        sb.append(this.h);
        sb.append(", radiantAegis=");
        sb.append(this.i);
        sb.append(", direAegis=");
        sb.append(this.j);
        sb.append(", roshan=");
        sb.append(this.k);
        sb.append(", mapImage=");
        sb.append(this.l);
        sb.append(", mapBuildings=");
        return ua80.m(sb, strR, ", mapHeroes=", strO3, Separators.RPAREN);
    }
}
