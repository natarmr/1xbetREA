package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bsw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3153a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;

    public bsw(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        str2.getClass();
        str5.getClass();
        this.f3153a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsw)) {
            return false;
        }
        bsw bswVar = (bsw) obj;
        return this.f3153a.equals(bswVar.f3153a) && Intrinsics.d(this.b, bswVar.b) && this.c.equals(bswVar.c) && this.d.equals(bswVar.d) && Intrinsics.d(this.e, bswVar.e) && this.f.equals(bswVar.f) && znq0.e(this.g, bswVar.g);
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f3153a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strH = znq0.h(this.g);
        StringBuilder sbN = b1j.n("HostVsGuestsItemModel(oneTeamName=", this.f3153a, ", oneTeamScore=", this.b, ", oneTeamImageUrl=");
        f140.v(sbN, this.c, ", twoTeamName=", this.d, ", twoTeamScore=");
        f140.v(sbN, this.e, ", twoTeamImageUrl=", this.f, ", startMatchDate=");
        return axq.n(sbN, strH, Separators.RPAREN);
    }
}
