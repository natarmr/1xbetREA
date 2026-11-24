package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class p4h {
    public static final o4h Companion = new o4h();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f26352a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final t4h f;
    public final t4h g;
    public final j3h h;
    public final Long i;
    public final Map j;

    static {
        s4h s4hVar = t4h.Companion;
        k = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new x3h((byte) 2))};
    }

    public /* synthetic */ p4h(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, t4h t4hVar, t4h t4hVar2, j3h j3hVar, Long l, Map map) {
        if ((i & 1) == 0) {
            this.f26352a = null;
        } else {
            this.f26352a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = t4hVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = t4hVar2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = j3hVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4h)) {
            return false;
        }
        p4h p4hVar = (p4h) obj;
        return Intrinsics.d(this.f26352a, p4hVar.f26352a) && Intrinsics.d(this.b, p4hVar.b) && Intrinsics.d(this.c, p4hVar.c) && Intrinsics.d(this.d, p4hVar.d) && Intrinsics.d(this.e, p4hVar.e) && Intrinsics.d(this.f, p4hVar.f) && Intrinsics.d(this.g, p4hVar.g) && Intrinsics.d(this.h, p4hVar.h) && Intrinsics.d(this.i, p4hVar.i) && Intrinsics.d(this.j, p4hVar.j);
    }

    public final int hashCode() {
        Integer num = this.f26352a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        t4h t4hVar = this.f;
        int iHashCode6 = (iHashCode5 + (t4hVar == null ? 0 : t4hVar.hashCode())) * 31;
        t4h t4hVar2 = this.g;
        int iHashCode7 = (iHashCode6 + (t4hVar2 == null ? 0 : t4hVar2.hashCode())) * 31;
        j3h j3hVar = this.h;
        int iHashCode8 = (iHashCode7 + (j3hVar == null ? 0 : j3hVar.hashCode())) * 31;
        Long l = this.i;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.j;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberLolStatisticResponse(towerState=", this.f26352a, ", ingibitorsState=", this.b, ", nashorRespawnTimer=");
        rz4.y(sbQ, this.c, ", haraldRespawnTimer=", this.d, ", dragonRespawnTimer=");
        sbQ.append(this.e);
        sbQ.append(", firstTeamStatistic=");
        sbQ.append(this.f);
        sbQ.append(", secondTeamStatistic=");
        sbQ.append(this.g);
        sbQ.append(", gameStatus=");
        sbQ.append(this.h);
        sbQ.append(", dragonState=");
        sbQ.append(this.i);
        sbQ.append(", gameLog=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
