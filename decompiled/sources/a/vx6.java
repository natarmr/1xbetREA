package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f38186a;
    public final String b;

    public vx6(pz40 pz40Var, String str) {
        pz40Var.getClass();
        str.getClass();
        this.f38186a = pz40Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx6)) {
            return false;
        }
        vx6 vx6Var = (vx6) obj;
        return Intrinsics.d(this.f38186a, vx6Var.f38186a) && Intrinsics.d(this.b, vx6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38186a.hashCode() * 31);
    }

    public final String toString() {
        return "BetFieldValueUiState(betValue=" + this.f38186a + ", betValuePlaceholder=" + this.b + Separators.RPAREN;
    }
}
