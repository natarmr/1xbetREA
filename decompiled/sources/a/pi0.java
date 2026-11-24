package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pi0 {
    public static final oi0 Companion = new oi0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27022a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Boolean e;
    public final String f;

    public /* synthetic */ pi0(int i, Integer num, Integer num2, Integer num3, String str, Boolean bool, String str2) {
        if ((i & 1) == 0) {
            this.f27022a = null;
        } else {
            this.f27022a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        return Intrinsics.d(this.f27022a, pi0Var.f27022a) && Intrinsics.d(this.b, pi0Var.b) && Intrinsics.d(this.c, pi0Var.c) && Intrinsics.d(this.d, pi0Var.d) && Intrinsics.d(this.e, pi0Var.e) && Intrinsics.d(this.f, pi0Var.f);
    }

    public final int hashCode() {
        Integer num = this.f27022a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("AggregatorContentBlockAdditionalDataResponse(limit=", this.f27022a, ", partId=", this.b, ", categoryId=");
        b1j.u(this.c, ", filterType=", this.d, ", isInfinite=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", miniatureType=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
