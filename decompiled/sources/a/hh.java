package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hh {
    public static final gh Companion = new gh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13037a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Boolean g;

    public /* synthetic */ hh(int i, String str, String str2, Long l, String str3, String str4, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.f13037a = null;
        } else {
            this.f13037a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
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
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        return Intrinsics.d(this.f13037a, hhVar.f13037a) && Intrinsics.d(this.b, hhVar.b) && Intrinsics.d(this.c, hhVar.c) && Intrinsics.d(this.d, hhVar.d) && Intrinsics.d(this.e, hhVar.e) && Intrinsics.d(this.f, hhVar.f) && Intrinsics.d(this.g, hhVar.g);
    }

    public final int hashCode() {
        String str = this.f13037a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AchievementResponse(name=", this.f13037a, ", image=", this.b, ", dateTimestamp=");
        rz4.v(this.c, ", tier=", this.d, ", place=", sbN);
        axq.x(this.f, this.e, ", prize=", ", lngSideLeft=", sbN);
        return defpackage.c.e(sbN, this.g, Separators.RPAREN);
    }
}
