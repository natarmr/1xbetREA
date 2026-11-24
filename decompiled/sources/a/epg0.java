package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class epg0 implements iqg {
    public static final dpg0 Companion = new dpg0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8188a;
    public final List b;
    public final List c;
    public final Integer d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new j6g0((byte) 18)), maz.a(wezVar, new j6g0((byte) 19)), maz.a(wezVar, new j6g0((byte) 20)), null};
    }

    public /* synthetic */ epg0(int i, Integer num, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f8188a = null;
        } else {
            this.f8188a = list;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epg0)) {
            return false;
        }
        epg0 epg0Var = (epg0) obj;
        return Intrinsics.d(this.f8188a, epg0Var.f8188a) && Intrinsics.d(this.b, epg0Var.b) && Intrinsics.d(this.c, epg0Var.c) && Intrinsics.d(this.d, epg0Var.d);
    }

    public final int hashCode() {
        List list = this.f8188a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("RussianLottoResponse(firstPlayerParams=", ", secondPlayerParams=", this.f8188a, ", numsPlayed=", this.b);
        sbT.append(this.c);
        sbT.append(", result=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }

    public epg0() {
        this.f8188a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
