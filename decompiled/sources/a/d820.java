package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug20 f5623a;
    public final gh00 b;
    public final jp30 c;
    public final zbr d;

    public /* synthetic */ d820(ug20 ug20Var, gh00 gh00Var, jp30 jp30Var, zbr zbrVar, int i) {
        this(ug20Var, (i & 2) != 0 ? null : gh00Var, (i & 4) != 0 ? null : jp30Var, (i & 8) != 0 ? null : zbrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d820)) {
            return false;
        }
        d820 d820Var = (d820) obj;
        return this.f5623a == d820Var.f5623a && Intrinsics.d(this.b, d820Var.b) && Intrinsics.d(this.c, d820Var.c) && Intrinsics.d(this.d, d820Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f5623a.hashCode() * 31;
        gh00 gh00Var = this.b;
        int iHashCode2 = (iHashCode + (gh00Var == null ? 0 : gh00Var.hashCode())) * 31;
        jp30 jp30Var = this.c;
        int iHashCode3 = (iHashCode2 + (jp30Var == null ? 0 : jp30Var.hashCode())) * 31;
        zbr zbrVar = this.d;
        return iHashCode3 + (zbrVar != null ? zbrVar.hashCode() : 0);
    }

    public final String toString() {
        return "MakeBetContentUiState(styleType=" + this.f5623a + ", liteNoTabsMakeBetContentUiState=" + this.b + ", mediumCustomBackgroundMakeBetContentUiState=" + this.c + ", fullScreenSliderMakeBetContentUiState=" + this.d + Separators.RPAREN;
    }

    public d820(ug20 ug20Var, gh00 gh00Var, jp30 jp30Var, zbr zbrVar) {
        ug20Var.getClass();
        this.f5623a = ug20Var;
        this.b = gh00Var;
        this.c = jp30Var;
        this.d = zbrVar;
    }
}
