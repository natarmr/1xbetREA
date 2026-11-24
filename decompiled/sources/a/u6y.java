package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u6y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35160a;
    public final String b;
    public final String c;

    public u6y(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f35160a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6y)) {
            return false;
        }
        u6y u6yVar = (u6y) obj;
        return this.f35160a == u6yVar.f35160a && Intrinsics.d(this.b, u6yVar.b) && Intrinsics.d(this.c, u6yVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f35160a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f35160a, "JackpotPeriod(titleRes=", ", amount=", this.b, ", currencySymbol="), this.c, Separators.RPAREN);
    }
}
