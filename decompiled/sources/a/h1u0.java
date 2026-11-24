package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class h1u0 {
    public static final g1u0 Companion = new g1u0();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new tht0(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12302a;
    public final Long b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final List f;

    public /* synthetic */ h1u0(int i, Integer num, Long l, String str, String str2, Boolean bool, List list) {
        if ((i & 1) == 0) {
            this.f12302a = null;
        } else {
            this.f12302a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
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
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1u0)) {
            return false;
        }
        h1u0 h1u0Var = (h1u0) obj;
        return Intrinsics.d(this.f12302a, h1u0Var.f12302a) && Intrinsics.d(this.b, h1u0Var.b) && Intrinsics.d(this.c, h1u0Var.c) && Intrinsics.d(this.d, h1u0Var.d) && Intrinsics.d(this.e, h1u0Var.e) && Intrinsics.d(this.f, h1u0Var.f);
    }

    public final int hashCode() {
        Integer num = this.f12302a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f12302a, this.b, "ValorantStatisticMatchesTeamResponse(id=", ", feedId=", ", name=");
        f140.v(sbM, this.c, ", image=", this.d, ", isPartner=");
        sbM.append(this.e);
        sbM.append(", players=");
        sbM.append(this.f);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
