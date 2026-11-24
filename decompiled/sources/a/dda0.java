package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dda0 {
    public static final cda0 Companion = new cda0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5886a;
    public final List b;
    public final Long c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new raa0((byte) 6)), maz.a(wezVar, new raa0((byte) 7)), null, maz.a(wezVar, new raa0((byte) 8))};
    }

    public /* synthetic */ dda0(int i, List list, List list2, Long l, List list3) {
        if ((i & 1) == 0) {
            this.f5886a = null;
        } else {
            this.f5886a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dda0)) {
            return false;
        }
        dda0 dda0Var = (dda0) obj;
        return Intrinsics.d(this.f5886a, dda0Var.f5886a) && Intrinsics.d(this.b, dda0Var.b) && Intrinsics.d(this.c, dda0Var.c) && Intrinsics.d(this.d, dda0Var.d);
    }

    public final int hashCode() {
        List list = this.f5886a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List list3 = this.d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("PlayerTransfersBaseResponse(teams=", ", players=", this.f5886a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", transfers=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
