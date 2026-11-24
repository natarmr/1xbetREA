package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aw6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sx6 f1558a;
    public final rln0 b;
    public final nke c;
    public final lx6 d;
    public final prm e;
    public final String f;

    public aw6(sx6 sx6Var, rln0 rln0Var, nke nkeVar, lx6 lx6Var, prm prmVar, String str) {
        str.getClass();
        this.f1558a = sx6Var;
        this.b = rln0Var;
        this.c = nkeVar;
        this.d = lx6Var;
        this.e = prmVar;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw6)) {
            return false;
        }
        aw6 aw6Var = (aw6) obj;
        return this.f1558a.equals(aw6Var.f1558a) && this.b.equals(aw6Var.b) && this.c.equals(aw6Var.c) && this.d == aw6Var.d && Intrinsics.d(this.e, aw6Var.e) && Intrinsics.d(this.f, aw6Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f1558a.hashCode() * 31)) * 31)) * 31)) * 31;
        prm prmVar = this.e;
        return this.f.hashCode() + ((iHashCode + (prmVar == null ? 0 : prmVar.hashCode())) * 31);
    }

    public final String toString() {
        return "BetFieldContentUiState(betFieldUiState=" + this.f1558a + ", supportingTextState=" + this.b + ", controlsState=" + this.c + ", betFieldStyle=" + this.d + ", sliderUiModel=" + this.e + ", currency=" + this.f + Separators.RPAREN;
    }
}
