package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class w6p0 {
    public static final v6p0 Companion = new v6p0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38635a;
    public final Long b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new fno0((byte) 18)), null, maz.a(wezVar, new fno0((byte) 19))};
    }

    public /* synthetic */ w6p0(int i, Long l, List list, List list2) {
        if ((i & 1) == 0) {
            this.f38635a = null;
        } else {
            this.f38635a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6p0)) {
            return false;
        }
        w6p0 w6p0Var = (w6p0) obj;
        return Intrinsics.d(this.f38635a, w6p0Var.f38635a) && Intrinsics.d(this.b, w6p0Var.b) && Intrinsics.d(this.c, w6p0Var.c);
    }

    public final int hashCode() {
        List list = this.f38635a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamCompletedMatchResponse(response=");
        sb.append(this.f38635a);
        sb.append(", sportId=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
