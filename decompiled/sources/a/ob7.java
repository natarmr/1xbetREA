package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ob7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24963a;
    public final long b;
    public final long c;
    public final boolean d;
    public final double e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final double j;
    public final String k;
    public final List l;

    public ob7(long j, long j2, long j3, boolean z, double d, long j4, String str, boolean z2, boolean z3, double d2, String str2, iun iunVar) {
        str.getClass();
        str2.getClass();
        iunVar.getClass();
        this.f24963a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = d;
        this.f = j4;
        this.g = str;
        this.h = z2;
        this.i = z3;
        this.j = d2;
        this.k = str2;
        this.l = iunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob7)) {
            return false;
        }
        ob7 ob7Var = (ob7) obj;
        return this.f24963a == ob7Var.f24963a && this.b == ob7Var.b && this.c == ob7Var.c && this.d == ob7Var.d && Double.compare(this.e, ob7Var.e) == 0 && this.f == ob7Var.f && Intrinsics.d(this.g, ob7Var.g) && this.h == ob7Var.h && this.i == ob7Var.i && Double.compare(this.j, ob7Var.j) == 0 && Intrinsics.d(this.k, ob7Var.k) && Intrinsics.d(this.l, ob7Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ua80.b(brm0.d(this.j, brm0.e(brm0.e(ua80.b(rw2.b(brm0.d(this.e, brm0.e(rw2.b(rw2.b(Long.hashCode(this.f24963a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f24963a, "BetInfoModel(gameId=", ", groupId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", eventTypeId=", this.c, ", relation=");
        sbQ.append(this.d);
        sbQ.append(", param=");
        sbQ.append(this.e);
        kng0.A(sbQ, ", playerId=", this.f, ", betName=");
        brm0.C(this.g, ", block=", ", isBannedExpress=", sbQ, this.h);
        sbQ.append(this.i);
        sbQ.append(", coef=");
        sbQ.append(this.j);
        ua80.t(", coefView=", this.k, ", eventModel=", sbQ, this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
