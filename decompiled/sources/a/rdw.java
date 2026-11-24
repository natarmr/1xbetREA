package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class rdw {
    public static final qdw Companion = new qdw();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new kdw(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f30308a;
    public final String b;
    public final String c;
    public final Long d;
    public final Integer e;
    public final List f;

    public /* synthetic */ rdw(int i, Long l, String str, String str2, Long l2, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f30308a = null;
        } else {
            this.f30308a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
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
        if (!(obj instanceof rdw)) {
            return false;
        }
        rdw rdwVar = (rdw) obj;
        return Intrinsics.d(this.f30308a, rdwVar.f30308a) && Intrinsics.d(this.b, rdwVar.b) && Intrinsics.d(this.c, rdwVar.c) && Intrinsics.d(this.d, rdwVar.d) && Intrinsics.d(this.e, rdwVar.e) && Intrinsics.d(this.f, rdwVar.f);
    }

    public final int hashCode() {
        Long l = this.f30308a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f30308a, "HltvAwardsNomineesResponse(id=", ", name=", this.b, ", playerImage=");
        h97.w(this.d, this.c, ", playerFeedId=", ", place=", sbS);
        sbS.append(this.e);
        sbS.append(", statInfo=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
