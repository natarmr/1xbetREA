package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vm6 {
    public static final um6 Companion = new um6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37663a;
    public final String b;

    public /* synthetic */ vm6(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f37663a = null;
        } else {
            this.f37663a = str;
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
        if (!(obj instanceof vm6)) {
            return false;
        }
        vm6 vm6Var = (vm6) obj;
        return Intrinsics.d(this.f37663a, vm6Var.f37663a) && Intrinsics.d(this.b, vm6Var.b);
    }

    public final int hashCode() {
        String str = this.f37663a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("BetBuilderWicketScoreResponse(opponent1=", this.f37663a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
