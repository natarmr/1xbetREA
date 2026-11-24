package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class bsv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3151a;
    public final String b;

    public bsv(String str, String str2) {
        this.f3151a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsv)) {
            return false;
        }
        bsv bsvVar = (bsv) obj;
        return this.f3151a.equals(bsvVar.f3151a) && this.b.equals(bsvVar.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof bsv) && (p6t0Var2 instanceof bsv);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(Long.hashCode(131L) * 31, 31, this.f3151a);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof bsv) || !(p6t0Var2 instanceof bsv)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bsv bsvVar = (bsv) p6t0Var;
        bsv bsvVar2 = (bsv) p6t0Var2;
        k9x.G(arrayList, new zrv(bsvVar.f3151a), new zrv(bsvVar2.f3151a));
        k9x.G(arrayList, new yrv(bsvVar.b), new yrv(bsvVar2.b));
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        return b1j.k("HeaderStatisticBlockUiModel(id=131, title=", kng0.l("Title(value=", this.f3151a, Separators.RPAREN), ", subtitle=", kng0.l("Subtitle(value=", this.b, Separators.RPAREN), Separators.RPAREN);
    }
}
