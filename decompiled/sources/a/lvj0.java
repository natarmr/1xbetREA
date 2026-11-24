package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lvj0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20718a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final double f;
    public final String g;
    public final double h;
    public final uoy i;
    public final long j;
    public final long k;
    public final zfa0 l;

    public lvj0(long j, long j2, String str, String str2, String str3, double d, String str4, double d2, uoy uoyVar, long j3, long j4, zfa0 zfa0Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        uoyVar.getClass();
        zfa0Var.getClass();
        this.f20718a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = d;
        this.g = str4;
        this.h = d2;
        this.i = uoyVar;
        this.j = j3;
        this.k = j4;
        this.l = zfa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvj0)) {
            return false;
        }
        lvj0 lvj0Var = (lvj0) obj;
        return this.f20718a == lvj0Var.f20718a && this.b == lvj0Var.b && Intrinsics.d(this.c, lvj0Var.c) && Intrinsics.d(this.d, lvj0Var.d) && Intrinsics.d(this.e, lvj0Var.e) && Double.compare(this.f, lvj0Var.f) == 0 && Intrinsics.d(this.g, lvj0Var.g) && Double.compare(this.h, lvj0Var.h) == 0 && this.i == lvj0Var.i && this.j == lvj0Var.j && this.k == lvj0Var.k && Intrinsics.d(this.l, lvj0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + rw2.b(rw2.b(twn.d(this.i, brm0.d(this.h, ua80.b(brm0.d(this.f, ua80.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f20718a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31), 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f20718a, "SimpleBetInfo(gameId=", ", playerId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        f140.v(sbQ, ", playerName=", this.d, ", groupName=", this.e);
        ohs0.A(sbQ, this.f, ", coefficient=", ", coefficientName=");
        hne.A(sbQ, this.g, ", param=", this.h);
        sbQ.append(", kind=");
        sbQ.append(this.i);
        sbQ.append(", betId=");
        sbQ.append(this.j);
        kng0.A(sbQ, ", groupId=", this.k, ", playersDuelModel=");
        sbQ.append(this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
