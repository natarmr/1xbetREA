package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vps {
    public static final ups Companion = new ups();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new o9s(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37821a;
    public final Integer b;
    public final List c;

    public /* synthetic */ vps(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f37821a = null;
        } else {
            this.f37821a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
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
        if (!(obj instanceof vps)) {
            return false;
        }
        vps vpsVar = (vps) obj;
        return Intrinsics.d(this.f37821a, vpsVar.f37821a) && Intrinsics.d(this.b, vpsVar.b) && Intrinsics.d(this.c, vpsVar.c);
    }

    public final int hashCode() {
        String str = this.f37821a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "OpponentResponse(fullName=", this.f37821a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
