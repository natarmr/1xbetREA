package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class dss {
    public static final css Companion = new css();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6627a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;

    public /* synthetic */ dss(int i, Boolean bool, String str, String str2, Integer num, Integer num2, Boolean bool2, Boolean bool3, Boolean bool4) {
        if ((i & 1) == 0) {
            this.f6627a = null;
        } else {
            this.f6627a = bool;
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
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dss)) {
            return false;
        }
        dss dssVar = (dss) obj;
        return Intrinsics.d(this.f6627a, dssVar.f6627a) && Intrinsics.d(this.b, dssVar.b) && Intrinsics.d(this.c, dssVar.c) && Intrinsics.d(this.d, dssVar.d) && Intrinsics.d(this.e, dssVar.e) && Intrinsics.d(this.f, dssVar.f) && Intrinsics.d(this.g, dssVar.g) && Intrinsics.d(this.h, dssVar.h);
    }

    public final int hashCode() {
        Boolean bool = this.f6627a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.h;
        return iHashCode7 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameStatisticInfoResponse(hasStatRatingTables=");
        sb.append(this.f6627a);
        sb.append(", gameId=");
        sb.append(this.b);
        sb.append(", stageId=");
        axq.x(this.d, this.c, ", stageType=", ", status=", sb);
        brm0.z(this.f, this.e, ", hasLineUps=", ", hasStadiumInfo=", sb);
        sb.append(this.g);
        sb.append(", hasStatEvents=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
