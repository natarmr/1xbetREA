package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class iq4 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15190a;
    public final String b;
    public final vq4 c;
    public final String d;
    public final String e;
    public final String f;
    public final va80 g;
    public final Date h;
    public final Date i;
    public final a860 j;
    public final String k;

    public iq4(String str, String str2, vq4 vq4Var, String str3, String str4, String str5, va80 va80Var, Date date, Date date2, a860 a860Var, String str6) {
        cs0.x(str, str2, str3, str5);
        this.f15190a = str;
        this.b = str2;
        this.c = vq4Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = va80Var;
        this.h = date;
        this.i = date2;
        this.j = a860Var;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq4)) {
            return false;
        }
        iq4 iq4Var = (iq4) obj;
        return Intrinsics.d(this.f15190a, iq4Var.f15190a) && Intrinsics.d(this.b, iq4Var.b) && this.c == iq4Var.c && Intrinsics.d(this.d, iq4Var.d) && this.e.equals(iq4Var.e) && Intrinsics.d(this.f, iq4Var.f) && this.g == iq4Var.g && this.h.equals(iq4Var.h) && this.i.equals(iq4Var.i) && this.j == iq4Var.j && this.k.equals(iq4Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + brm0.i(this.i, brm0.i(this.h, (this.g.hashCode() + ua80.b(ua80.b(ua80.b((this.c.hashCode() + ua80.b(this.f15190a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AuthenticatorHistoryUiItem(appGuid=", this.f15190a, ", operationApprovalId=", this.b, ", operationType=");
        sbN.append(this.c);
        sbN.append(", ip=");
        sbN.append(this.d);
        sbN.append(", operationSystemName=");
        f140.v(sbN, this.e, ", location=", this.f, ", operatingSystemType=");
        sbN.append(this.g);
        sbN.append(", createdAt=");
        sbN.append(this.h);
        sbN.append(", completedAt=");
        sbN.append(this.i);
        sbN.append(", status=");
        sbN.append(this.j);
        sbN.append(", systemAndLocationTitle=");
        return axq.n(sbN, this.k, Separators.RPAREN);
    }
}
