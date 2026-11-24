package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class l7r0 {
    public static final k7r0 Companion = new k7r0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new joq0(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l26 f19574a;
    public final l26 b;
    public final List c;

    public /* synthetic */ l7r0(int i, l26 l26Var, l26 l26Var2, List list) {
        if ((i & 1) == 0) {
            this.f19574a = null;
        } else {
            this.f19574a = l26Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l26Var2;
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
        if (!(obj instanceof l7r0)) {
            return false;
        }
        l7r0 l7r0Var = (l7r0) obj;
        return Intrinsics.d(this.f19574a, l7r0Var.f19574a) && Intrinsics.d(this.b, l7r0Var.b) && Intrinsics.d(this.c, l7r0Var.c);
    }

    public final int hashCode() {
        l26 l26Var = this.f19574a;
        int iHashCode = (l26Var == null ? 0 : l26Var.hashCode()) * 31;
        l26 l26Var2 = this.b;
        int iHashCode2 = (iHashCode + (l26Var2 == null ? 0 : l26Var2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopGamesResponse(sport=");
        sb.append(this.f19574a);
        sb.append(", subSport=");
        sb.append(this.b);
        sb.append(", games=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
