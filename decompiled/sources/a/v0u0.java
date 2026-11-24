package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class v0u0 {
    public static final u0u0 Companion = new u0u0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new tht0(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f36600a;
    public final Boolean b;
    public final List c;

    public /* synthetic */ v0u0(int i, Boolean bool, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f36600a = null;
        } else {
            this.f36600a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
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
        if (!(obj instanceof v0u0)) {
            return false;
        }
        v0u0 v0u0Var = (v0u0) obj;
        return Intrinsics.d(this.f36600a, v0u0Var.f36600a) && Intrinsics.d(this.b, v0u0Var.b) && Intrinsics.d(this.c, v0u0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f36600a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValorantStatisticMatchesMatchTeamResponse(score=");
        sb.append(this.f36600a);
        sb.append(", isWinner=");
        sb.append(this.b);
        sb.append(", players=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
