package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hyt0 {
    public static final gyt0 Companion = new gyt0();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f13877a;
    public final Long b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final List f;
    public final List g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{null, null, null, null, null, maz.a(wezVar, new tht0((byte) 21)), maz.a(wezVar, new tht0((byte) 22))};
    }

    public /* synthetic */ hyt0(int i, Long l, Long l2, String str, Boolean bool, String str2, List list, List list2) {
        if ((i & 1) == 0) {
            this.f13877a = null;
        } else {
            this.f13877a = l;
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
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyt0)) {
            return false;
        }
        hyt0 hyt0Var = (hyt0) obj;
        return Intrinsics.d(this.f13877a, hyt0Var.f13877a) && Intrinsics.d(this.b, hyt0Var.b) && Intrinsics.d(this.c, hyt0Var.c) && Intrinsics.d(this.d, hyt0Var.d) && Intrinsics.d(this.e, hyt0Var.e) && Intrinsics.d(this.f, hyt0Var.f) && Intrinsics.d(this.g, hyt0Var.g);
    }

    public final int hashCode() {
        Long l = this.f13877a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f13877a, this.b, "ValorantPlayersCompositionResponse(id=", ", feedId=", ", teamName=");
        h97.v(this.d, this.c, ", partner=", ", teamImage=", sbO);
        cs0.y(this.e, ", players=", ", mapPool=", sbO, this.f);
        return dw9.r(sbO, this.g, Separators.RPAREN);
    }
}
