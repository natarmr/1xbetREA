package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wm9 {
    public static final vm9 Companion = new vm9();
    public static final a8z[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39393a;
    public final String b;
    public final Integer c;
    public final List d;
    public final List e;
    public final List f;

    static {
        wez wezVar = wez.f39042a;
        g = new a8z[]{null, null, null, maz.a(wezVar, new ej8((byte) 26)), maz.a(wezVar, new ej8((byte) 27)), maz.a(wezVar, new ej8((byte) 28))};
    }

    public /* synthetic */ wm9(int i, String str, String str2, Integer num, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f39393a = null;
        } else {
            this.f39393a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm9)) {
            return false;
        }
        wm9 wm9Var = (wm9) obj;
        return Intrinsics.d(this.f39393a, wm9Var.f39393a) && Intrinsics.d(this.b, wm9Var.b) && Intrinsics.d(this.c, wm9Var.c) && Intrinsics.d(this.d, wm9Var.d) && Intrinsics.d(this.e, wm9Var.e) && Intrinsics.d(this.f, wm9Var.f);
    }

    public final int hashCode() {
        String str = this.f39393a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CalendarTournamentGroupSwissResponse(id=", this.f39393a, ", record=", this.b, ", index=");
        cs0.z(sbN, this.c, ", fromGroupWinners=", this.d, ", fromGroupLosers=");
        return kng0.n(", matches=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
