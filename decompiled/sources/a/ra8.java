package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ra8 implements r4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30121a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final List i;

    public ra8(int i, String str, int i2, String str2, boolean z, boolean z2, boolean z3, String str3, List list) {
        this.f30121a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str3;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra8)) {
            return false;
        }
        ra8 ra8Var = (ra8) obj;
        return this.f30121a == ra8Var.f30121a && this.b.equals(ra8Var.b) && this.c == ra8Var.c && this.d.equals(ra8Var.d) && this.e == ra8Var.e && this.f == ra8Var.f && this.g == ra8Var.g && this.h.equals(ra8Var.h) && this.i.equals(ra8Var.i);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return p6t0Var2.getClass() == p6t0Var.getClass();
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof ra8) && (p6t0Var2 instanceof ra8)) {
            return p6t0Var.equals(p6t0Var2);
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(ua80.b(twn.a(this.c, ua80.b(Integer.hashCode(this.f30121a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof ra8) || !(p6t0Var2 instanceof ra8)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ra8 ra8Var = (ra8) p6t0Var;
        ra8 ra8Var2 = (ra8) p6t0Var2;
        k9x.G(linkedHashSet, new oa8(ra8Var.f30121a), new oa8(ra8Var2.f30121a));
        k9x.G(linkedHashSet, new pa8(ra8Var.b), new pa8(ra8Var2.b));
        k9x.G(linkedHashSet, new ja8(ra8Var.c), new ja8(ra8Var2.c));
        k9x.G(linkedHashSet, new ka8(ra8Var.d), new ka8(ra8Var2.d));
        k9x.G(linkedHashSet, new ma8(ra8Var.e), new ma8(ra8Var2.e));
        k9x.G(linkedHashSet, new la8(ra8Var.g), new la8(ra8Var2.g));
        k9x.G(linkedHashSet, new ia8(ra8Var.h), new ia8(ra8Var2.h));
        k9x.G(linkedHashSet, new na8(ra8Var.i), new na8(ra8Var2.i));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strE = ua80.e(this.f30121a, "BlockId(value=", Separators.RPAREN);
        String strL = kng0.l("BlockName(value=", this.b, Separators.RPAREN);
        String strE2 = ua80.e(this.c, "BlockBetImage(value=", Separators.RPAREN);
        String strL2 = kng0.l("BlockBetText(value=", this.d, Separators.RPAREN);
        String strD = defpackage.c.d("BlockBetVisible(value=", Separators.RPAREN, this.e);
        String strD2 = defpackage.c.d("BlockBetValueLoading(value=", Separators.RPAREN, this.g);
        String strL3 = kng0.l("BlockBetErrorText(value=", this.h, Separators.RPAREN);
        String strR = twn.r(this.i, "BlockEvents(value=", Separators.RPAREN);
        StringBuilder sbN = b1j.n("BlockUiModel(blockId=", strE, ", blockName=", strL, ", blockBetImage=");
        f140.v(sbN, strE2, ", blockBetText=", strL2, ", blockBetVisible=");
        brm0.C(strD, ", blockBetCanLoading=", ", blockBetValueLoading=", sbN, this.f);
        f140.v(sbN, strD2, ", blockBetErrorText=", strL3, ", blockEvents=");
        return axq.n(sbN, strR, Separators.RPAREN);
    }
}
