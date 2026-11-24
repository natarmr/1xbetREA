package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jj0 {
    public static final ij0 Companion = new ij0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16598a;
    public final Integer b;
    public final String c;
    public final String d;
    public final pi0 e;

    public /* synthetic */ jj0(int i, Integer num, Integer num2, String str, String str2, pi0 pi0Var) {
        if ((i & 1) == 0) {
            this.f16598a = null;
        } else {
            this.f16598a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = pi0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj;
        return Intrinsics.d(this.f16598a, jj0Var.f16598a) && Intrinsics.d(this.b, jj0Var.b) && Intrinsics.d(this.c, jj0Var.c) && Intrinsics.d(this.d, jj0Var.d) && Intrinsics.d(this.e, jj0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f16598a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        pi0 pi0Var = this.e;
        return iHashCode4 + (pi0Var != null ? pi0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("AggregatorContentBlockResponse(id=", this.f16598a, ", typeId=", this.b, ", title=");
        f140.v(sbQ, this.c, ", titleType=", this.d, ", additionalData=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
