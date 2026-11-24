package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ndw {
    public static final mdw Companion = new mdw();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23354a;
    public final String b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;

    static {
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new ldv((byte) 29)), maz.a(wezVar, new kdw((byte) 0))};
    }

    public /* synthetic */ ndw(int i2, Long l, String str, Long l2, Long l3, String str2, String str3, List list, List list2) {
        if ((i2 & 1) == 0) {
            this.f23354a = null;
        } else {
            this.f23354a = l;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndw)) {
            return false;
        }
        ndw ndwVar = (ndw) obj;
        return Intrinsics.d(this.f23354a, ndwVar.f23354a) && Intrinsics.d(this.b, ndwVar.b) && Intrinsics.d(this.c, ndwVar.c) && Intrinsics.d(this.d, ndwVar.d) && Intrinsics.d(this.e, ndwVar.e) && Intrinsics.d(this.f, ndwVar.f) && Intrinsics.d(this.g, ndwVar.g) && Intrinsics.d(this.h, ndwVar.h);
    }

    public final int hashCode() {
        Long l = this.f23354a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f23354a, "HltvAwardsNominationResponse(id=", ", title=", this.b, ", feedGameId=");
        cs0.A(sbS, this.c, ", marketId=", this.d, ", nominationLogo=");
        f140.v(sbS, this.e, ", nominationImage=", this.f, ", nominees=");
        return kng0.n(", previousWinners=", Separators.RPAREN, sbS, this.g, this.h);
    }
}
