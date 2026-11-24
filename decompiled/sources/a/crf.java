package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class crf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4844a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public crf(int i, int i2, int i3, int i4, int i5, long j, String str, boolean z) {
        this.f4844a = j;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crf)) {
            return false;
        }
        crf crfVar = (crf) obj;
        return this.f4844a == crfVar.f4844a && this.b.equals(crfVar.b) && Float.compare(1.0f, 1.0f) == 0 && this.c == crfVar.c && this.d == crfVar.d && this.e == crfVar.e && this.f == crfVar.f && this.g == crfVar.g && this.h == crfVar.h;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof crf) && (p6t0Var2 instanceof crf) && ((crf) p6t0Var).f4844a == ((crf) p6t0Var2).f4844a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, brm0.e(defpackage.c.a(ua80.b(Long.hashCode(this.f4844a) * 31, 31, this.b), 1.0f, 31), 31, this.c), 31), 31), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof crf) || !(p6t0Var2 instanceof crf)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        crf crfVar = (crf) p6t0Var;
        crf crfVar2 = (crf) p6t0Var2;
        k9x.G(linkedHashSet, new xqf(crfVar.b), new xqf(crfVar2.b));
        k9x.G(linkedHashSet, new yqf(), new yqf());
        k9x.G(linkedHashSet, new wqf(crfVar.c), new wqf(crfVar2.c));
        k9x.G(linkedHashSet, new zqf(crfVar.d), new zqf(crfVar2.d));
        k9x.G(linkedHashSet, new vqf(crfVar.e), new vqf(crfVar2.e));
        k9x.G(linkedHashSet, new tqf(crfVar.f), new tqf(crfVar2.f));
        k9x.G(linkedHashSet, new arf(crfVar.g), new arf(crfVar2.g));
        k9x.G(linkedHashSet, new uqf(crfVar.h), new uqf(crfVar2.h));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Round(value=", this.b, Separators.RPAREN);
        String strD = defpackage.c.d("MultipleThree(value=", Separators.RPAREN, this.c);
        String strE = ua80.e(this.d, "TerroristsWinMethodIcon(value=", Separators.RPAREN);
        String strE2 = ua80.e(this.e, "CounterTerroristsWinMethodIcon(value=", Separators.RPAREN);
        String strE3 = ua80.e(this.f, "ColorRoundStatsIndicator(value=", Separators.RPAREN);
        String strE4 = ua80.e(this.g, "TextBackgroundColorIndicator(value=", Separators.RPAREN);
        String strE5 = ua80.e(this.h, "ColorRoundText(value=", Separators.RPAREN);
        StringBuilder sbO = axq.o(this.f4844a, "Cs2RoundStatisticsItemUiModel(id=", ", round=", strL);
        f140.v(sbO, ", roundIndicatorAlpha=RoundIndicatorAlpha(value=1.0), multipleThree=", strD, ", terroristsWinMethodIcon=", strE);
        f140.v(sbO, ", counterTerroristsWinMethodIcon=", strE2, ", colorRoundStatsIndicator=", strE3);
        f140.v(sbO, ", textBackgroundColorIndicator=", strE4, ", colorRoundText=", strE5);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
