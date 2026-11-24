package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xo4 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41197a;
    public final Date b;
    public final String c;
    public final String d;
    public final double e;
    public final int f;
    public final String g;
    public final va80 h;
    public final String i;
    public final String j;
    public final vq4 k;
    public final String l;
    public final Date m;
    public final String n;

    public xo4(String str, Date date, String str2, String str3, double d, int i, String str4, va80 va80Var, String str5, String str6, vq4 vq4Var, String str7, Date date2, String str8) {
        ohs0.z(str, str2, str4, str5, str6);
        str7.getClass();
        this.f41197a = str;
        this.b = date;
        this.c = str2;
        this.d = str3;
        this.e = d;
        this.f = i;
        this.g = str4;
        this.h = va80Var;
        this.i = str5;
        this.j = str6;
        this.k = vq4Var;
        this.l = str7;
        this.m = date2;
        this.n = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo4)) {
            return false;
        }
        xo4 xo4Var = (xo4) obj;
        return Intrinsics.d(this.f41197a, xo4Var.f41197a) && this.b.equals(xo4Var.b) && Intrinsics.d(this.c, xo4Var.c) && this.d.equals(xo4Var.d) && Double.compare(this.e, xo4Var.e) == 0 && this.f == xo4Var.f && Intrinsics.d(this.g, xo4Var.g) && this.h == xo4Var.h && Intrinsics.d(this.i, xo4Var.i) && Intrinsics.d(this.j, xo4Var.j) && this.k == xo4Var.k && Intrinsics.d(this.l, xo4Var.l) && this.m.equals(xo4Var.m) && this.n.equals(xo4Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + brm0.i(this.m, ua80.b((this.k.hashCode() + ua80.b(ua80.b((this.h.hashCode() + ua80.b(twn.a(this.f, brm0.d(this.e, ua80.b(ua80.b(brm0.i(this.b, this.f41197a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31), 31), 31, this.g)) * 31, 31, this.i), 31, this.j)) * 31, 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthenticatorActiveUiItem(appGuid=");
        sb.append(this.f41197a);
        sb.append(", expiredAt=");
        sb.append(this.b);
        sb.append(", code=");
        f140.v(sb, this.c, ", timerText=", this.d, ", ratio=");
        rz4.w(sb, this.e, ", expiryTimeSec=", this.f);
        sb.append(", ip=");
        sb.append(this.g);
        sb.append(", operatingSystemType=");
        sb.append(this.h);
        f140.v(sb, ", location=", this.i, ", operationApprovalId=", this.j);
        sb.append(", operationType=");
        sb.append(this.k);
        sb.append(", randomString=");
        sb.append(this.l);
        sb.append(", createdAtDate=");
        sb.append(this.m);
        sb.append(", systemAndLocationTitle=");
        sb.append(this.n);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
