package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hcp {
    public static final fcp Companion = new fcp();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12834a;
    public final List b;
    public final List c;
    public final m7p d;
    public final String e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new r4p((byte) 19)), maz.a(wezVar, new r4p((byte) 20)), maz.a(wezVar, new r4p((byte) 21)), null, null};
    }

    public /* synthetic */ hcp(int i, List list, List list2, List list3, m7p m7pVar, String str) {
        if ((i & 1) == 0) {
            this.f12834a = null;
        } else {
            this.f12834a = list;
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
            this.d = m7pVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcp)) {
            return false;
        }
        hcp hcpVar = (hcp) obj;
        return Intrinsics.d(this.f12834a, hcpVar.f12834a) && Intrinsics.d(this.b, hcpVar.b) && Intrinsics.d(this.c, hcpVar.c) && Intrinsics.d(this.d, hcpVar.d) && Intrinsics.d(this.e, hcpVar.e);
    }

    public final int hashCode() {
        List list = this.f12834a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        m7p m7pVar = this.d;
        int iHashCode4 = (iHashCode3 + (m7pVar == null ? 0 : m7pVar.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("FavoriteResponse(champs=", ", games=", this.f12834a, ", teams=", this.b);
        sbT.append(this.c);
        sbT.append(", configuration=");
        sbT.append(this.d);
        sbT.append(", favoriteId=");
        return axq.n(sbT, this.e, Separators.RPAREN);
    }
}
