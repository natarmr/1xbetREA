package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r2b0 implements t2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29723a;
    public final String b;
    public final String c;

    public r2b0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f29723a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2b0)) {
            return false;
        }
        r2b0 r2b0Var = (r2b0) obj;
        return Intrinsics.d(this.f29723a, r2b0Var.f29723a) && Intrinsics.d(this.b, r2b0Var.b) && Intrinsics.d(this.c, r2b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f29723a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowFavoritesLimitErrorSnack(title=", this.f29723a, ", message=", this.b, ", positiveButtonText="), this.c, Separators.RPAREN);
    }
}
