package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class uj40 {
    public static final tj40 Companion = new tj40();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new ec40(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35760a;
    public final String b;
    public final List c;

    public /* synthetic */ uj40(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f35760a = null;
        } else {
            this.f35760a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj40)) {
            return false;
        }
        uj40 uj40Var = (uj40) obj;
        return Intrinsics.d(this.f35760a, uj40Var.f35760a) && Intrinsics.d(this.b, uj40Var.b) && Intrinsics.d(this.c, uj40Var.c);
    }

    public final int hashCode() {
        String str = this.f35760a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("MlbbPlayersCompositionResponse(teamName=", this.f35760a, ", teamImage=", this.b, ", players="), this.c, Separators.RPAREN);
    }
}
