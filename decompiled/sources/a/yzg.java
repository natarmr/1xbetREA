package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class yzg {
    public static final xzg Companion = new xzg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43512a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final Long f;
    public final Boolean g;

    public /* synthetic */ yzg(int i, Long l, Integer num, Integer num2, String str, String str2, Long l2, Boolean bool) {
        if ((i & 1) == 0) {
            this.f43512a = null;
        } else {
            this.f43512a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzg)) {
            return false;
        }
        yzg yzgVar = (yzg) obj;
        return Intrinsics.d(this.f43512a, yzgVar.f43512a) && Intrinsics.d(this.b, yzgVar.b) && Intrinsics.d(this.c, yzgVar.c) && Intrinsics.d(this.d, yzgVar.d) && Intrinsics.d(this.e, yzgVar.e) && Intrinsics.d(this.f, yzgVar.f) && Intrinsics.d(this.g, yzgVar.g);
    }

    public final int hashCode() {
        Long l = this.f43512a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f43512a, "CyberGamesOrganizationLeaderBoardResponse(feedId=", ", position=", ", year=");
        b1j.u(this.c, ", name=", this.d, ", imageS3=", sbQ);
        h97.w(this.f, this.e, ", earnings=", ", hasStat=", sbQ);
        return defpackage.c.e(sbQ, this.g, Separators.RPAREN);
    }
}
