package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nf90 {
    public static final lf90 Companion = new lf90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f23424a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;

    public /* synthetic */ nf90(int i, Integer num, Integer num2, Integer num3, String str, String str2) {
        if ((i & 1) == 0) {
            this.f23424a = null;
        } else {
            this.f23424a = num;
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
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf90)) {
            return false;
        }
        nf90 nf90Var = (nf90) obj;
        return Intrinsics.d(this.f23424a, nf90Var.f23424a) && Intrinsics.d(this.b, nf90Var.b) && Intrinsics.d(this.c, nf90Var.c) && Intrinsics.d(this.d, nf90Var.d) && Intrinsics.d(this.e, nf90Var.e);
    }

    public final int hashCode() {
        Integer num = this.f23424a;
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
        StringBuilder sbQ = hne.q("PeriodScoresResponse(period=", this.f23424a, ", scoreOpp1=", this.b, ", scoreOpp2=");
        b1j.u(this.c, ", periodName=", this.d, ", periodNameFull=", sbQ);
        return axq.n(sbQ, this.e, Separators.RPAREN);
    }
}
