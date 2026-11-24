package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fah {
    public static final eah Companion = new eah();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9207a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Integer e;

    public /* synthetic */ fah(int i, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        if ((i & 1) == 0) {
            this.f9207a = null;
        } else {
            this.f9207a = num;
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
            this.e = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fah)) {
            return false;
        }
        fah fahVar = (fah) obj;
        return Intrinsics.d(this.f9207a, fahVar.f9207a) && Intrinsics.d(this.b, fahVar.b) && Intrinsics.d(this.c, fahVar.c) && Intrinsics.d(this.d, fahVar.d) && Intrinsics.d(this.e, fahVar.e);
    }

    public final int hashCode() {
        Integer num = this.f9207a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.e;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberPeriodScoresResponse(period=", this.f9207a, ", scoreOpp1=", this.b, ", scoreOpp2=");
        b1j.u(this.c, ", periodName=", this.d, ", winner=", sbQ);
        return dw9.q(sbQ, this.e, Separators.RPAREN);
    }
}
