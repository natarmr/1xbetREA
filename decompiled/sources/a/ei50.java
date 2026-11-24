package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ei50 {
    public static final di50 Companion = new di50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7842a;
    public final String b;

    public /* synthetic */ ei50(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f7842a = null;
        } else {
            this.f7842a = str;
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
        if (!(obj instanceof ei50)) {
            return false;
        }
        ei50 ei50Var = (ei50) obj;
        return Intrinsics.d(this.f7842a, ei50Var.f7842a) && Intrinsics.d(this.b, ei50Var.b);
    }

    public final int hashCode() {
        String str = this.f7842a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("NearestGameDetailsSubScoreResponse(firstOpponent=", this.f7842a, ", secondOpponent=", this.b, Separators.RPAREN);
    }
}
