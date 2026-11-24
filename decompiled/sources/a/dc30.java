package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dc30 {
    public static final cc30 Companion = new cc30();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new n230(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5833a;
    public final String b;
    public final List c;

    public /* synthetic */ dc30(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f5833a = null;
        } else {
            this.f5833a = str;
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
        if (!(obj instanceof dc30)) {
            return false;
        }
        dc30 dc30Var = (dc30) obj;
        return Intrinsics.d(this.f5833a, dc30Var.f5833a) && Intrinsics.d(this.b, dc30Var.b) && Intrinsics.d(this.c, dc30Var.c);
    }

    public final int hashCode() {
        String str = this.f5833a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("MatchProgressCricketResponse(title=", this.f5833a, ", teamId=", this.b, ", ballByBall="), this.c, Separators.RPAREN);
    }
}
