package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k7y {
    public static final g7y Companion = new g7y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f17846a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final j7y e;
    public final Long f;

    public /* synthetic */ k7y(int i, Long l, Long l2, Long l3, Long l4, j7y j7yVar, Long l5) {
        if ((i & 1) == 0) {
            this.f17846a = null;
        } else {
            this.f17846a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = j7yVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7y)) {
            return false;
        }
        k7y k7yVar = (k7y) obj;
        return Intrinsics.d(this.f17846a, k7yVar.f17846a) && Intrinsics.d(this.b, k7yVar.b) && Intrinsics.d(this.c, k7yVar.c) && Intrinsics.d(this.d, k7yVar.d) && Intrinsics.d(this.e, k7yVar.e) && Intrinsics.d(this.f, k7yVar.f);
    }

    public final int hashCode() {
        Long l = this.f17846a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        j7y j7yVar = this.e;
        int iHashCode5 = (iHashCode4 + (j7yVar == null ? 0 : j7yVar.hashCode())) * 31;
        Long l5 = this.f;
        return iHashCode5 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f17846a, this.b, "JackpotResponse(timeBeforeHourJackpot=", ", timeBeforeDayJackpot=", ", timeBeforeWeekJackpot=");
        cs0.A(sbO, this.c, ", timeBeforeMonthJackpot=", this.d, ", jackpotSum=");
        sbO.append(this.e);
        sbO.append(", currencyId=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
