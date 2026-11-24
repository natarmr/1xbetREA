package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nmg {
    public static final mmg Companion = new mmg();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23770a;
    public final l8h b;
    public final l8h c;
    public final Integer d;
    public final Long e;
    public final Long f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;

    static {
        k8h k8hVar = l8h.Companion;
        wez wezVar = wez.f39042a;
        l = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new jcg((byte) 22)), maz.a(wezVar, new jcg((byte) 23)), maz.a(wezVar, new jcg((byte) 24)), maz.a(wezVar, new jcg((byte) 25)), maz.a(wezVar, new jcg((byte) 26))};
    }

    public /* synthetic */ nmg(int i, Long l2, l8h l8hVar, l8h l8hVar2, Integer num, Long l3, Long l4, List list, List list2, List list3, List list4, List list5) {
        if ((i & 1) == 0) {
            this.f23770a = null;
        } else {
            this.f23770a = l2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l8hVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l8hVar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmg)) {
            return false;
        }
        nmg nmgVar = (nmg) obj;
        return Intrinsics.d(this.f23770a, nmgVar.f23770a) && Intrinsics.d(this.b, nmgVar.b) && Intrinsics.d(this.c, nmgVar.c) && Intrinsics.d(this.d, nmgVar.d) && Intrinsics.d(this.e, nmgVar.e) && Intrinsics.d(this.f, nmgVar.f) && Intrinsics.d(this.g, nmgVar.g) && Intrinsics.d(this.h, nmgVar.h) && Intrinsics.d(this.i, nmgVar.i) && Intrinsics.d(this.j, nmgVar.j) && Intrinsics.d(this.k, nmgVar.k);
    }

    public final int hashCode() {
        Long l2 = this.f23770a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        l8h l8hVar = this.b;
        int iHashCode2 = (iHashCode + (l8hVar == null ? 0 : l8hVar.hashCode())) * 31;
        l8h l8hVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (l8hVar2 == null ? 0 : l8hVar2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.i;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.j;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.k;
        return iHashCode10 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberDotaMatchesStatisticMatchResponse(matchId=");
        sb.append(this.f23770a);
        sb.append(", radiantTeam=");
        sb.append(this.b);
        sb.append(", direTeam=");
        sb.append(this.c);
        sb.append(", durationSeconds=");
        sb.append(this.d);
        sb.append(", startTimestamp=");
        cs0.A(sb, this.e, ", endTimestamp=", this.f, ", netWorthGraph=");
        b1j.y(", expGraph=", ", winRateGraph=", sb, this.g, this.h);
        b1j.y(", pickBans=", ", gameLog=", sb, this.i, this.j);
        return dw9.r(sb, this.k, Separators.RPAREN);
    }
}
