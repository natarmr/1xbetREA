package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class id4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14564a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public id4(int i, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f14564a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public static id4 a(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new id4(i, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id4)) {
            return false;
        }
        id4 id4Var = (id4) obj;
        return Intrinsics.d(this.f14564a, id4Var.f14564a) && Intrinsics.d(this.b, id4Var.b) && Intrinsics.d(this.c, id4Var.c) && this.d == id4Var.d && Intrinsics.d(this.e, id4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f14564a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Phone(phone=", this.f14564a, ", phoneMask=", this.b, ", phoneCode=");
        twn.w(this.d, this.c, ", phoneMaskMaxLength=", ", phoneCodeCountryImage=", sbN);
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
