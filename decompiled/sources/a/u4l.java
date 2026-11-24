package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class u4l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35055a;
    public final byte b;
    public final xnp0 c;
    public final ArrayList d;
    public final ArrayList e;
    public final lc00 f;
    public final ArrayList g;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public u4l(String str, long j, xnp0 xnp0Var, ArrayList arrayList, ArrayList arrayList2, lc00 lc00Var, ArrayList arrayList3) {
        this.f35055a = str;
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
        if (!(obj instanceof u4l)) {
            return false;
        }
        u4l u4lVar = (u4l) obj;
        return this.f35055a.equals(u4lVar.f35055a) && ((long) this.b) == ((long) u4lVar.b) && this.c.equals(u4lVar.c) && this.d.equals(u4lVar.d) && this.e.equals(u4lVar.e) && this.f.equals(u4lVar.f) && this.g.equals(u4lVar.g);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof u4l) && (p6t0Var2 instanceof u4l) && ((long) ((u4l) p6t0Var).b) == ((long) ((u4l) p6t0Var2).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f35055a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + twn.g(this.e, twn.g(this.d, (this.c.hashCode() + rw2.b(this.f35055a.hashCode() * 31, 31, this.b)) * 31, 31), 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof u4l) || !(p6t0Var2 instanceof u4l)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        u4l u4lVar = (u4l) p6t0Var;
        u4l u4lVar2 = (u4l) p6t0Var2;
        k9x.G(linkedHashSet, new t4l(u4lVar.c), new t4l(u4lVar2.c));
        k9x.G(linkedHashSet, new q4l(u4lVar.d), new q4l(u4lVar2.d));
        k9x.G(linkedHashSet, new r4l(u4lVar.e), new r4l(u4lVar2.e));
        k9x.G(linkedHashSet, new p4l(u4lVar.f), new p4l(u4lVar2.f));
        k9x.G(linkedHashSet, new s4l(u4lVar.g), new s4l(u4lVar2.g));
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
        String strO3 = hne.o("Skills(value=", Separators.RPAREN, this.g);
        StringBuilder sbO = f140.o(j, "DotaHeroSkillsUiModel(key=", this.f35055a, ", id=");
        f140.v(sbO, ", team=", str, ", heroes=", strO);
        f140.v(sbO, ", heroesItem=", strO2, ", additionalItems=", str2);
        return rw2.o(sbO, ", skills=", strO3, Separators.RPAREN);
    }
}
