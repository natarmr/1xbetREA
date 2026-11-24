package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mc10 {
    public static final lc10 Companion = new lc10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21530a;
    public final Double b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Long i;

    public /* synthetic */ mc10(int i, Long l, Double d, String str, Integer num, String str2, String str3, Integer num2, Integer num3, Long l2) {
        if ((i & 1) == 0) {
            this.f21530a = null;
        } else {
            this.f21530a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
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
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc10)) {
            return false;
        }
        mc10 mc10Var = (mc10) obj;
        return Intrinsics.d(this.f21530a, mc10Var.f21530a) && Intrinsics.d(this.b, mc10Var.b) && Intrinsics.d(this.c, mc10Var.c) && Intrinsics.d(this.d, mc10Var.d) && Intrinsics.d(this.e, mc10Var.e) && Intrinsics.d(this.f, mc10Var.f) && Intrinsics.d(this.g, mc10Var.g) && Intrinsics.d(this.h, mc10Var.h) && Intrinsics.d(this.i, mc10Var.i);
    }

    public final int hashCode() {
        Long l = this.f21530a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.i;
        return iHashCode8 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottoBetHistoryItemResponse(dateTimestamp=");
        sb.append(this.f21530a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", currency=");
        axq.x(this.d, this.c, ", gameId=", ", gameName=", sb);
        f140.v(sb, this.e, ", gameType=", this.f, ", gameTypeId=");
        rz4.y(sb, this.g, ", actionId=", this.h, ", transactionId=");
        return ohs0.r(sb, this.i, Separators.RPAREN);
    }
}
