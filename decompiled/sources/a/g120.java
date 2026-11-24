package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g120 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f10489a;
    public final j9m0 b;
    public final r020 c;
    public final boolean d;

    public g120(zdm0 zdm0Var, j9m0 j9m0Var, r020 r020Var, boolean z) {
        this.f10489a = zdm0Var;
        this.b = j9m0Var;
        this.c = r020Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g120)) {
            return false;
        }
        g120 g120Var = (g120) obj;
        return this.f10489a.equals(g120Var.f10489a) && this.b.equals(g120Var.b) && this.c.equals(g120Var.c) && this.d == g120Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + w6x.h(this.b, this.f10489a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "MainStatisticUiModel(statisticHeaderUiModel=" + this.f10489a + ", backgroundUiModel=" + this.b + ", contentUiState=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
