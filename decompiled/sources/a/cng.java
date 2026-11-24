package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cng {
    public static final bng Companion = new bng();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new jcg(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgh f4653a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final List f;

    public /* synthetic */ cng(int i, bgh bghVar, Long l, Long l2, Long l3, Long l4, List list) {
        if ((i & 1) == 0) {
            this.f4653a = null;
        } else {
            this.f4653a = bghVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l4;
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
        if (!(obj instanceof cng)) {
            return false;
        }
        cng cngVar = (cng) obj;
        return Intrinsics.d(this.f4653a, cngVar.f4653a) && Intrinsics.d(this.b, cngVar.b) && Intrinsics.d(this.c, cngVar.c) && Intrinsics.d(this.d, cngVar.d) && Intrinsics.d(this.e, cngVar.e) && Intrinsics.d(this.f, cngVar.f);
    }

    public final int hashCode() {
        bgh bghVar = this.f4653a;
        int iHashCode = (bghVar == null ? 0 : bghVar.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberDotaStatisticDetailsResponse(gameStatus=");
        sb.append(this.f4653a);
        sb.append(", roshanRespawnTimer=");
        sb.append(this.b);
        sb.append(", towerState=");
        cs0.A(sb, this.c, ", tormentorRespawnTimer=", this.d, ", barrackState=");
        sb.append(this.e);
        sb.append(", picksList=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
