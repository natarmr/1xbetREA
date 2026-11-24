package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fvu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10232a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public fvu0(int i, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f10232a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvu0)) {
            return false;
        }
        fvu0 fvu0Var = (fvu0) obj;
        return Intrinsics.d(this.f10232a, fvu0Var.f10232a) && Intrinsics.d(this.b, fvu0Var.b) && this.c == fvu0Var.c && this.d == fvu0Var.d && this.e == fvu0Var.e;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "VOLLEYBALL_ROUND_HEADER_KEY";
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e(brm0.e(ua80.b(ua80.b(-686720721, 31, this.f10232a), 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("VolleyballStatisticHeaderUiModel(key=VOLLEYBALL_ROUND_HEADER_KEY, firstTeamName=", this.f10232a, ", secondTeamName=", this.b, ", serveFirst=");
        ua80.u(", serveSecond=", ", background=", sbN, this.c, this.d);
        return rz4.j(this.e, Separators.RPAREN, sbN);
    }
}
