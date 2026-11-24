package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class x3r0 {
    public static final w3r0 Companion = new w3r0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new joq0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40234a;
    public final Integer b;
    public final List c;

    public /* synthetic */ x3r0(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f40234a = null;
        } else {
            this.f40234a = str;
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
        if (!(obj instanceof x3r0)) {
            return false;
        }
        x3r0 x3r0Var = (x3r0) obj;
        return Intrinsics.d(this.f40234a, x3r0Var.f40234a) && Intrinsics.d(this.b, x3r0Var.b) && Intrinsics.d(this.c, x3r0Var.c);
    }

    public final int hashCode() {
        String str = this.f40234a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "TopEventTabResponse(title=", this.f40234a, ", type=", ", playerStatistics="), this.c, Separators.RPAREN);
    }
}
