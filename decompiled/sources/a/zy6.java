package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45190a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public zy6(int i, String str, String str2, String str3, String str4) {
        brm0.B(str2, str3, str4);
        this.f45190a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy6)) {
            return false;
        }
        zy6 zy6Var = (zy6) obj;
        return this.f45190a.equals(zy6Var.f45190a) && this.b == zy6Var.b && Intrinsics.d(this.c, zy6Var.c) && Intrinsics.d(this.d, zy6Var.d) && Intrinsics.d(this.e, zy6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(twn.a(this.b, this.f45190a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "BetGameInfoUiState(backgroundImageUrl=", this.f45190a, ", placeholderRes=", ", variantAmount=");
        f140.v(sbP, this.c, ", jackpotLabel=", this.d, ", variantLabel=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
