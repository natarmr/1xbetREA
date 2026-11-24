package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class y0h {
    public static final x0h Companion = new x0h();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41804a;
    public final Integer b;
    public final Integer c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;

    static {
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, null, null, maz.a(wezVar, new xng((byte) 19)), maz.a(wezVar, new xng((byte) 20)), maz.a(wezVar, new xng((byte) 21)), maz.a(wezVar, new xng((byte) 22)), maz.a(wezVar, new xng((byte) 23))};
    }

    public /* synthetic */ y0h(int i2, Integer num, Integer num2, Integer num3, List list, List list2, List list3, List list4, List list5) {
        if ((i2 & 1) == 0) {
            this.f41804a = null;
        } else {
            this.f41804a = num;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list4;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0h)) {
            return false;
        }
        y0h y0hVar = (y0h) obj;
        return Intrinsics.d(this.f41804a, y0hVar.f41804a) && Intrinsics.d(this.b, y0hVar.b) && Intrinsics.d(this.c, y0hVar.c) && Intrinsics.d(this.d, y0hVar.d) && Intrinsics.d(this.e, y0hVar.e) && Intrinsics.d(this.f, y0hVar.f) && Intrinsics.d(this.g, y0hVar.g) && Intrinsics.d(this.h, y0hVar.h);
    }

    public final int hashCode() {
        Integer num = this.f41804a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.g;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.h;
        return iHashCode7 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberHeadToHeadResponse(firstTeamWinCount=", this.f41804a, ", secondTeamWinCount=", this.b, ", overTimesCount=");
        cs0.z(sbQ, this.c, ", games=", this.d, ", teamFirstGames=");
        b1j.y(", teamSecondGames=", ", teamFirstFutureGames=", sbQ, this.e, this.f);
        return kng0.n(", teamSecondFutureGames=", Separators.RPAREN, sbQ, this.g, this.h);
    }
}
