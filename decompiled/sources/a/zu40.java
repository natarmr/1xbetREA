package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zu40 {
    public static final yu40 Companion = new yu40();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new ec40(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44993a;
    public final Integer b;
    public final List c;

    public /* synthetic */ zu40(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f44993a = null;
        } else {
            this.f44993a = str;
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
        if (!(obj instanceof zu40)) {
            return false;
        }
        zu40 zu40Var = (zu40) obj;
        return Intrinsics.d(this.f44993a, zu40Var.f44993a) && Intrinsics.d(this.b, zu40Var.b) && Intrinsics.d(this.c, zu40Var.c);
    }

    public final int hashCode() {
        String str = this.f44993a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "MovementResponse(playerId=", this.f44993a, ", number=", ", points="), this.c, Separators.RPAREN);
    }
}
