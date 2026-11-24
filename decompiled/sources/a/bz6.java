package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3451a;
    public final int b;
    public final String c;

    public bz6(String str, int i, String str2) {
        str2.getClass();
        this.f3451a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz6)) {
            return false;
        }
        bz6 bz6Var = (bz6) obj;
        return this.f3451a.equals(bz6Var.f3451a) && this.b == bz6Var.b && Intrinsics.d(this.c, bz6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f3451a.hashCode() * 31, 31);
    }

    public final String toString() {
        return axq.n(kng0.p(this.b, "BetGameInfoUiState(backgroundImageUrl=", this.f3451a, ", placeholderRes=", ", jackpotLabel="), this.c, Separators.RPAREN);
    }
}
