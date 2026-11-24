package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b9l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2216a;
    public final String b;
    public final x8l c;
    public final r8l d;
    public final w8l e;
    public final a9l f;
    public final q8l g;
    public final z8l h;
    public final v8l i;
    public final List j;
    public final ArrayList k;

    public b9l(String str, String str2, x8l x8lVar, r8l r8lVar, w8l w8lVar, a9l a9lVar, q8l q8lVar, z8l z8lVar, v8l v8lVar, List list, ArrayList arrayList) {
        this.f2216a = str;
        this.b = str2;
        this.c = x8lVar;
        this.d = r8lVar;
        this.e = w8lVar;
        this.f = a9lVar;
        this.g = q8lVar;
        this.h = z8lVar;
        this.i = v8lVar;
        this.j = list;
        this.k = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9l)) {
            return false;
        }
        b9l b9lVar = (b9l) obj;
        return this.f2216a.equals(b9lVar.f2216a) && this.b.equals(b9lVar.b) && this.c.equals(b9lVar.c) && this.d.equals(b9lVar.d) && this.e.equals(b9lVar.e) && this.f.equals(b9lVar.f) && this.g.equals(b9lVar.g) && this.h.equals(b9lVar.h) && this.i.equals(b9lVar.i) && this.j.equals(b9lVar.j) && this.k.equals(b9lVar.k);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof b9l) && (p6t0Var2 instanceof b9l);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "STAGE";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.k.hashCode() + dw9.a((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(ua80.b(-1839165214, 31, this.f2216a), 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof b9l) || !(p6t0Var2 instanceof b9l)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b9l b9lVar = (b9l) p6t0Var;
        b9l b9lVar2 = (b9l) p6t0Var2;
        k9x.G(linkedHashSet, new y8l(b9lVar.f2216a), new y8l(b9lVar2.f2216a));
        k9x.G(linkedHashSet, new s8l(b9lVar.b), new s8l(b9lVar2.b));
        k9x.G(linkedHashSet, b9lVar.c, b9lVar2.c);
        k9x.G(linkedHashSet, b9lVar.d, b9lVar2.d);
        k9x.G(linkedHashSet, b9lVar.e, b9lVar2.e);
        k9x.G(linkedHashSet, b9lVar.f, b9lVar2.f);
        k9x.G(linkedHashSet, b9lVar.g, b9lVar2.g);
        k9x.G(linkedHashSet, b9lVar.h, b9lVar2.h);
        k9x.G(linkedHashSet, b9lVar.i, b9lVar2.i);
        k9x.G(linkedHashSet, new t8l(b9lVar.j), new t8l(b9lVar2.j));
        k9x.G(linkedHashSet, new u8l(b9lVar.k), new u8l(b9lVar2.k));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("RadiantTeamIcon(value=", this.f2216a, Separators.RPAREN);
        String strL2 = kng0.l("DireTeamIcon(value=", this.b, Separators.RPAREN);
        String strR = twn.r(this.j, "MapBuildings(value=", Separators.RPAREN);
        String strO = hne.o("MapHeroes(value=", Separators.RPAREN, this.k);
        StringBuilder sbN = b1j.n("DotaStageUiModel(key=STAGE, radiantTeamIcon=", strL, ", direTeamIcon=", strL2, ", radiantSide=");
        sbN.append(this.c);
        sbN.append(", direSide=");
        sbN.append(this.d);
        sbN.append(", netWorth=");
        sbN.append(this.e);
        sbN.append(", tormentors=");
        sbN.append(this.f);
        sbN.append(", aegis=");
        sbN.append(this.g);
        sbN.append(", roshan=");
        sbN.append(this.h);
        sbN.append(", mapImage=");
        sbN.append(this.i);
        sbN.append(", mapBuildings=");
        sbN.append(strR);
        sbN.append(", mapHeroes=");
        return axq.n(sbN, strO, Separators.RPAREN);
    }
}
