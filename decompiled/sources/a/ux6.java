package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ux6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f36426a;
    public final String b;

    public ux6(pz40 pz40Var, String str) {
        pz40Var.getClass();
        str.getClass();
        this.f36426a = pz40Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux6)) {
            return false;
        }
        ux6 ux6Var = (ux6) obj;
        return Intrinsics.d(this.f36426a, ux6Var.f36426a) && Intrinsics.d(this.b, ux6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36426a.hashCode() * 31);
    }

    public final String toString() {
        return "BetFieldValueUiState(betValue=" + this.f36426a + ", betValuePlaceholder=" + this.b + Separators.RPAREN;
    }
}
