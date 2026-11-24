package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dxh {
    public static final cxh Companion = new cxh();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6845a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{null, maz.a(wezVar, new bmh((byte) 8)), maz.a(wezVar, new bmh((byte) 9))};
    }

    public /* synthetic */ dxh(int i, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f6845a = null;
        } else {
            this.f6845a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
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
        if (!(obj instanceof dxh)) {
            return false;
        }
        dxh dxhVar = (dxh) obj;
        return Intrinsics.d(this.f6845a, dxhVar.f6845a) && Intrinsics.d(this.b, dxhVar.b) && Intrinsics.d(this.c, dxhVar.c);
    }

    public final int hashCode() {
        Integer num = this.f6845a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyclingResultsResponse(sportId=");
        sb.append(this.f6845a);
        sb.append(", players=");
        sb.append(this.b);
        sb.append(", statisticContent=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
