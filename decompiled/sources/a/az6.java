package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class az6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1702a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public az6(int i, String str, String str2, String str3, String str4) {
        brm0.B(str2, str3, str4);
        this.f1702a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az6)) {
            return false;
        }
        az6 az6Var = (az6) obj;
        return this.f1702a.equals(az6Var.f1702a) && this.b == az6Var.b && Intrinsics.d(this.c, az6Var.c) && Intrinsics.d(this.d, az6Var.d) && Intrinsics.d(this.e, az6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(twn.a(this.b, this.f1702a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "BetGameInfoUiState(backgroundImageUrl=", this.f1702a, ", placeholderRes=", ", variantAmount=");
        f140.v(sbP, this.c, ", jackpotLabel=", this.d, ", variantLabel=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
