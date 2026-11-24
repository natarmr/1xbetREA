package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class i410 {
    public static final h410 Companion = new h410();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n510 f14123a;
    public final n510 b;
    public final Integer c;
    public final String d;
    public final Long e;
    public final List f;
    public final List g;
    public final List h;

    static {
        m510 m510Var = n510.Companion;
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, null, null, null, null, maz.a(wezVar, new t010((byte) 10)), maz.a(wezVar, new t010((byte) 11)), maz.a(wezVar, new t010((byte) 12))};
    }

    public /* synthetic */ i410(int i2, n510 n510Var, n510 n510Var2, Integer num, String str, Long l, List list, List list2, List list3) {
        if ((i2 & 1) == 0) {
            this.f14123a = null;
        } else {
            this.f14123a = n510Var;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = n510Var2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i410)) {
            return false;
        }
        i410 i410Var = (i410) obj;
        return Intrinsics.d(this.f14123a, i410Var.f14123a) && Intrinsics.d(this.b, i410Var.b) && Intrinsics.d(this.c, i410Var.c) && Intrinsics.d(this.d, i410Var.d) && Intrinsics.d(this.e, i410Var.e) && Intrinsics.d(this.f, i410Var.f) && Intrinsics.d(this.g, i410Var.g) && Intrinsics.d(this.h, i410Var.h);
    }

    public final int hashCode() {
        n510 n510Var = this.f14123a;
        int iHashCode = (n510Var == null ? 0 : n510Var.hashCode()) * 31;
        n510 n510Var2 = this.b;
        int iHashCode2 = (iHashCode + (n510Var2 == null ? 0 : n510Var2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.h;
        return iHashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LolStatisticMatchesMatchResponse(blueTeam=");
        sb.append(this.f14123a);
        sb.append(", redTeam=");
        sb.append(this.b);
        sb.append(", durationSeconds=");
        b1j.u(this.c, ", startedAt=", this.d, ", endTimestamp=", sb);
        twn.z(sb, this.e, ", netWorthGraph=", this.f, ", expGraph=");
        return kng0.n(", objectKills=", Separators.RPAREN, sb, this.g, this.h);
    }
}
