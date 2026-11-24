package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xq20 implements iqg {
    public static final wq20 Companion = new wq20();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f41294a;
    public final Long b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{null, null, null, null, maz.a(wezVar, new sv10((byte) 20)), maz.a(wezVar, new sv10((byte) 21)), maz.a(wezVar, new sv10((byte) 22))};
    }

    public /* synthetic */ xq20(int i, Long l, Long l2, String str, String str2, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f41294a = null;
        } else {
            this.f41294a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq20)) {
            return false;
        }
        xq20 xq20Var = (xq20) obj;
        return Intrinsics.d(this.f41294a, xq20Var.f41294a) && Intrinsics.d(this.b, xq20Var.b) && Intrinsics.d(this.c, xq20Var.c) && Intrinsics.d(this.d, xq20Var.d) && Intrinsics.d(this.e, xq20Var.e) && Intrinsics.d(this.f, xq20Var.f) && Intrinsics.d(this.g, xq20Var.g);
    }

    public final int hashCode() {
        Long l = this.f41294a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.g;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f41294a, this.b, "MarbleGamesResponse(firstTeamId=", ", secondTeamId=", ", firstTeamName=");
        f140.v(sbO, this.c, ", secondTeamName=", this.d, ", firstTeamImage=");
        b1j.y(", secondTeamImage=", ", periodScores=", sbO, this.e, this.f);
        return dw9.r(sbO, this.g, Separators.RPAREN);
    }

    public xq20() {
        this.f41294a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
