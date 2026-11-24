package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class t9h {
    public static final s9h Companion = new s9h();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9h f33562a;
    public final w9h b;
    public final e9h c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final List g;

    static {
        v9h v9hVar = w9h.Companion;
        h = new a8z[]{null, null, null, null, null, null, maz.a(wez.f39042a, new x3h((byte) 23))};
    }

    public /* synthetic */ t9h(int i, w9h w9hVar, w9h w9hVar2, e9h e9hVar, Long l, Long l2, Long l3, List list) {
        if ((i & 1) == 0) {
            this.f33562a = null;
        } else {
            this.f33562a = w9hVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = w9hVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = e9hVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9h)) {
            return false;
        }
        t9h t9hVar = (t9h) obj;
        return Intrinsics.d(this.f33562a, t9hVar.f33562a) && Intrinsics.d(this.b, t9hVar.b) && Intrinsics.d(this.c, t9hVar.c) && Intrinsics.d(this.d, t9hVar.d) && Intrinsics.d(this.e, t9hVar.e) && Intrinsics.d(this.f, t9hVar.f) && Intrinsics.d(this.g, t9hVar.g);
    }

    public final int hashCode() {
        w9h w9hVar = this.f33562a;
        int iHashCode = (w9hVar == null ? 0 : w9hVar.hashCode()) * 31;
        w9h w9hVar2 = this.b;
        int iHashCode2 = (iHashCode + (w9hVar2 == null ? 0 : w9hVar2.hashCode())) * 31;
        e9h e9hVar = this.c;
        int iHashCode3 = (iHashCode2 + (e9hVar == null ? 0 : e9hVar.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberMlbbStatisticResponse(firstTeamStatistic=");
        sb.append(this.f33562a);
        sb.append(", secondTeamStatistic=");
        sb.append(this.b);
        sb.append(", gameStatus=");
        sb.append(this.c);
        sb.append(", towerState=");
        sb.append(this.d);
        sb.append(", turtleRespawnTimer=");
        cs0.A(sb, this.e, ", lordRespawnTimer=", this.f, ", draft=");
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
