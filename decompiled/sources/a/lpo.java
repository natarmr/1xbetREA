package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class lpo implements r4f, t0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20452a;
    public final String b;
    public final rse c;

    public lpo(String str, String str2, rse rseVar) {
        this.f20452a = str;
        this.b = str2;
        this.c = rseVar;
    }

    @Override // a.t0m
    public final rse c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpo)) {
            return false;
        }
        lpo lpoVar = (lpo) obj;
        return this.f20452a.equals(lpoVar.f20452a) && this.b.equals(lpoVar.b) && this.c == lpoVar.c;
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
        if ((p6t0Var instanceof lpo) && (p6t0Var2 instanceof lpo)) {
            return p6t0Var.equals(p6t0Var2);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f20452a.hashCode() * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof lpo) || !(p6t0Var2 instanceof lpo)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lpo lpoVar = (lpo) p6t0Var;
        lpo lpoVar2 = (lpo) p6t0Var2;
        k9x.G(linkedHashSet, new jpo(lpoVar.f20452a), new jpo(lpoVar2.f20452a));
        k9x.G(linkedHashSet, new ipo(lpoVar.b), new ipo(lpoVar2.b));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ExpressBoostInfoUiModel(titleText=", kng0.l("TitleText(value=", this.f20452a, Separators.RPAREN), ", subtitleText=", kng0.l("SubtitleText(value=", this.b, Separators.RPAREN), ", couponSeparatorStyle=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
