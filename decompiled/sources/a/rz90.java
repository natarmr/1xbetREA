package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rz90 {
    public static final qz90 Companion = new qz90();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31348a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final wz90 e;

    static {
        vz90 vz90Var = wz90.Companion;
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new wm90((byte) 14)), maz.a(wezVar, new wm90((byte) 15)), null, null, null};
    }

    public /* synthetic */ rz90(int i, List list, List list2, Integer num, Integer num2, wz90 wz90Var) {
        if ((i & 1) == 0) {
            this.f31348a = null;
        } else {
            this.f31348a = list;
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
            this.e = wz90Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz90)) {
            return false;
        }
        rz90 rz90Var = (rz90) obj;
        return Intrinsics.d(this.f31348a, rz90Var.f31348a) && Intrinsics.d(this.b, rz90Var.b) && Intrinsics.d(this.c, rz90Var.c) && Intrinsics.d(this.d, rz90Var.d) && Intrinsics.d(this.e, rz90Var.e);
    }

    public final int hashCode() {
        List list = this.f31348a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        wz90 wz90Var = this.e;
        return iHashCode4 + (wz90Var != null ? wz90Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("PlayerCareerCommonResponse(teams=", ", tournaments=", this.f31348a, ", sportId=", this.b);
        rz4.y(sbT, this.c, ", subSportId=", this.d, ", responseInfo=");
        sbT.append(this.e);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
