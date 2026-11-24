package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41166a;
    public final String b;
    public final boolean c;

    public xnb0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f41166a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnb0)) {
            return false;
        }
        xnb0 xnb0Var = (xnb0) obj;
        return Intrinsics.d(this.f41166a, xnb0Var.f41166a) && Intrinsics.d(this.b, xnb0Var.b) && this.c == xnb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f41166a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("PotentialWinUiState(potentialWinLabel=", this.f41166a, ", potentialWinValue=", this.b, ", showPotentialWin="), this.c, Separators.RPAREN);
    }
}
