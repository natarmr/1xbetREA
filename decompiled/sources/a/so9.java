package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class so9 {
    public static final ro9 Companion = new ro9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32535a;
    public final String b;
    public final String c;
    public final Boolean d;

    public /* synthetic */ so9(int i, Boolean bool, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f32535a = null;
        } else {
            this.f32535a = l;
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
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so9)) {
            return false;
        }
        so9 so9Var = (so9) obj;
        return Intrinsics.d(this.f32535a, so9Var.f32535a) && Intrinsics.d(this.b, so9Var.b) && Intrinsics.d(this.c, so9Var.c) && Intrinsics.d(this.d, so9Var.d);
    }

    public final int hashCode() {
        Long l = this.f32535a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f32535a, "CalendarTournamentTeamResponse(feedId=", ", name=", this.b, ", imageS3=");
        sbS.append(this.c);
        sbS.append(", isPartner=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
