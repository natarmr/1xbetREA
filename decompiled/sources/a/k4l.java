package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class k4l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17674a;
    public final byte b;
    public final xnp0 c;
    public final ArrayList d;
    public final ArrayList e;
    public final lc00 f;
    public final ArrayList g;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public k4l(String str, long j, xnp0 xnp0Var, ArrayList arrayList, ArrayList arrayList2, lc00 lc00Var, ArrayList arrayList3) {
        this.f17674a = str;
        this.b = (int) j;
        this.c = xnp0Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = lc00Var;
        this.g = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4l)) {
            return false;
        }
        k4l k4lVar = (k4l) obj;
        return this.f17674a.equals(k4lVar.f17674a) && ((long) this.b) == ((long) k4lVar.b) && this.c.equals(k4lVar.c) && this.d.equals(k4lVar.d) && this.e.equals(k4lVar.e) && this.f.equals(k4lVar.f) && this.g.equals(k4lVar.g);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof k4l) && (p6t0Var2 instanceof k4l) && ((long) ((k4l) p6t0Var).b) == ((long) ((k4l) p6t0Var2).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f17674a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + twn.g(this.e, twn.g(this.d, (this.c.hashCode() + rw2.b(this.f17674a.hashCode() * 31, 31, this.b)) * 31, 31), 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof k4l) || !(p6t0Var2 instanceof k4l)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k4l k4lVar = (k4l) p6t0Var;
        k4l k4lVar2 = (k4l) p6t0Var2;
        k9x.G(linkedHashSet, new j4l(k4lVar.c), new j4l(k4lVar2.c));
        k9x.G(linkedHashSet, new g4l(k4lVar.d), new g4l(k4lVar2.d));
        k9x.G(linkedHashSet, new h4l(k4lVar.e), new h4l(k4lVar2.e));
        k9x.G(linkedHashSet, new f4l(k4lVar.f), new f4l(k4lVar2.f));
        k9x.G(linkedHashSet, new i4l(k4lVar.g), new i4l(k4lVar2.g));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        long j = this.b;
        String str = "Team(value=" + this.c + Separators.RPAREN;
        String strO = hne.o("Heroes(value=", Separators.RPAREN, this.d);
        String strO2 = hne.o("HeroesItem(value=", Separators.RPAREN, this.e);
        String str2 = "AdditionalItems(value=" + this.f + Separators.RPAREN;
        String strO3 = hne.o("Items(value=", Separators.RPAREN, this.g);
        StringBuilder sbO = f140.o(j, "DotaHeroItemsUiModel(key=", this.f17674a, ", id=");
        f140.v(sbO, ", team=", str, ", heroes=", strO);
        f140.v(sbO, ", heroesItem=", strO2, ", additionalItems=", str2);
        return rw2.o(sbO, ", items=", strO3, Separators.RPAREN);
    }
}
