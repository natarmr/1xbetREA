package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class rrf {
    public static final qrf Companion = new qrf();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30981a;
    public final Integer b;
    public final String c;
    public final Boolean d;
    public final Long e;
    public final Long f;
    public final List g;
    public final List h;

    static {
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new dpf((byte) 3)), maz.a(wezVar, new dpf((byte) 4))};
    }

    public /* synthetic */ rrf(int i2, Integer num, Integer num2, String str, Boolean bool, Long l, Long l2, List list, List list2) {
        if ((i2 & 1) == 0) {
            this.f30981a = null;
        } else {
            this.f30981a = num;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrf)) {
            return false;
        }
        rrf rrfVar = (rrf) obj;
        return Intrinsics.d(this.f30981a, rrfVar.f30981a) && Intrinsics.d(this.b, rrfVar.b) && Intrinsics.d(this.c, rrfVar.c) && Intrinsics.d(this.d, rrfVar.d) && Intrinsics.d(this.e, rrfVar.e) && Intrinsics.d(this.f, rrfVar.f) && Intrinsics.d(this.g, rrfVar.g) && Intrinsics.d(this.h, rrfVar.h);
    }

    public final int hashCode() {
        Integer num = this.f30981a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("Cs2StatisticResponse(currentRound=", this.f30981a, ", stateRound=", this.b, ", mapName=");
        h97.v(this.d, this.c, ", hasBomb=", ", bombTimer=", sbQ);
        cs0.A(sbQ, this.e, ", timer=", this.f, ", listLogJson=");
        return kng0.n(", matchInfo=", Separators.RPAREN, sbQ, this.g, this.h);
    }
}
