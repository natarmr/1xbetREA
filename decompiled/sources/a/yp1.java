package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43009a;
    public final String b;
    public final String c;
    public final String d;
    public final dq1 e;

    public yp1(long j, String str, String str2, String str3, dq1 dq1Var) {
        str.getClass();
        str2.getClass();
        this.f43009a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = dq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp1)) {
            return false;
        }
        yp1 yp1Var = (yp1) obj;
        return this.f43009a == yp1Var.f43009a && Intrinsics.d(this.b, yp1Var.b) && Intrinsics.d(this.c, yp1Var.c) && this.d.equals(yp1Var.d) && this.e.equals(yp1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f43009a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43009a, "AggregatorSpecialBannerModel(id=", ", title=", this.b);
        f140.v(sbO, ", description=", this.c, ", imageUrl=", this.d);
        sbO.append(", navigation=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
