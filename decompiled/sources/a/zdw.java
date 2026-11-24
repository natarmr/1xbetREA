package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zdw {
    public static final ydw Companion = new ydw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44227a;
    public final String b;
    public final String c;
    public final Long d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ zdw(int i, Long l, String str, String str2, Long l2, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f44227a = null;
        } else {
            this.f44227a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdw)) {
            return false;
        }
        zdw zdwVar = (zdw) obj;
        return Intrinsics.d(this.f44227a, zdwVar.f44227a) && Intrinsics.d(this.b, zdwVar.b) && Intrinsics.d(this.c, zdwVar.c) && Intrinsics.d(this.d, zdwVar.d) && Intrinsics.d(this.e, zdwVar.e) && Intrinsics.d(this.f, zdwVar.f);
    }

    public final int hashCode() {
        Long l = this.f44227a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f44227a, "HltvAwardsPreviousWinnersResponse(id=", ", name=", this.b, ", playerImage=");
        h97.w(this.d, this.c, ", playerFeedId=", ", year=", sbS);
        return ua80.l(sbS, this.e, ", place=", this.f, Separators.RPAREN);
    }
}
