package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class q9n0 {
    public static final p9n0 Companion = new p9n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28358a;
    public final String b;

    public /* synthetic */ q9n0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f28358a = null;
        } else {
            this.f28358a = str;
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
        if (!(obj instanceof q9n0)) {
            return false;
        }
        q9n0 q9n0Var = (q9n0) obj;
        return Intrinsics.d(this.f28358a, q9n0Var.f28358a) && Intrinsics.d(this.b, q9n0Var.b);
    }

    public final int hashCode() {
        String str = this.f28358a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubscriptionSubScoreResponse(opponent1=", this.f28358a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
