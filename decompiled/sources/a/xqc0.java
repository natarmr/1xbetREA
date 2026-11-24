package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xqc0 implements yqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41311a;
    public final String b;
    public final String c;
    public final String d;

    public xqc0(String str, String str2, String str3, String str4) {
        brm0.B(str2, str3, str4);
        this.f41311a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqc0)) {
            return false;
        }
        xqc0 xqc0Var = (xqc0) obj;
        return this.f41311a.equals(xqc0Var.f41311a) && Intrinsics.d(this.b, xqc0Var.b) && Intrinsics.d(this.c, xqc0Var.c) && Intrinsics.d(this.d, xqc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f41311a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("ShowPromoBoughtMessage(promoCode=", this.f41311a, ", promoCodeMessage=", this.b, ", title="), this.c, ", positiveTextButton=", this.d, Separators.RPAREN);
    }
}
