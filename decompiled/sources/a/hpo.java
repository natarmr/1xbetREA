package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hpo implements r4f, t0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13453a;
    public final String b;
    public final String c;
    public final rse d;

    public hpo(String str, String str2, String str3, rse rseVar) {
        str3.getClass();
        this.f13453a = str;
        this.b = str2;
        this.c = str3;
        this.d = rseVar;
    }

    @Override // a.t0m
    public final rse c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpo)) {
            return false;
        }
        hpo hpoVar = (hpo) obj;
        return this.f13453a.equals(hpoVar.f13453a) && this.b.equals(hpoVar.b) && Intrinsics.d(this.c, hpoVar.c) && this.d == hpoVar.d;
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
        if ((p6t0Var instanceof hpo) && (p6t0Var2 instanceof hpo)) {
            return p6t0Var.equals(p6t0Var2);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f13453a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof hpo) || !(p6t0Var2 instanceof hpo)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        hpo hpoVar = (hpo) p6t0Var;
        hpo hpoVar2 = (hpo) p6t0Var2;
        k9x.G(linkedHashSet, new fpo(hpoVar.f13453a), new fpo(hpoVar2.f13453a));
        k9x.G(linkedHashSet, new dpo(hpoVar.b), new dpo(hpoVar2.b));
        k9x.G(linkedHashSet, new epo(hpoVar.c), new epo(hpoVar2.c));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("TitleText(value=", this.f13453a, Separators.RPAREN);
        String strL2 = kng0.l("CoefLabelText(value=", this.b, Separators.RPAREN);
        String strL3 = kng0.l("CoefValueText(value=", this.c, Separators.RPAREN);
        StringBuilder sbN = b1j.n("ExpressBoostBonusUiModel(titleText=", strL, ", coefLabelText=", strL2, ", coefValueText=");
        sbN.append(strL3);
        sbN.append(", couponSeparatorStyle=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
