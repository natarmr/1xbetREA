package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ui50 {
    public static final ti50 Companion = new ti50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35714a;
    public final String b;

    public /* synthetic */ ui50(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f35714a = null;
        } else {
            this.f35714a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui50)) {
            return false;
        }
        ui50 ui50Var = (ui50) obj;
        return Intrinsics.d(this.f35714a, ui50Var.f35714a) && Intrinsics.d(this.b, ui50Var.b);
    }

    public final int hashCode() {
        String str = this.f35714a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("NearestGameDetailsWicketScoreResponse(firstOpponent=", this.f35714a, ", secondOpponent=", this.b, Separators.RPAREN);
    }
}
