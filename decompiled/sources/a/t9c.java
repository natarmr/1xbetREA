package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class t9c {
    public static final s9c Companion = new s9c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33554a;
    public final Long b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final String h;
    public final Integer i;

    public /* synthetic */ t9c(int i, Long l, Long l2, String str, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4) {
        if ((i & 1) == 0) {
            this.f33554a = null;
        } else {
            this.f33554a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
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
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9c)) {
            return false;
        }
        t9c t9cVar = (t9c) obj;
        return Intrinsics.d(this.f33554a, t9cVar.f33554a) && Intrinsics.d(this.b, t9cVar.b) && Intrinsics.d(this.c, t9cVar.c) && Intrinsics.d(this.d, t9cVar.d) && Intrinsics.d(this.e, t9cVar.e) && Intrinsics.d(this.f, t9cVar.f) && Intrinsics.d(this.g, t9cVar.g) && Intrinsics.d(this.h, t9cVar.h) && Intrinsics.d(this.i, t9cVar.i);
    }

    public final int hashCode() {
        Long l = this.f33554a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.i;
        return iHashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f33554a, this.b, "ChessCellResponse(feedId=", ", dateStart=", ", id=");
        axq.x(this.d, this.c, ", score1=", ", score2=", sbO);
        rz4.y(sbO, this.e, ", status=", this.f, ", team1=");
        f140.v(sbO, this.g, ", team2=", this.h, ", winner=");
        return dw9.q(sbO, this.i, Separators.RPAREN);
    }
}
