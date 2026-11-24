package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gwj0 implements hwj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12031a;
    public final String b;
    public final double c;
    public final String d;
    public final String e;

    public gwj0(long j, String str, double d, String str2, String str3) {
        str3.getClass();
        this.f12031a = j;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwj0)) {
            return false;
        }
        gwj0 gwj0Var = (gwj0) obj;
        return this.f12031a == gwj0Var.f12031a && this.b.equals(gwj0Var.b) && Double.compare(this.c, gwj0Var.c) == 0 && this.d.equals(gwj0Var.d) && Intrinsics.d(this.e, gwj0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(brm0.d(this.c, ua80.b(Long.hashCode(this.f12031a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f12031a, "ShowSuccessMessage(balanceId=", ", totoTicket=", this.b);
        ohs0.A(sbO, this.c, ", betSum=", ", totoTypeName=");
        return ua80.m(sbO, this.d, ", currency=", this.e, Separators.RPAREN);
    }
}
