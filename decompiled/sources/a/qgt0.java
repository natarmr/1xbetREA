package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qgt0 {
    public static final pgt0 Companion = new pgt0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28703a;
    public final lgt0 b;
    public final Integer c;
    public final List d;

    static {
        kgt0 kgt0Var = lgt0.Companion;
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new xns0((byte) 22)), null, null, maz.a(wezVar, new xns0((byte) 23))};
    }

    public /* synthetic */ qgt0(int i, List list, lgt0 lgt0Var, Integer num, List list2) {
        if ((i & 1) == 0) {
            this.f28703a = null;
        } else {
            this.f28703a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = lgt0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgt0)) {
            return false;
        }
        qgt0 qgt0Var = (qgt0) obj;
        return Intrinsics.d(this.f28703a, qgt0Var.f28703a) && Intrinsics.d(this.b, qgt0Var.b) && Intrinsics.d(this.c, qgt0Var.c) && Intrinsics.d(this.d, qgt0Var.d);
    }

    public final int hashCode() {
        List list = this.f28703a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        lgt0 lgt0Var = this.b;
        int iHashCode2 = (iHashCode + (lgt0Var == null ? 0 : lgt0Var.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "UpcomingEventsResponse(players=" + this.f28703a + ", eventsListResponse=" + this.b + ", sportId=" + this.c + ", teams=" + this.d + Separators.RPAREN;
    }
}
