package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zd6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44197a;
    public final String b;
    public final boolean c;

    public zd6(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f44197a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd6)) {
            return false;
        }
        zd6 zd6Var = (zd6) obj;
        return Intrinsics.d(this.f44197a, zd6Var.f44197a) && Intrinsics.d(this.b, zd6Var.b) && this.c == zd6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f44197a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("BetAmountBlockInfoUiState(errorText=", this.f44197a, ", helperText=", this.b, ", vipBet="), this.c, Separators.RPAREN);
    }
}
