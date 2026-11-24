package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy20 f3538a;
    public final s5n0 b;
    public final j43 c;
    public final wbs0 d;
    public final kho e;

    public c0s(hy20 hy20Var, s5n0 s5n0Var, j43 j43Var, wbs0 wbs0Var, kho khoVar) {
        wbs0Var.getClass();
        this.f3538a = hy20Var;
        this.b = s5n0Var;
        this.c = j43Var;
        this.d = wbs0Var;
        this.e = khoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0s)) {
            return false;
        }
        c0s c0sVar = (c0s) obj;
        return this.f3538a.equals(c0sVar.f3538a) && this.b.equals(c0sVar.b) && this.c.equals(c0sVar.c) && this.d == c0sVar.d && this.e.equals(c0sVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f3538a.f13841a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GameCardUiModel(marketUiModel=" + this.f3538a + ", subgameUiModel=" + this.b + ", animatedCoefficientModel=" + this.c + ", trackEventState=" + this.d + ", eventSpecialBetTypeLabelUiState=" + this.e + Separators.RPAREN;
    }
}
