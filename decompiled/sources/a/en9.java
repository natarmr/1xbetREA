package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class en9 {
    public static final dn9 Companion = new dn9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8082a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Boolean e;

    public /* synthetic */ en9(int i, Boolean bool, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f8082a = null;
        } else {
            this.f8082a = l;
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
            this.d = num;
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
        if (!(obj instanceof en9)) {
            return false;
        }
        en9 en9Var = (en9) obj;
        return Intrinsics.d(this.f8082a, en9Var.f8082a) && Intrinsics.d(this.b, en9Var.b) && Intrinsics.d(this.c, en9Var.c) && Intrinsics.d(this.d, en9Var.d) && Intrinsics.d(this.e, en9Var.e);
    }

    public final int hashCode() {
        Long l = this.f8082a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f8082a, "CalendarTournamentMatchTeamResponse(feedId=", ", name=", this.b, ", imageS3=");
        axq.x(this.d, this.c, ", score=", ", isWinner=", sbS);
        return defpackage.c.e(sbS, this.e, Separators.RPAREN);
    }
}
