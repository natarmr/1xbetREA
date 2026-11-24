package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22742a;
    public final String b;
    public final String c;

    public n1b(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f22742a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1b)) {
            return false;
        }
        n1b n1bVar = (n1b) obj;
        return Intrinsics.d(this.f22742a, n1bVar.f22742a) && Intrinsics.d(this.b, n1bVar.b) && Intrinsics.d(this.c, n1bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f22742a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("BalanceUiModel(balanceName=", this.f22742a, ", money=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
