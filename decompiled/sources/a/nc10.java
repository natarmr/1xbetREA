package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nc10 implements a5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23269a;
    public final String b;
    public final rc10 c;
    public final String d;
    public final long e;
    public final double f;

    public nc10(String str, String str2, rc10 rc10Var, String str3, long j, double d) {
        nwd nwdVar = q4f.f28094a;
        str3.getClass();
        this.f23269a = str;
        this.b = str2;
        this.c = rc10Var;
        this.d = str3;
        this.e = j;
        this.f = d;
    }

    @Override // a.a5w
    public final jvw b() {
        return this.c;
    }

    @Override // a.a5w
    public final q4f c() {
        return q4f.z;
    }

    @Override // a.a5w
    public final String d() {
        return this.d;
    }

    @Override // a.a5w
    public final double e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc10)) {
            return false;
        }
        nc10 nc10Var = (nc10) obj;
        if (!this.f23269a.equals(nc10Var.f23269a) || !this.b.equals(nc10Var.b) || this.c != nc10Var.c || !Intrinsics.d(this.d, nc10Var.d)) {
            return false;
        }
        nwd nwdVar = q4f.f28094a;
        return Double.compare(0.0d, 0.0d) == 0 && this.e == nc10Var.e && Double.compare(0.0d, 0.0d) == 0 && Double.compare(this.f, nc10Var.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + brm0.d(0.0d, rw2.b(brm0.d(0.0d, vqd.b(q4f.z, ua80.b((this.c.hashCode() + ua80.b(this.f23269a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31), 31, this.e), 31);
    }

    public final String toString() {
        q4f q4fVar = q4f.z;
        StringBuilder sbN = b1j.n("LottoBetHistoryModel(currency=", this.f23269a, ", gameName=", this.b, ", status=");
        sbN.append(this.c);
        sbN.append(", betId=");
        sbN.append(this.d);
        sbN.append(", couponType=");
        sbN.append(q4fVar);
        sbN.append(", winSum=0.0, date=");
        sbN.append(this.e);
        return brm0.m(sbN, this.f, ", coefficient=0.0, betSum=", Separators.RPAREN);
    }
}
