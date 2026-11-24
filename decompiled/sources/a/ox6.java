package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ox6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f25996a;
    public final String b;
    public final boolean c;
    public final qln0 d;
    public final hx6 e;

    public ox6(pz40 pz40Var, String str, boolean z, qln0 qln0Var, hx6 hx6Var) {
        pz40Var.getClass();
        str.getClass();
        this.f25996a = pz40Var;
        this.b = str;
        this.c = z;
        this.d = qln0Var;
        this.e = hx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox6)) {
            return false;
        }
        ox6 ox6Var = (ox6) obj;
        return Intrinsics.d(this.f25996a, ox6Var.f25996a) && Intrinsics.d(this.b, ox6Var.b) && this.c == ox6Var.c && this.d.equals(ox6Var.d) && this.e == ox6Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(ua80.b(this.f25996a.hashCode() * 31, 31, this.b), 31, this.c), 31, true)) * 31);
    }

    public final String toString() {
        return "BetFieldUiState(betValue=" + this.f25996a + ", betValuePlaceholder=" + this.b + ", isNeedResetOnFocus=" + this.c + ", needShowSupportingText=true, supportingTextState=" + this.d + ", betFieldStyle=" + this.e + Separators.RPAREN;
    }
}
