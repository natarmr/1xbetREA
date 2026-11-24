package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class red {
    public static final qed Companion = new qed();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce30 f30329a;
    public final Integer b;
    public final List c;

    static {
        be30 be30Var = ce30.Companion;
        d = new a8z[]{null, null, maz.a(wez.f39042a, new a7d((byte) 8))};
    }

    public /* synthetic */ red(int i, ce30 ce30Var, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f30329a = null;
        } else {
            this.f30329a = ce30Var;
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
        if (!(obj instanceof red)) {
            return false;
        }
        red redVar = (red) obj;
        return Intrinsics.d(this.f30329a, redVar.f30329a) && Intrinsics.d(this.b, redVar.b) && Intrinsics.d(this.c, redVar.c);
    }

    public final int hashCode() {
        ce30 ce30Var = this.f30329a;
        int iHashCode = (ce30Var == null ? 0 : ce30Var.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedMatchesResponse(matchResponse=");
        sb.append(this.f30329a);
        sb.append(", sportId=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
