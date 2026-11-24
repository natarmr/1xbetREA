package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xqr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41337a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;

    public xqr0(long j, String str, String str2, String str3, int i, List list) {
        str.getClass();
        list.getClass();
        this.f41337a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqr0)) {
            return false;
        }
        xqr0 xqr0Var = (xqr0) obj;
        return this.f41337a == xqr0Var.f41337a && Intrinsics.d(this.b, xqr0Var.b) && this.c.equals(xqr0Var.c) && this.d.equals(xqr0Var.d) && this.e == xqr0Var.e && Intrinsics.d(this.f, xqr0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, ua80.b(ua80.b(ua80.b(Long.hashCode(this.f41337a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f41337a, "TotoJackpotTiragChampModel(champId=", ", champName=", this.b);
        f140.v(sbO, ", champImage=", this.c, ", champCountryImage=", this.d);
        sbO.append(", champCountryId=");
        sbO.append(this.e);
        sbO.append(", champGameInfo=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
