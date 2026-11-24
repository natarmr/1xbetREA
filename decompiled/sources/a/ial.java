package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ial {
    public static final hal Companion = new hal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f14443a;
    public final String b;
    public final Long c;
    public final String d;

    public /* synthetic */ ial(int i, Long l, String str, Long l2, String str2) {
        if ((i & 1) == 0) {
            this.f14443a = null;
        } else {
            this.f14443a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ial)) {
            return false;
        }
        ial ialVar = (ial) obj;
        return Intrinsics.d(this.f14443a, ialVar.f14443a) && Intrinsics.d(this.b, ialVar.b) && Intrinsics.d(this.c, ialVar.c) && Intrinsics.d(this.d, ialVar.d);
    }

    public final int hashCode() {
        Long l = this.f14443a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f14443a, "DotaTeamsLeaderBoardResponse(feedId=", ", name=", this.b, ", points=");
        sbS.append(this.c);
        sbS.append(", imageS3=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
