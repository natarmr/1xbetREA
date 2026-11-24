package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xb6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40586a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public xb6(String str, String str2, String str3, String str4, String str5, String str6) {
        brm0.B(str4, str5, str6);
        this.f40586a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb6)) {
            return false;
        }
        xb6 xb6Var = (xb6) obj;
        return this.f40586a.equals(xb6Var.f40586a) && this.b.equals(xb6Var.b) && this.c.equals(xb6Var.c) && Intrinsics.d(this.d, xb6Var.d) && Intrinsics.d(this.e, xb6Var.e) && Intrinsics.d(this.f, xb6Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f40586a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BestHeroHeroModel(id=", this.f40586a, ", image=", this.b, ", name=");
        f140.v(sbN, this.c, ", bestResult=", this.d, ", winRate=");
        return ua80.m(sbN, this.e, ", matchesCount=", this.f, Separators.RPAREN);
    }
}
