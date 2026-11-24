package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bqs {
    public static final ops Companion = new ops();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3048a;
    public final List b;
    public final Integer c;
    public final hgs d;

    static {
        ggs ggsVar = hgs.Companion;
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new o9s((byte) 24)), maz.a(wezVar, new o9s((byte) 26)), null, null};
    }

    public /* synthetic */ bqs(int i, List list, List list2, Integer num, hgs hgsVar) {
        if ((i & 1) == 0) {
            this.f3048a = null;
        } else {
            this.f3048a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hgsVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqs)) {
            return false;
        }
        bqs bqsVar = (bqs) obj;
        return Intrinsics.d(this.f3048a, bqsVar.f3048a) && Intrinsics.d(this.b, bqsVar.b) && Intrinsics.d(this.c, bqsVar.c) && Intrinsics.d(this.d, bqsVar.d);
    }

    public final int hashCode() {
        List list = this.f3048a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        hgs hgsVar = this.d;
        return iHashCode3 + (hgsVar != null ? hgsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("GameResponse(teams=", ", players=", this.f3048a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", response=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
