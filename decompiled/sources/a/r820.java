package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r820 implements u820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy6 f30005a;
    public final k680 b;

    public r820(yy6 yy6Var, k680 k680Var) {
        yy6Var.getClass();
        this.f30005a = yy6Var;
        this.b = k680Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r820)) {
            return false;
        }
        r820 r820Var = (r820) obj;
        return Intrinsics.d(this.f30005a, r820Var.f30005a) && Intrinsics.d(this.b, r820Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f30005a.hashCode() * 31;
        k680 k680Var = this.b;
        return iHashCode + (k680Var == null ? 0 : k680Var.hashCode());
    }

    public final String toString() {
        return "PrimaryBet(betGameInfo=" + this.f30005a + ", optionBetUiState=" + this.b + Separators.RPAREN;
    }
}
