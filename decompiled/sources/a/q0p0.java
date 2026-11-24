package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q0p0 implements s0p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27913a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;

    public q0p0(Integer num, Integer num2, Integer num3, String str, String str2) {
        this.f27913a = num;
        this.b = num2;
        this.c = num3;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0p0)) {
            return false;
        }
        q0p0 q0p0Var = (q0p0) obj;
        return Intrinsics.d(this.f27913a, q0p0Var.f27913a) && Intrinsics.d(this.b, q0p0Var.b) && Intrinsics.d(this.c, q0p0Var.c) && Intrinsics.d(this.d, q0p0Var.d) && Intrinsics.d(this.e, q0p0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f27913a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("Hockey(diffGoals=", this.f27913a, ", goals5=", this.b, ", totalGoals2=");
        b1j.u(this.c, ", winFirst=", this.d, ", lossFirst=", sbQ);
        return axq.n(sbQ, this.e, Separators.RPAREN);
    }
}
