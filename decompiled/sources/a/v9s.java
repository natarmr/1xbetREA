package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;

/* JADX INFO: loaded from: classes6.dex */
public final class v9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37049a;
    public final double b;
    public final long c;
    public final double d;
    public final String e;
    public final BigDecimal f;
    public final boolean g;
    public final String h;
    public final String i;
    public final BetPlayerZip j;
    public final Integer k;
    public final Long l;
    public final Integer m;
    public final uoy n;
    public final Long o;
    public final Integer p;
    public final Long q;
    public final Boolean r;
    public final Long s;
    public final Boolean t;
    public final PlayersDuelZip u;
    public final Integer v;
    public final EventParams w;

    public v9s(long j, double d, long j2, double d2, String str, BigDecimal bigDecimal, boolean z, String str2, String str3, BetPlayerZip betPlayerZip, Integer num, Long l, Integer num2, uoy uoyVar, Long l2, Integer num3, Long l3, Boolean bool, Long l4, Boolean bool2, PlayersDuelZip playersDuelZip, Integer num4, EventParams eventParams) {
        this.f37049a = j;
        this.b = d;
        this.c = j2;
        this.d = d2;
        this.e = str;
        this.f = bigDecimal;
        this.g = z;
        this.h = str2;
        this.i = str3;
        this.j = betPlayerZip;
        this.k = num;
        this.l = l;
        this.m = num2;
        this.n = uoyVar;
        this.o = l2;
        this.p = num3;
        this.q = l3;
        this.r = bool;
        this.s = l4;
        this.t = bool2;
        this.u = playersDuelZip;
        this.v = num4;
        this.w = eventParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9s)) {
            return false;
        }
        v9s v9sVar = (v9s) obj;
        return this.f37049a == v9sVar.f37049a && Double.compare(this.b, v9sVar.b) == 0 && this.c == v9sVar.c && Double.compare(this.d, v9sVar.d) == 0 && Intrinsics.d(this.e, v9sVar.e) && this.f.equals(v9sVar.f) && this.g == v9sVar.g && Intrinsics.d(this.h, v9sVar.h) && Intrinsics.d(this.i, v9sVar.i) && Intrinsics.d(this.j, v9sVar.j) && Intrinsics.d(this.k, v9sVar.k) && Intrinsics.d(this.l, v9sVar.l) && Intrinsics.d(this.m, v9sVar.m) && this.n == v9sVar.n && Intrinsics.d(this.o, v9sVar.o) && Intrinsics.d(this.p, v9sVar.p) && Intrinsics.d(this.q, v9sVar.q) && Intrinsics.d(this.r, v9sVar.r) && Intrinsics.d(this.s, v9sVar.s) && Intrinsics.d(this.t, v9sVar.t) && Intrinsics.d(this.u, v9sVar.u) && Intrinsics.d(this.v, v9sVar.v) && this.w.equals(v9sVar.w);
    }

    public final int hashCode() {
        int iD = brm0.d(this.d, rw2.b(brm0.d(this.b, Long.hashCode(this.f37049a) * 31, 31), 31, this.c), 31);
        String str = this.e;
        int iE = brm0.e(axq.a((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        BetPlayerZip betPlayerZip = this.j;
        int iHashCode3 = (iHashCode2 + (betPlayerZip == null ? 0 : betPlayerZip.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.l;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.m;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        uoy uoyVar = this.n;
        int iHashCode7 = (iHashCode6 + (uoyVar == null ? 0 : uoyVar.hashCode())) * 31;
        Long l2 = this.o;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.p;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l3 = this.q;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.r;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l4 = this.s;
        int iHashCode12 = (iHashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool2 = this.t;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PlayersDuelZip playersDuelZip = this.u;
        int iHashCode14 = (iHashCode13 + (playersDuelZip == null ? 0 : playersDuelZip.hashCode())) * 31;
        Integer num4 = this.v;
        return this.w.hashCode() + ((iHashCode14 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f37049a, "GameEventBetModel(typeId=", ", coef=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", groupId=", this.c, ", param=");
        hne.w(sbQ, this.d, ", paramStr=", this.e);
        sbQ.append(", paramBigDecimal=");
        sbQ.append(this.f);
        sbQ.append(", blocked=");
        sbQ.append(this.g);
        f140.v(sbQ, ", coefV=", this.h, ", marketName=", this.i);
        sbQ.append(", player=");
        sbQ.append(this.j);
        sbQ.append(", eventId=");
        sbQ.append(this.k);
        sbQ.append(", marketId=");
        sbQ.append(this.l);
        sbQ.append(", availableSum=");
        sbQ.append(this.m);
        sbQ.append(", kind=");
        sbQ.append(this.n);
        sbQ.append(", gameId=");
        sbQ.append(this.o);
        sbQ.append(", isRelation=");
        sbQ.append(this.p);
        sbQ.append(", playerId=");
        sbQ.append(this.q);
        sbQ.append(", gameFinished=");
        sbQ.append(this.r);
        sbQ.append(", subSportId=");
        sbQ.append(this.s);
        sbQ.append(", bannedExpress=");
        sbQ.append(this.t);
        sbQ.append(", playersDuelZip=");
        sbQ.append(this.u);
        sbQ.append(", center=");
        sbQ.append(this.v);
        sbQ.append(", eventParams=");
        sbQ.append(this.w);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
