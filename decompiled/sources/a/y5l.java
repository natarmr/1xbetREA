package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class y5l {
    public static final x5l Companion = new x5l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42053a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;

    public /* synthetic */ y5l(int i, String str, Integer num, String str2, String str3, Long l, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f42053a = null;
        } else {
            this.f42053a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5l)) {
            return false;
        }
        y5l y5lVar = (y5l) obj;
        return Intrinsics.d(this.f42053a, y5lVar.f42053a) && Intrinsics.d(this.b, y5lVar.b) && Intrinsics.d(this.c, y5lVar.c) && Intrinsics.d(this.d, y5lVar.d) && Intrinsics.d(this.e, y5lVar.e) && Intrinsics.d(this.f, y5lVar.f) && Intrinsics.d(this.g, y5lVar.g);
    }

    public final int hashCode() {
        String str = this.f42053a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "DotaPlayersLeaderBoardResponse(region=", this.f42053a, ", rank=", ", name=");
        f140.v(sbP, this.c, ", imageS3=", this.d, ", teamFeedId=");
        rz4.v(this.e, ", teamName=", this.f, ", teamImageS3=", sbP);
        return axq.n(sbP, this.g, Separators.RPAREN);
    }
}
