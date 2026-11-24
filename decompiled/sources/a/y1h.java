package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class y1h {
    public static final x1h Companion = new x1h();
    public static final a8z[] g = {null, null, null, maz.a(wez.f39042a, new xng(27)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41854a;
    public final Integer b;
    public final Long c;
    public final List d;
    public final String e;
    public final Long f;

    public /* synthetic */ y1h(int i, Integer num, Integer num2, Long l, List list, String str, Long l2) {
        if ((i & 1) == 0) {
            this.f41854a = null;
        } else {
            this.f41854a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1h)) {
            return false;
        }
        y1h y1hVar = (y1h) obj;
        return Intrinsics.d(this.f41854a, y1hVar.f41854a) && Intrinsics.d(this.b, y1hVar.b) && Intrinsics.d(this.c, y1hVar.c) && Intrinsics.d(this.d, y1hVar.d) && Intrinsics.d(this.e, y1hVar.e) && Intrinsics.d(this.f, y1hVar.f);
    }

    public final int hashCode() {
        Integer num = this.f41854a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberLastMatchesInfoResponse(score1=", this.f41854a, ", score2=", this.b, ", dateStart=");
        twn.z(sbQ, this.c, ", periods=", this.d, ", tournamentTitle=");
        sbQ.append(this.e);
        sbQ.append(", champId=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
