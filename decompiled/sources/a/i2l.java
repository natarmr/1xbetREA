package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class i2l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14053a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;

    public i2l(long j, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, int i2) {
        this.f14053a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2l)) {
            return false;
        }
        i2l i2lVar = (i2l) obj;
        return this.f14053a == i2lVar.f14053a && this.b.equals(i2lVar.b) && this.c.equals(i2lVar.c) && this.d.equals(i2lVar.d) && this.e.equals(i2lVar.e) && this.f == i2lVar.f && this.g == i2lVar.g && this.h == i2lVar.h && this.i == i2lVar.i;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof i2l) && (p6t0Var2 instanceof i2l) && ((i2l) p6t0Var).f14053a == ((i2l) p6t0Var2).f14053a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + twn.a(this.h, brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f14053a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof i2l) || !(p6t0Var2 instanceof i2l)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i2l i2lVar = (i2l) p6t0Var;
        i2l i2lVar2 = (i2l) p6t0Var2;
        k9x.G(linkedHashSet, new f2l(i2lVar.b), new f2l(i2lVar2.b));
        k9x.G(linkedHashSet, new c2l(i2lVar.c), new c2l(i2lVar2.c));
        k9x.G(linkedHashSet, new g2l(i2lVar.d), new g2l(i2lVar2.d));
        k9x.G(linkedHashSet, new d2l(i2lVar.e), new d2l(i2lVar2.e));
        k9x.G(linkedHashSet, new e2l(i2lVar.f), new e2l(i2lVar2.f));
        k9x.G(linkedHashSet, new b2l(i2lVar.g), new b2l(i2lVar2.g));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("TeamLightHeroLogo(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("TeamDarkHeroLogo(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("TeamLightNumber(value=", this.d, Separators.RPAREN);
        String strL4 = kng0.l("TeamDarkNumber(value=", this.e, Separators.RPAREN);
        String strD = defpackage.c.d("TeamLightBan(value=", Separators.RPAREN, this.f);
        String strD2 = defpackage.c.d("TeamDarkBan(value=", Separators.RPAREN, this.g);
        StringBuilder sbO = axq.o(this.f14053a, "DotaBanPickHeroUiModel(id=", ", teamLightHeroLogo=", strL);
        f140.v(sbO, ", teamDarkHeroLogo=", strL2, ", teamLightNumber=", strL3);
        f140.v(sbO, ", teamDarkNumber=", strL4, ", teamLightBan=", strD);
        axq.s(this.h, ", teamDarkBan=", strD2, ", lightHeroPlaceholder=", sbO);
        return vqd.p(sbO, ", darkHeroPlaceholder=", this.i, Separators.RPAREN);
    }
}
