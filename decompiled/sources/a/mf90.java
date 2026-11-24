package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class mf90 {
    public static final kf90 Companion = new kf90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21684a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final Integer f;

    public /* synthetic */ mf90(int i, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21684a = null;
        } else {
            this.f21684a = num;
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
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf90)) {
            return false;
        }
        mf90 mf90Var = (mf90) obj;
        return Intrinsics.d(this.f21684a, mf90Var.f21684a) && Intrinsics.d(this.b, mf90Var.b) && Intrinsics.d(this.c, mf90Var.c) && Intrinsics.d(this.d, mf90Var.d) && Intrinsics.d(this.e, mf90Var.e) && Intrinsics.d(this.f, mf90Var.f);
    }

    public final int hashCode() {
        Integer num = this.f21684a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.f;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("PeriodScoresResponse(period=", this.f21684a, ", scoreOpp1=", this.b, ", scoreOpp2=");
        b1j.u(this.c, ", periodName=", this.d, ", periodNameFull=", sbQ);
        return vqd.l(this.f, this.e, ", winner=", Separators.RPAREN, sbQ);
    }
}
