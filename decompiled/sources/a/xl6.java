package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xl6 {
    public static final wl6 Companion = new wl6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41057a;
    public final String b;

    public /* synthetic */ xl6(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f41057a = null;
        } else {
            this.f41057a = str;
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
        if (!(obj instanceof xl6)) {
            return false;
        }
        xl6 xl6Var = (xl6) obj;
        return Intrinsics.d(this.f41057a, xl6Var.f41057a) && Intrinsics.d(this.b, xl6Var.b);
    }

    public final int hashCode() {
        String str = this.f41057a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("BetBuilderSubScoreResponse(opponent1=", this.f41057a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
