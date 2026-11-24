package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rmp0 {
    public static final qmp0 Companion = new qmp0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30754a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new mhp0((byte) 13)), maz.a(wezVar, new mhp0((byte) 14)), null, null, maz.a(wezVar, new mhp0((byte) 15))};
    }

    public /* synthetic */ rmp0(int i, List list, List list2, Integer num, Integer num2, List list3) {
        if ((i & 1) == 0) {
            this.f30754a = null;
        } else {
            this.f30754a = list;
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
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmp0)) {
            return false;
        }
        rmp0 rmp0Var = (rmp0) obj;
        return Intrinsics.d(this.f30754a, rmp0Var.f30754a) && Intrinsics.d(this.b, rmp0Var.b) && Intrinsics.d(this.c, rmp0Var.c) && Intrinsics.d(this.d, rmp0Var.d) && Intrinsics.d(this.e, rmp0Var.e);
    }

    public final int hashCode() {
        List list = this.f30754a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list3 = this.e;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("TeamTransferBaseResponse(players=", ", teamTransferValueResponse=", this.f30754a, ", sportId=", this.b);
        rz4.y(sbT, this.c, ", subSportId=", this.d, ", teams=");
        return dw9.r(sbT, this.e, Separators.RPAREN);
    }
}
