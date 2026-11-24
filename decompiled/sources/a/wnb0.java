package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39439a;
    public final String b;
    public final boolean c;

    public wnb0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f39439a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnb0)) {
            return false;
        }
        wnb0 wnb0Var = (wnb0) obj;
        return Intrinsics.d(this.f39439a, wnb0Var.f39439a) && Intrinsics.d(this.b, wnb0Var.b) && this.c == wnb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f39439a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("PotentialWinUiState(potentialWinLabel=", this.f39439a, ", potentialWinValue=", this.b, ", showPotentialWin="), this.c, Separators.RPAREN);
    }
}
