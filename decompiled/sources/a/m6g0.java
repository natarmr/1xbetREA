package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class m6g0 {
    public static final l6g0 Companion = new l6g0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21269a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final h8g0 e;

    static {
        g8g0 g8g0Var = h8g0.Companion;
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new j6g0((byte) 0)), maz.a(wezVar, new j6g0((byte) 1)), null, null, null};
    }

    public /* synthetic */ m6g0(int i, List list, List list2, Integer num, Integer num2, h8g0 h8g0Var) {
        if ((i & 1) == 0) {
            this.f21269a = null;
        } else {
            this.f21269a = list;
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
            this.e = h8g0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6g0)) {
            return false;
        }
        m6g0 m6g0Var = (m6g0) obj;
        return Intrinsics.d(this.f21269a, m6g0Var.f21269a) && Intrinsics.d(this.b, m6g0Var.b) && Intrinsics.d(this.c, m6g0Var.c) && Intrinsics.d(this.d, m6g0Var.d) && Intrinsics.d(this.e, m6g0Var.e);
    }

    public final int hashCode() {
        List list = this.f21269a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        h8g0 h8g0Var = this.e;
        return iHashCode4 + (h8g0Var != null ? h8g0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("ResultsGridBaseResponse(teams=", ", players=", this.f21269a, ", sportId=", this.b);
        rz4.y(sbT, this.c, ", subSportId=", this.d, ", response=");
        sbT.append(this.e);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
