package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class w3h {
    public static final v3h Companion = new v3h();
    public static final a8z[] j = {null, null, null, null, null, null, null, maz.a(wez.f39042a, new xng(29)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f38502a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Long e;
    public final Integer f;
    public final Integer g;
    public final List h;
    public final t3h i;

    public /* synthetic */ w3h(int i, Long l, Integer num, String str, String str2, Long l2, Integer num2, Integer num3, List list, t3h t3hVar) {
        if ((i & 1) == 0) {
            this.f38502a = null;
        } else {
            this.f38502a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
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
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = t3hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3h)) {
            return false;
        }
        w3h w3hVar = (w3h) obj;
        return Intrinsics.d(this.f38502a, w3hVar.f38502a) && Intrinsics.d(this.b, w3hVar.b) && Intrinsics.d(this.c, w3hVar.c) && Intrinsics.d(this.d, w3hVar.d) && Intrinsics.d(this.e, w3hVar.e) && Intrinsics.d(this.f, w3hVar.f) && Intrinsics.d(this.g, w3hVar.g) && Intrinsics.d(this.h, w3hVar.h) && Intrinsics.d(this.i, w3hVar.i);
    }

    public final int hashCode() {
        Long l = this.f38502a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        t3h t3hVar = this.i;
        return iHashCode8 + (t3hVar != null ? t3hVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f38502a, "CyberLolHeroesStatisticsResponse(heroId=", ", heroLevel=", ", heroName=");
        f140.v(sbQ, this.c, ", playerName=", this.d, ", respawnTimer=");
        brm0.A(this.f, this.e, ", positionX=", ", positionY=", sbQ);
        cs0.z(sbQ, this.g, ", items=", this.h, ", heroStatisticInfo=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
