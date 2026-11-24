package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dup {
    public static final cup Companion = new cup();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6707a;
    public final Integer b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new dfp((byte) 16)), null, maz.a(wezVar, new dfp((byte) 17))};
    }

    public /* synthetic */ dup(int i, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f6707a = null;
        } else {
            this.f6707a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
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
        if (!(obj instanceof dup)) {
            return false;
        }
        dup dupVar = (dup) obj;
        return Intrinsics.d(this.f6707a, dupVar.f6707a) && Intrinsics.d(this.b, dupVar.b) && Intrinsics.d(this.c, dupVar.c);
    }

    public final int hashCode() {
        List list = this.f6707a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.r(this.b, "FightStatisticResponse(response=", ", sportId=", ", teams=", this.f6707a), this.c, Separators.RPAREN);
    }
}
