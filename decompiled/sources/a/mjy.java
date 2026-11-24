package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mjy {
    public static final ljy Companion = new ljy();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21918a;
    public final List b;
    public final Long c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new pcy((byte) 3)), maz.a(wezVar, new pcy((byte) 4)), null, maz.a(wezVar, new pcy((byte) 5))};
    }

    public /* synthetic */ mjy(int i, List list, List list2, Long l, List list3) {
        if ((i & 1) == 0) {
            this.f21918a = null;
        } else {
            this.f21918a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjy)) {
            return false;
        }
        mjy mjyVar = (mjy) obj;
        return Intrinsics.d(this.f21918a, mjyVar.f21918a) && Intrinsics.d(this.b, mjyVar.b) && Intrinsics.d(this.c, mjyVar.c) && Intrinsics.d(this.d, mjyVar.d);
    }

    public final int hashCode() {
        List list = this.f21918a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List list3 = this.d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("KabaddiTopPlayersResponse(teams=", ", players=", this.f21918a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", info=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
