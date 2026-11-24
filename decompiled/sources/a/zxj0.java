package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zxj0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45162a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final double f;
    public final double g;
    public final String h;
    public final uoy i;
    public final long j;
    public final long k;
    public final boolean l;
    public final zfa0 m;

    public zxj0(long j, long j2, String str, String str2, String str3, double d, double d2, String str4, uoy uoyVar, long j3, long j4, boolean z, zfa0 zfa0Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        uoyVar.getClass();
        zfa0Var.getClass();
        this.f45162a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = d;
        this.g = d2;
        this.h = str4;
        this.i = uoyVar;
        this.j = j3;
        this.k = j4;
        this.l = z;
        this.m = zfa0Var;
    }

    public final String a(boolean z) {
        if (this.l) {
            return "SP";
        }
        if (!z) {
            String str = this.h;
            if (str.length() > 0) {
                return str;
            }
        }
        pn40 pn40Var = pn40.f27267a;
        return pn40.c(this.f, p3u0.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxj0)) {
            return false;
        }
        zxj0 zxj0Var = (zxj0) obj;
        return this.f45162a == zxj0Var.f45162a && this.b == zxj0Var.b && Intrinsics.d(this.c, zxj0Var.c) && Intrinsics.d(this.d, zxj0Var.d) && Intrinsics.d(this.e, zxj0Var.e) && Double.compare(this.f, zxj0Var.f) == 0 && Double.compare(this.g, zxj0Var.g) == 0 && Intrinsics.d(this.h, zxj0Var.h) && this.i == zxj0Var.i && this.j == zxj0Var.j && this.k == zxj0Var.k && this.l == zxj0Var.l && Intrinsics.d(this.m, zxj0Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + brm0.e(rw2.b(rw2.b(twn.d(this.i, ua80.b(brm0.d(this.g, brm0.d(this.f, ua80.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f45162a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f45162a, "SimpleBetZip(gameId=", ", playerId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        f140.v(sbQ, ", playerName=", this.d, ", groupName=", this.e);
        ohs0.A(sbQ, this.f, ", coefficient=", ", param=");
        hne.w(sbQ, this.g, ", coefV=", this.h);
        sbQ.append(", kind=");
        sbQ.append(this.i);
        sbQ.append(", betId=");
        sbQ.append(this.j);
        kng0.A(sbQ, ", groupId=", this.k, ", startingPrice=");
        sbQ.append(this.l);
        sbQ.append(", playersDuel=");
        sbQ.append(this.m);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
