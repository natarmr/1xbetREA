package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xm6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41107a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public xm6(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.f41107a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm6)) {
            return false;
        }
        xm6 xm6Var = (xm6) obj;
        return Intrinsics.d(this.f41107a, xm6Var.f41107a) && this.b.equals(xm6Var.b) && this.c == xm6Var.c && Intrinsics.d(this.d, xm6Var.d) && this.e.equals(xm6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, ua80.b(this.f41107a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetCardHeaderUiModel(counterValue=", this.f41107a, ", sportIconUrl=", this.b, ", sportIconPlaceHolder=");
        kng0.w(this.c, ", date=", this.d, ", quarter=", sbN);
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
