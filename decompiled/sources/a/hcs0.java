package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hcs0 {
    public static final gcs0 Companion = new gcs0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12841a;
    public final String b;
    public final String c;
    public final Long d;

    public /* synthetic */ hcs0(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f12841a = null;
        } else {
            this.f12841a = num;
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
            this.d = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcs0)) {
            return false;
        }
        hcs0 hcs0Var = (hcs0) obj;
        return Intrinsics.d(this.f12841a, hcs0Var.f12841a) && Intrinsics.d(this.b, hcs0Var.b) && Intrinsics.d(this.c, hcs0Var.c) && Intrinsics.d(this.d, hcs0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f12841a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f12841a, "TrackMessageResponse(messageId=", ", userId=", this.b, ", trackerType=");
        sbN.append(this.c);
        sbN.append(", createdAt=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
