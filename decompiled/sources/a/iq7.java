package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iq7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15195a;
    public final double b;
    public final long c;
    public final double d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final th7 i;
    public final uoy j;
    public final String k;
    public final String l;
    public final izc m;
    public final cfo n;

    public iq7(long j, double d, long j2, double d2, boolean z, String str, String str2, String str3, cfo cfoVar, int i) {
        cfo cfoVar2;
        long j3 = (i & 1) != 0 ? 0L : j;
        double d3 = (i & 2) != 0 ? 0.0d : d;
        long j4 = (i & 4) == 0 ? j2 : 0L;
        double d4 = (i & 8) == 0 ? d2 : 0.0d;
        boolean z2 = (i & 32) != 0 ? false : z;
        String str4 = (i & 64) != 0 ? "" : str;
        th7 th7Var = new th7();
        uoy uoyVar = uoy.LINE;
        String str5 = (i & 32768) != 0 ? "" : str2;
        String str6 = (i & 65536) != 0 ? "" : str3;
        izc izcVar = izc.d;
        if ((i & 2097152) != 0) {
            iun iunVar = iun.f15405a;
            cfoVar2 = new cfo(iunVar, iunVar);
        } else {
            cfoVar2 = cfoVar;
        }
        this.f15195a = j3;
        this.b = d3;
        this.c = j4;
        this.d = d4;
        this.e = "";
        this.f = z2;
        this.g = str4;
        this.h = "";
        this.i = th7Var;
        this.j = uoyVar;
        this.k = str5;
        this.l = str6;
        this.m = izcVar;
        this.n = cfoVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!iq7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        iq7 iq7Var = (iq7) obj;
        return this.f15195a == iq7Var.f15195a && this.c == iq7Var.c && this.d == iq7Var.d && Intrinsics.d(this.i, iq7Var.i);
    }

    public final int hashCode() {
        int iD = brm0.d(this.d, ((((int) this.f15195a) * 31) + ((int) this.c)) * 31, 31);
        th7 th7Var = this.i;
        return iD + (th7Var != null ? th7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15195a, "BetZipModel(id=", ", coef=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", groupId=", this.c, ", param=");
        hne.w(sbQ, this.d, ", paramStr=", this.e);
        hne.u(", blocked=", ", coefV=", this.g, sbQ, this.f);
        sbQ.append(", marketName=");
        sbQ.append(this.h);
        sbQ.append(", player=");
        sbQ.append(this.i);
        sbQ.append(", eventId=0, marketId=0, kind=");
        sbQ.append(this.j);
        sbQ.append(", gameId=0, isRelation=0, playerId=0, name=");
        sbQ.append(this.k);
        sbQ.append(", groupName=");
        sbQ.append(this.l);
        sbQ.append(", coefState=");
        sbQ.append(this.m);
        sbQ.append(", isTracked=false, startingPrice=false, addedToCoupon=false, eventParams=");
        sbQ.append(this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
