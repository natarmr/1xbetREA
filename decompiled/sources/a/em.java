package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class em {
    public static final dm Companion = new dm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8025a;
    public final String b;
    public final String c;

    public /* synthetic */ em(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f8025a = null;
        } else {
            this.f8025a = l;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        return Intrinsics.d(this.f8025a, emVar.f8025a) && Intrinsics.d(this.b, emVar.b) && Intrinsics.d(this.c, emVar.c);
    }

    public final int hashCode() {
        Long l = this.f8025a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f8025a, "ActiveTeamResponse(feedId=", ", name=", this.b, ", imageS3="), this.c, Separators.RPAREN);
    }
}
