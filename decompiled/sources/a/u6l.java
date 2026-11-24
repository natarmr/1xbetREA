package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class u6l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35140a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;

    public u6l(long j, long j2, long j3, String str, boolean z, boolean z2) {
        this.f35140a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = j2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6l)) {
            return false;
        }
        u6l u6lVar = (u6l) obj;
        return this.f35140a == u6lVar.f35140a && this.b.equals(u6lVar.b) && this.c == u6lVar.c && this.d == u6lVar.d && this.e == u6lVar.e && this.f == u6lVar.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof u6l) && (p6t0Var2 instanceof u6l) && ((u6l) p6t0Var).f35140a == ((u6l) p6t0Var2).f35140a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + rw2.b(brm0.e(brm0.e(ua80.b(Long.hashCode(this.f35140a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof u6l) || !(p6t0Var2 instanceof u6l)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        u6l u6lVar = (u6l) p6t0Var;
        u6l u6lVar2 = (u6l) p6t0Var2;
        k9x.G(linkedHashSet, new s6l(u6lVar.b), new s6l(u6lVar2.b));
        k9x.G(linkedHashSet, new p6l(u6lVar.c), new p6l(u6lVar2.c));
        k9x.G(linkedHashSet, new r6l(u6lVar.d), new r6l(u6lVar2.d));
        k9x.G(linkedHashSet, new q6l(u6lVar.e), new q6l(u6lVar2.e));
        k9x.G(linkedHashSet, new t6l(u6lVar.f), new t6l(u6lVar2.f));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("HeroIcon(value=", this.b, Separators.RPAREN);
        String strD = defpackage.c.d("Aegis(value=", Separators.RPAREN, this.c);
        String strD2 = defpackage.c.d("Alive(value=", Separators.RPAREN, this.d);
        String strH = axq.h(this.e, "AegisTime(value=", Separators.RPAREN);
        String strH2 = axq.h(this.f, "RespawnTime(value=", Separators.RPAREN);
        StringBuilder sbO = axq.o(this.f35140a, "DotaSelectedHeroUiModel(heroId=", ", heroIcon=", strL);
        f140.v(sbO, ", hasAegis=", strD, ", alive=", strD2);
        f140.v(sbO, ", aegisTime=", strH, ", respawnTime=", strH2);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
