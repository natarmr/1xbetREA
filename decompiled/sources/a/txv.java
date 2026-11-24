package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class txv implements iqg {
    public static final sxv Companion = new sxv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34722a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ txv(int i, Boolean bool, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f34722a = null;
        } else {
            this.f34722a = num;
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
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txv)) {
            return false;
        }
        txv txvVar = (txv) obj;
        return Intrinsics.d(this.f34722a, txvVar.f34722a) && Intrinsics.d(this.b, txvVar.b) && Intrinsics.d(this.c, txvVar.c) && Intrinsics.d(this.d, txvVar.d) && Intrinsics.d(this.e, txvVar.e);
    }

    public final int hashCode() {
        Integer num = this.f34722a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("HigherVsLowerResponse(firstPlayerScore=", this.f34722a, ", secondPlayerScore=", this.b, ", firstPlayerRoundScore=");
        f140.v(sbQ, this.c, ", secondPlayerRoundScore=", this.d, ", gameIsFinish=");
        return defpackage.c.e(sbQ, this.e, Separators.RPAREN);
    }

    public txv() {
        this.f34722a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
