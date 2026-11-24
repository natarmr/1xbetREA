package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class xft0 {
    public static final wft0 Companion = new wft0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40809a;
    public final Long b;
    public final Integer c;
    public final Long d;
    public final String e;
    public final String f;

    public /* synthetic */ xft0(int i, String str, Long l, Integer num, Long l2, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f40809a = null;
        } else {
            this.f40809a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xft0)) {
            return false;
        }
        xft0 xft0Var = (xft0) obj;
        return Intrinsics.d(this.f40809a, xft0Var.f40809a) && Intrinsics.d(this.b, xft0Var.b) && Intrinsics.d(this.c, xft0Var.c) && Intrinsics.d(this.d, xft0Var.d) && Intrinsics.d(this.e, xft0Var.e) && Intrinsics.d(this.f, xft0Var.f);
    }

    public final int hashCode() {
        String str = this.f40809a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "UpcomingEventResponse(id=", this.f40809a, ", feedGameId=", ", status=");
        cs0.w(this.c, this.d, ", dateStartInSecondsUnixTime=", ", teamOneId=", sbS);
        return ua80.m(sbS, this.e, ", teamTwoId=", this.f, Separators.RPAREN);
    }
}
