package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class sie0 {
    public static final rie0 Companion = new rie0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32259a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new o6e0((byte) 9)), maz.a(wezVar, new o6e0((byte) 10)), maz.a(wezVar, new o6e0((byte) 11))};
    }

    public /* synthetic */ sie0(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f32259a = null;
        } else {
            this.f32259a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sie0)) {
            return false;
        }
        sie0 sie0Var = (sie0) obj;
        return Intrinsics.d(this.f32259a, sie0Var.f32259a) && Intrinsics.d(this.b, sie0Var.b) && Intrinsics.d(this.c, sie0Var.c);
    }

    public final int hashCode() {
        List list = this.f32259a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(w6x.t("RefereeCardLastGameDataResponse(players=", ", teamResultsResponse=", this.f32259a, ", teamResponses=", this.b), this.c, Separators.RPAREN);
    }
}
