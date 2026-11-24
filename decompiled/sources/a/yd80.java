package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42421a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public yd80(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.f42421a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd80)) {
            return false;
        }
        yd80 yd80Var = (yd80) obj;
        return Intrinsics.d(this.f42421a, yd80Var.f42421a) && Intrinsics.d(this.b, yd80Var.b) && this.c.equals(yd80Var.c) && this.d.equals(yd80Var.d) && this.e.equals(yd80Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f42421a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OutcomesCardTeamUiModel(firstTeamName=", this.f42421a, ", secondTeamName=", this.b, ", p1BulkPercentage=");
        f140.v(sbN, this.c, ", xBulkPercentage=", this.d, ", p2BulkPercentage=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
