package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r1p0 {
    public static final q1p0 Companion = new q1p0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new fno0(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1p0 f29693a;
    public final v0p0 b;
    public final List c;

    public /* synthetic */ r1p0(int i, f1p0 f1p0Var, v0p0 v0p0Var, List list) {
        if ((i & 1) == 0) {
            this.f29693a = null;
        } else {
            this.f29693a = f1p0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = v0p0Var;
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
        if (!(obj instanceof r1p0)) {
            return false;
        }
        r1p0 r1p0Var = (r1p0) obj;
        return Intrinsics.d(this.f29693a, r1p0Var.f29693a) && Intrinsics.d(this.b, r1p0Var.b) && Intrinsics.d(this.c, r1p0Var.c);
    }

    public final int hashCode() {
        f1p0 f1p0Var = this.f29693a;
        int iHashCode = (f1p0Var == null ? 0 : f1p0Var.hashCode()) * 31;
        v0p0 v0p0Var = this.b;
        int iHashCode2 = (iHashCode + (v0p0Var == null ? 0 : v0p0Var.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamBetStatisticDataResponse(overall=");
        sb.append(this.f29693a);
        sb.append(", indicators=");
        sb.append(this.b);
        sb.append(", lastGames=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
