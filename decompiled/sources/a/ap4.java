package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ap4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1232a;
    public final String b;
    public final vq4 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final va80 i;
    public final int j;
    public final Date k;
    public final Date l;

    public ap4(String str, String str2, vq4 vq4Var, String str3, String str4, String str5, String str6, String str7, va80 va80Var, int i, Date date, Date date2) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f1232a = str;
        this.b = str2;
        this.c = vq4Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = va80Var;
        this.j = i;
        this.k = date;
        this.l = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap4)) {
            return false;
        }
        ap4 ap4Var = (ap4) obj;
        return Intrinsics.d(this.f1232a, ap4Var.f1232a) && Intrinsics.d(this.b, ap4Var.b) && this.c == ap4Var.c && Intrinsics.d(this.d, ap4Var.d) && Intrinsics.d(this.e, ap4Var.e) && Intrinsics.d(this.f, ap4Var.f) && Intrinsics.d(this.g, ap4Var.g) && this.h.equals(ap4Var.h) && this.i == ap4Var.i && this.j == ap4Var.j && this.k.equals(ap4Var.k) && this.l.equals(ap4Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + brm0.i(this.k, twn.a(this.j, (this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.c.hashCode() + ua80.b(this.f1232a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AuthenticatorApprovalItemV2Model(appGuid=", this.f1232a, ", operationApprovalId=", this.b, ", operationType=");
        sbN.append(this.c);
        sbN.append(", decryptedCode=");
        sbN.append(this.d);
        sbN.append(", randomString=");
        f140.v(sbN, this.e, ", ip=", this.f, ", location=");
        f140.v(sbN, this.g, ", operationSystemName=", this.h, ", operatingSystemType=");
        sbN.append(this.i);
        sbN.append(", expiryTimeSec=");
        sbN.append(this.j);
        sbN.append(", createdAt=");
        sbN.append(this.k);
        sbN.append(", expiredAt=");
        sbN.append(this.l);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
