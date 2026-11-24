package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class qzm0 {
    public static final nzm0 Companion = new nzm0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29586a;
    public final String b;

    public /* synthetic */ qzm0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f29586a = null;
        } else {
            this.f29586a = str;
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
        if (!(obj instanceof qzm0)) {
            return false;
        }
        qzm0 qzm0Var = (qzm0) obj;
        return Intrinsics.d(this.f29586a, qzm0Var.f29586a) && Intrinsics.d(this.b, qzm0Var.b);
    }

    public final int hashCode() {
        String str = this.f29586a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubScoreResponse(opponent1=", this.f29586a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
