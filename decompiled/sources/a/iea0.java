package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class iea0 {
    public static final hea0 Companion = new hea0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14623a;
    public final Long b;
    public final nda0 c;
    public final dea0 d;
    public final dea0 e;

    public /* synthetic */ iea0(int i, String str, Long l, nda0 nda0Var, dea0 dea0Var, dea0 dea0Var2) {
        if ((i & 1) == 0) {
            this.f14623a = null;
        } else {
            this.f14623a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = nda0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = dea0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = dea0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iea0)) {
            return false;
        }
        iea0 iea0Var = (iea0) obj;
        return Intrinsics.d(this.f14623a, iea0Var.f14623a) && Intrinsics.d(this.b, iea0Var.b) && Intrinsics.d(this.c, iea0Var.c) && Intrinsics.d(this.d, iea0Var.d) && Intrinsics.d(this.e, iea0Var.e);
    }

    public final int hashCode() {
        String str = this.f14623a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        nda0 nda0Var = this.c;
        int iHashCode3 = (iHashCode2 + (nda0Var == null ? 0 : nda0Var.hashCode())) * 31;
        dea0 dea0Var = this.d;
        int iHashCode4 = (iHashCode3 + (dea0Var == null ? 0 : dea0Var.hashCode())) * 31;
        dea0 dea0Var2 = this.e;
        return iHashCode4 + (dea0Var2 != null ? dea0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "PlayerTransfersTransferResponse(date=", this.f14623a, ", dateStamp=", ", player=");
        sbS.append(this.c);
        sbS.append(", oldTeam=");
        sbS.append(this.d);
        sbS.append(", newTeam=");
        sbS.append(this.e);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
