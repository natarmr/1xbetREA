package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ewa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8512a;
    public final String b;
    public final String c;

    public ewa(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f8512a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewa)) {
            return false;
        }
        ewa ewaVar = (ewa) obj;
        return Intrinsics.d(this.f8512a, ewaVar.f8512a) && this.b.equals(ewaVar.b) && Intrinsics.d(this.c, ewaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f8512a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("CashbackBalanceState(balanceName=", this.f8512a, ", money=", this.b, ", currency="), this.c, Separators.RPAREN);
    }
}
