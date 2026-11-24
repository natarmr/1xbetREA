package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class lhd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f20050a;
    public final yed0 b;
    public final boolean c;
    public final mgd0 d;
    public final qgd0 e;
    public final rgd0 f;
    public final ygd0 g;

    public lhd0(SpannableStringBuilder spannableStringBuilder, yed0 yed0Var, boolean z, mgd0 mgd0Var, qgd0 qgd0Var, rgd0 rgd0Var, ygd0 ygd0Var) {
        yed0Var.getClass();
        this.f20050a = spannableStringBuilder;
        this.b = yed0Var;
        this.c = z;
        this.d = mgd0Var;
        this.e = qgd0Var;
        this.f = rgd0Var;
        this.g = ygd0Var;
    }

    public static lhd0 a(lhd0 lhd0Var, SpannableStringBuilder spannableStringBuilder, qgd0 qgd0Var, rgd0 rgd0Var, ygd0 ygd0Var, int i) {
        if ((i & 1) != 0) {
            spannableStringBuilder = lhd0Var.f20050a;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        yed0 yed0Var = lhd0Var.b;
        boolean z = lhd0Var.c;
        mgd0 mgd0Var = (i & 8) != 0 ? lhd0Var.d : mgd0.f21737a;
        if ((i & 16) != 0) {
            qgd0Var = lhd0Var.e;
        }
        qgd0 qgd0Var2 = qgd0Var;
        if ((i & 32) != 0) {
            rgd0Var = lhd0Var.f;
        }
        rgd0 rgd0Var2 = rgd0Var;
        if ((i & 64) != 0) {
            ygd0Var = lhd0Var.g;
        }
        lhd0Var.getClass();
        yed0Var.getClass();
        return new lhd0(spannableStringBuilder2, yed0Var, z, mgd0Var, qgd0Var2, rgd0Var2, ygd0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhd0)) {
            return false;
        }
        lhd0 lhd0Var = (lhd0) obj;
        return this.f20050a.equals(lhd0Var.f20050a) && this.b == lhd0Var.b && this.c == lhd0Var.c && this.d.equals(lhd0Var.d) && this.e.equals(lhd0Var.e) && this.f.equals(lhd0Var.f) && this.g.equals(lhd0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((((Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f20050a.hashCode() * 31)) * 31)) * 31) + 105414008) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UiState(message=" + ((Object) this.f20050a) + ", activationType=" + this.b + ", cantGetCodeVisible=" + this.c + ", firstButtonState=" + this.d + ", secondButtonState=" + this.e + ", thirdButtonState=" + this.f + ", timerTextState=" + this.g + Separators.RPAREN;
    }
}
